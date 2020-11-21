package com.heraizen.cj.vechile;

import java.util.concurrent.ThreadLocalRandom;

public class VechileMain {

	public static void main(String[] args) {
		Game[] game = getRandomGames(10);
		for (Game g : game) {
			g.play();
			g.start();
			g.stop();
			System.out.println("-----------------------------------------");

		}

	}

	private static Game[] getRandomGames(int size) {
		Game[] gameArr = new Game[size];
		for (int i = 0; i < size; i++) {
			int random = ThreadLocalRandom.current().nextInt(1, 4);
			switch (random) {
			case 1:
				gameArr[i] = new Car();

				break;
			case 2:
				gameArr[i] = new Bike();
				break;
			case 3:
				gameArr[i] = new BiCycle();
				break;

			default:
				throw new IllegalArgumentException("Unexpected value" + random);
			}

		}
		return gameArr;
	}

}
