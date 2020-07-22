package com.interest;
public class ConstructionCost {
	public double houseCost(String materialStandard, double totalAreaOfHouse, String automatedHome)
	{
		double cost = 0.0;
		if(materialStandard.contentEquals("above"))
		{
			cost = 1500 * totalAreaOfHouse;
		}
		else if(materialStandard.equals("high") && automatedHome.equals("no"))
		{
			cost = 1800 * totalAreaOfHouse;
		}
		else if(materialStandard.contentEquals("high") && automatedHome.contentEquals("yes"))
		{
			cost = 2500 * totalAreaOfHouse;
		}
		else if(materialStandard.contentEquals("standard"))
		{
			cost = 1200 * totalAreaOfHouse;
		}
		return cost;
	}

}
