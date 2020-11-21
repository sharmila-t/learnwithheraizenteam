package com.heraizen.cj.remotes;

public interface RemoteControl {
	boolean poweronOff();

	int volumeUp(int increement);

	int volumeDown(int decreement);

	void mute();

}
