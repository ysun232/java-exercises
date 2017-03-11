// ------------------------------------------------------- 
// Assignment (1)
// Written by: (Yilong Sun, 6933815)
// For COMP 248 Section (RB) – Fall 2013
// --------------------------------------------------------

// Welcome to Yilong Sun's first attempt to write a unit converter program.
// This program will be used to convert a contant in kilometers into a constant in NM, SM and Furlong.
// In this program, I declare my variables. By setting up one variable, I will then use it to define my other variables.
// The rest of the program is written in single system.out.println for the text


public class Assignment1part1 
{
	public static void main(String[] args)
	{
		//I declare the variables and constants
		
		float numberOfKilometers = 2.5f; // replace the constant 2.5 by your desired constant to have it converted into NM, SM and Furlong
		float convNm = 0.54f;
		float answerInNm = numberOfKilometers * convNm;
		float convSm = 1.151f;
		float answerInSm = answerInNm * convSm;
		int convFurlong = 8;
		float answerInFurlong = answerInSm * convFurlong;
		
		//The following nine lines are used to print out the message required for the unit converter
		System.out.println("Conversion of Linear Distances");
		System.out.println("------------------------------");
		System.out.println("Linear distance in kilometers (km) to convert: " + numberOfKilometers);
		System.out.println("\nThe distance in NM is: " + answerInNm);
		System.out.println("The distance in SM is: " + answerInSm);
		System.out.println("The distance in Furlong is: " + answerInFurlong);
		System.out.println("\nEnd of linear converter program.");
	}
}

// End of the program.