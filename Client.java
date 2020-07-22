package com.interest;
import java.util.Scanner;

public class Client {
	public static void main(String args[])
	{
		String materialStandard;
		double cost;
		double areaOfHouse;
		String fullyAutomated;
		Scanner sc = new Scanner(System.in);
		System.out.format("Enter the material standard:");
		materialStandard = sc.next();
		System.out.format("Enter the area of house:");
		areaOfHouse = sc.nextDouble();
		System.out.format("Do you want fully automated house(yes/no):");
		fullyAutomated = sc.next();
		ConstructionCost house1 = new ConstructionCost();
		cost = house1.houseCost(materialStandard, areaOfHouse, fullyAutomated);
		System.out.format("The cost of the house is:%f",cost);
		sc.close();
	}

}
