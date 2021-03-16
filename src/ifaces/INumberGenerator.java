package ifaces;

import java.util.Random;

public interface INumberGenerator {
	public default int generateNr(String args) {
		Random rand = new Random();
		if (args == "test") {
			return rand.nextInt(9) + 1;
		}
		return 0;
	}
}
