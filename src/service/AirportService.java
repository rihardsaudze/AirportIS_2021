package service;
import model.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.PriorityQueue;

import enums.AirportName;
import enums.IdenType;
import enums.Nationality;

public class AirportService {
	public static ArrayList<Passenger> allPassengers;
	public static ArrayList<BoardingPass> allBoardingPasses;
	public static ArrayList<Airport> allAirports;
	public static ArrayList<Flight> allFlights;
	
	public static boolean addNewPassenger(String name, String surname, String idenNr, IdenType idType, Nationality nation, boolean isAdult, String extraNeeds) {
		Passenger tempPassenger = new Passenger(name, surname, idenNr, idType, nation, isAdult, extraNeeds);
		allPassengers.add(tempPassenger);
		return true;
	}
	
	public static boolean addNewVipPassenger(String name, String surname, String idenNr, IdenType idType, Nationality nation, boolean isAdult, String extraNeeds, String loungeCardNr) {
		VipPassenger tempPassenger = new VipPassenger(name, surname, idenNr, idType, nation, isAdult, extraNeeds, loungeCardNr);
		allPassengers.add(tempPassenger);
		return true;
	}
	
	public static boolean addNewAirport(AirportName name, int capacity) {
		Airport tempAirport = new Airport(name, capacity);
		allAirports.add(tempAirport);
		return true;
	}
	
	public static boolean addNewBoardingPass(Passenger passenger) {
		BoardingPass tempBoardPass = new BoardingPass(passenger);
		allBoardingPasses.add(tempBoardPass);
		return true;
	}
	
	public static boolean addNewFlight(Airport from, Airport to, Date date, byte duration) {
		Flight tempFlight = new Flight(from, to, date, duration);
		allFlights.add(tempFlight);
		return true;
	}
	
	public static boolean deletePassengerByNameAndSurname(String name, String surname) {
		for (Passenger p : allPassengers) {
			if (p.getName() == name && p.getSurname() == surname) {
				allPassengers.remove(allPassengers.indexOf(p));
				return true;
			}
		}
		return false;
	}
	
	public static boolean deletePassengerByIdenNr(String nr) {
		for (Passenger p : allPassengers) {
			if (p.getIdenNr() == nr) {
				allPassengers.remove(allPassengers.indexOf(p));
				return true;
			}
		}
		return false;
	}
	
	public static boolean deleteVipPassengerVipNr(int nr) {
		for (Passenger p : allPassengers) {
			if (p instanceof VipPassenger) {
				if (((VipPassenger) p).getVipNr() == nr) {
					allPassengers.remove(allPassengers.indexOf(p));
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean deleteAirportByAirportNr(String nr) {
		for (Airport a : allAirports) {
			if (a.getAirportNr() == nr) {
				allAirports.remove(allAirports.indexOf(a));
				return true;
			}
		}
		return false;
	}
	
	public static boolean deleteAirportByAirportName(AirportName name) {
		for (Airport a : allAirports) {
			if (a.getName() == name) {
				allAirports.remove(allAirports.indexOf(a));
				return true;
			}
		}
		return false;
	}
	
	public static boolean deleteBoardingPassByBoardingPassNr(String nr) {
		for (BoardingPass b : allBoardingPasses) {
			if (b.getNr() == nr) {
				allBoardingPasses.remove(allBoardingPasses.indexOf(b));
				return true;
			}
		}
		return false;
	}
	
	public static boolean deleteFlightInAirportByNr(AirportName name, int nr) {
		for (Flight f : allFlights) {
			if (f.getAirportFrom().getName() == name && f.getFlightNr() == nr) {
				allFlights.remove(allFlights.indexOf(f));
				return true;
			}
		}
		return false;
	}
	
	public static boolean addRegularPassengerInFlight(AirportName name, int flightNr, String passengerId) {
		Passenger tempPassenger = null;
		Flight tempFlight = null;
		BoardingPass tempBoardPass = null;
		for (Passenger p : allPassengers) {
			if (p.getIdenNr() == passengerId) {
				tempPassenger = p;
				break;
			} 
		}
		if (tempPassenger == null) {
			return false;
		}
		
		for (Flight f : allFlights) {
			if (f.getFlightNr() == flightNr) {
				tempFlight = f;
				break;
			} 
		}
		if (tempFlight == null) {
			return false;
		}
		
		for (BoardingPass b : allBoardingPasses) {
			if (b.getPassenger() == tempPassenger) {
				tempBoardPass = b;
				break;
			}
		}
		if (tempBoardPass == null) {
			return false;
		}
		
		PriorityQueue<BoardingPass> allFlightPassengers = tempFlight.getAllPassengers();
		allFlightPassengers.add(tempBoardPass);
		return true;
	}
	
	public static boolean addVipPassengerInFlight(AirportName name, int flightNr, String passengerId) {
		Passenger tempPassenger = null;
		Flight tempFlight = null;
		BoardingPass tempBoardPass = null;
		for (Passenger p : allPassengers) {
			if (p instanceof VipPassenger && p.getIdenNr() == passengerId) {
				tempPassenger = p;
				break;
			} 
		}
		if (tempPassenger == null) {
			return false;
		}
		
		for (Flight f : allFlights) {
			if (f.getFlightNr() == flightNr) {
				tempFlight = f;
				break;
			} 
		}
		if (tempFlight == null) {
			return false;
		}
		
		for (BoardingPass b : allBoardingPasses) {
			if (b.getPassenger() == tempPassenger) {
				tempBoardPass = b;
				break;
			}
		}
		if (tempBoardPass == null) {
			return false;
		}
		
		PriorityQueue<BoardingPass> allFlightPassengers = tempFlight.getAllPassengers();
		allFlightPassengers.add(tempBoardPass);
		return true;
	}
	
	public static void showAllPassengersInFlight(AirportName name, int flightNr) {
		Flight tempFlight = null;
		for (Flight f : allFlights) {
			if (f.getAirportFrom().getName() == name && f.getFlightNr() == flightNr) {
				tempFlight = f;
			}
		}
		if (tempFlight == null) {
			return;
		}
		for (BoardingPass b : tempFlight.getAllPassengers()) {
			System.out.println(b.getPassenger().toString());
		}
	}
	
	public static void showOnlyVipPassengersInFlight(AirportName name, int flightNr) {
		Flight tempFlight = null;
		for (Flight f : allFlights) {
			if (f.getAirportFrom().getName() == name && f.getFlightNr() == flightNr) {
				tempFlight = f;
				break;
			}
		}
		if (tempFlight == null) {
			return;
		}
		for (BoardingPass b : tempFlight.getAllPassengers()) {
			if (b.getPassenger() instanceof VipPassenger) {
				System.out.println(b.getPassenger().toString());
			}
		}
	}
	
	public static void showAllFlightsFromAirport(AirportName name) {
		Airport tempAirport = null;
		for (Airport a : allAirports) {
			if (a.getName() == name) {
				tempAirport = a;
				break;
			}
		}
		if (tempAirport == null) {
			return;
		}
		for (Flight f : allFlights) {
			if (f.getAirportFrom() == tempAirport) {
				System.out.println(f.toString());
			}
		}
	}
	
	
	
	
}