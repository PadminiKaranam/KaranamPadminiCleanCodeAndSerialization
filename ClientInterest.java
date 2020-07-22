package com.interest;
import java.util.Scanner;

public class ClientInterest {
     public static void main(String args[])
     {
    	 double principal;
    	 double timePeriod;
    	 double rateOfInterest;
    	 double simpleInterest;
    	 double compoundInterest;
    	 Scanner sc = new Scanner(System.in);
    	 System.out.format("Enter principal:");
    	 principal = sc.nextDouble();
    	 System.out.format("Enter time period:");
    	 timePeriod = sc.nextDouble();
    	 System.out.format("Enter rate of interest:");
    	 rateOfInterest = sc.nextDouble();
         SimpleInterest si = new SimpleInterest();
         simpleInterest = si.calculateSimpleInterest(principal, timePeriod, rateOfInterest);
         CompoundInterest ci = new CompoundInterest();
         compoundInterest = ci.calculateCompoundInterest(principal, timePeriod, rateOfInterest);
         System.out.format("Simple Interest is:%.2f\n",simpleInterest);
         System.out.format("Compound Interest is:%.2f",compoundInterest);
         sc.close();
     }
}
