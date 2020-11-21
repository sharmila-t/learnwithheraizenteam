package com.heraizen.cj.vechile;

public class BiCycle implements Game {

	@Override
	public void start() {
		System.out.println("Bicycle is start mode");
	}

	@Override
	public void play() {
		System.out.println("Bicycle is running mode");
	}

	@Override
	public void stop() {
		System.out.println("Bicycle is stop mode");
	}

}
