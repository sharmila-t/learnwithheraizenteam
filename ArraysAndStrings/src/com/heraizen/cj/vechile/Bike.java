package com.heraizen.cj.vechile;

public class Bike implements Game {

	@Override
	public void start() {
		System.out.println("Bike is start mode");
	}

	@Override
	public void play() {
		System.out.println("Bike is Running mode");
	}

	@Override
	public void stop() {
		System.out.println("Bike is Stop mode");
	}

}
