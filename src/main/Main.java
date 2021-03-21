package main;
import model.*;

import java.util.Date;

import enums.*;
import service.*;

public class Main {

	public static void main(String[] args) {
		Date testDate = new Date();
		
		AirportService.addNewPassenger("Rihards", "Audze", "12345", IdenType.PASSPORT, Nationality.LATVIAN, true, "None");
		AirportService.addNewPassenger("Jānis", "Bērziņš", "23456", IdenType.IDCARD, Nationality.LATVIAN, false, "None");
		AirportService.addNewPassenger("Juris", "Ozoliņš", "88884", IdenType.PASSPORT, Nationality.LATVIAN, false, "None");
		
		AirportService.addNewAirport(AirportName.RIGA, 150);
		AirportService.addNewAirport(AirportName.OSLO, 250);
		AirportService.addNewAirport(AirportName.TALLINN, 200);
		
		AirportService.addNewBoardingPass(AirportService.allPassengers.get(0));
		AirportService.addNewBoardingPass(AirportService.allPassengers.get(1));
		AirportService.addNewBoardingPass(AirportService.allPassengers.get(2));
		
		AirportService.addNewFlight(AirportService.allAirports.get(0), AirportService.allAirports.get(1), testDate, (byte)10);
		AirportService.addNewFlight(AirportService.allAirports.get(1), AirportService.allAirports.get(2), testDate, (byte)12);
		AirportService.addNewFlight(AirportService.allAirports.get(2), AirportService.allAirports.get(0), testDate, (byte)8);	
		
	}
}