package com.heraizen.cj.remotes;

public class TV implements RemoteControl {
	final int MAX_SOUND;
	final int MIN_SOUND;
	boolean power;
	int currentVol;

	TV(int volume) {
		MAX_SOUND = 50;
		MIN_SOUND = 10;
		power = false;
		currentVol = volume;
		System.out.println("Current volume level in TV is " + currentVol);
	}

	@Override
	public boolean poweronOff() {
		power = !power;
		System.out.println(power ? "on" : "off");
		return power;
	}

	@Override
	public int volumeUp(int increement) {
		if((currentVol + increement) > MAX_SOUND) {
			System.out.println("Volume Goes Max");
			currentVol = MAX_SOUND;
		}else {
			currentVol += increement;
		}
		System.out.println("Current volume level in TV is "+currentVol);
		return currentVol;
	}

	@Override
	public int volumeDown(int decreement) {
		if((currentVol >= decreement ?currentVol - decreement: decreement - currentVol) < MIN_SOUND) {
			System.out.println("Volume Goes Minimum");
			currentVol = MIN_SOUND;
		}else {
			currentVol = currentVol >= decreement ?currentVol - decreement: decreement - currentVol;
		}
		System.out.println("Current volume level in TV is "+currentVol);
		return currentVol;
	}

	@Override
	public void mute() {
		System.out.println("Tv in mute Status");

	}

}
