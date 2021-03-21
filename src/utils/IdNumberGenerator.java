package utils;

import java.util.Random;

public class IdNumberGenerator {
	public static int generateNr(String args) {
		Random rand = new Random();
		if (args == "airportNr") {
			return rand.nextInt(90) + 10;	//10 to 99
		} else if (args == "groupNr") {
			return rand.nextInt(4) + 2;		//2 to 5
		} else if (args == "rowNr") {
			return rand.nextInt(7);			//0 to 6
		} else if (args == "seatNrVip") {
			return rand.nextInt(3) + 1;		//1 to 3
		} else if (args == "seatNr") {
			return rand.nextInt(8) + 3;		//3 to 10
		}
		return 0;
	}
}
