
//Welcome to Yilong's first attempt at making a metro manager
//This program will display the id of the metro, train current station, its current location, and the number of passengers it holds upon its arrival.
//It also displays the number of people getting off and the number of people getting on the metro at the current station.
//It will display a full report which will show the station which it is at, the number of passengers in the metro when it arrived at the station,
//the number of passengers that got off, the number of passengers that got on, and the final number of passengers in the metro before it departs for the next station 
public class Assignment1part2 
{
	public static void main(String [] args)
	{
		// I declared my variables in this paragraph
		int numberOfMetroTrain = 123;
		int stationOfMetroTrain = 7;
		int numberOfPassengers = 110;
		int numberOfPassengersGettingOff = 16;
		int numberOfPassengersGettingOn = 59;
		int totalNumberOfPassengers = numberOfPassengers - numberOfPassengersGettingOff + numberOfPassengersGettingOn ;
		int convNextStationOfMetroTrain = 1;
		int nextStationOfMetroTrain = stationOfMetroTrain + convNextStationOfMetroTrain;
		
		//The following lines are for printing out the train manager
		System.out.println("WELCOME TO YILONG'S");
		System.out.println("\nMetro Manager (Version 1)");
		System.out.println("-------------------------");
		System.out.println("Metro train currently in the station " + numberOfMetroTrain);
		System.out.println("Metro " + numberOfMetroTrain + " is currently at station " + stationOfMetroTrain);
		System.out.println("Number of passengers currently in Metro " + numberOfMetroTrain + ": " + numberOfPassengers);
		System.out.println("\nNumber of passengers passengers are getting off the Metro: " + numberOfPassengersGettingOff);
		System.out.println("Number of passengers getting on the Metro " + numberOfMetroTrain + ": " + numberOfPassengersGettingOn);
		System.out.println("\nCurrent Status of Metro train " + numberOfMetroTrain + ":");
		System.out.println("----------------------------------");
		System.out.println("At the arrival at the station " + stationOfMetroTrain + ":");
		System.out.println("\n\tThere were " + numberOfPassengers + " passenger(s) in the Metro.");
		System.out.println("\t" + numberOfPassengersGettingOff + " passenger(s) left the Metro");
		System.out.println("\t" + numberOfPassengersGettingOn + " passenger(s) got on the Metro");
		System.out.println("Departing from station " + stationOfMetroTrain + " bound for station " + nextStationOfMetroTrain);
		System.out.println("\tThere were " + totalNumberOfPassengers + " passenger(s) in the Metro.");
		System.out.println("\nThank you for using VERSION 1 of the Metro application.");
		System.out.println("Keep an eye out for new releases of this application");
		System.out.println("\nThank you for using Metro Manager (Version1)");
	}
}
//End of Program.
