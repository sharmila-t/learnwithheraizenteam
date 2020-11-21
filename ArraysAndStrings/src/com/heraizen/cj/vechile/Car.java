package com.heraizen.cj.vechile;

public class Car implements Game {

	@Override
	public void start() {
		System.out.println("Car is start mode");
	}

	@Override
	public void play() {

		System.out.println("Car is running mode");
	}

	@Override
	public void stop() {
		System.out.println("Car is running mode");
	}

}
