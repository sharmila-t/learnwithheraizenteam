package com.heraizen.cj.remotes;

public class RemoteControlMain {

	public static void main(String[] args) {
		RemoteControl controllerDvD = new DVD(15);
		RemoteControl controllerTv = new TV(20);
		System.out.println();
		if(controllerDvD.poweronOff()) {
			System.out.println("DVD Switched on");
		}else {
			System.out.println("DVD Switched off");
		}
		controllerDvD.volumeDown(5);
		controllerDvD.volumeUp(10);

		System.out.println();

		if(controllerTv.poweronOff()) {
			System.out.println("DVD Switched on");
		}else {
			System.out.println("DVD Switched off");
		}
		controllerTv.volumeDown(5);
		controllerTv.volumeUp(10);

	}

}
