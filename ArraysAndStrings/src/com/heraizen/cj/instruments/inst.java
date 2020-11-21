package com.heraizen.cj.instruments;

public class inst {
	public static void main(String[] args) {
		Instrument instrumentArr[] = new Instrument[10];
		instrumentArr[0] = new Guitar();
		instrumentArr[1] = new Piano();
		instrumentArr[2] = new Flute();
		instrumentArr[3] = new Guitar();
		instrumentArr[4] = new Flute();
		instrumentArr[5] = new Piano();
		instrumentArr[6] = new Flute();
		instrumentArr[7] = new Piano();
		instrumentArr[8] = new Flute();
		instrumentArr[9] = new Guitar();
		for (Instrument instrument : instrumentArr) {
			instrument.display();

		}

	}

}
