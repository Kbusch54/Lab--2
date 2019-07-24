

import java.util.Scanner;

public class Lab2d {

	public static void main(String[] args) {
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		boolean cont1 = true;
		
		Scanner scr = new Scanner(System.in);
		do {
		
		System.out.print("Enter Length: ");
		double length = scr.nextDouble();
		System.out.print("Enter Width: ");
		double width = scr.nextDouble();
		double area = length * width;
		double perimeter = (2*length )+ (2*width);
		System.out.println("Area: "+ area);
		System.out.println("Perimeter: " + perimeter);
		System.out.println("Type in the height of the room");
		double height = scr.nextDouble();
		
		System.out.println("Volume: "+ height * width * length);
		System.out.print("Have more rooms type? \"y\" to continue or \"n\" to stop: ");
		String cont = scr.next();
	
		
		if ("n".contentEquals(cont)) {
			cont1 = false;
		}
		
		
		
	

		}while (cont1);
		System.out.println("Thank You!");
		
		scr.close();
	}
	
}

	
