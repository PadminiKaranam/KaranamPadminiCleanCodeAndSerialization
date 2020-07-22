package com.interest;
import java.lang.Math;
public class CompoundInterest {
	public double calculateCompoundInterest(double principal,double timePeriod,double rateOfInterest)
	{
		double amount;
		amount=principal*(Math.pow(1+rateOfInterest/100,timePeriod));
		return amount-principal;
	}

}
