package com.assignment.IfElse;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int year=2024;
		
		if(((year%4==0 && year%100 !=0))  || (year%400==0)) {
			
			System.out.println("this is a leap year");
		}else {
			System.out.println("this is not a leap year");
		}

	}

}
