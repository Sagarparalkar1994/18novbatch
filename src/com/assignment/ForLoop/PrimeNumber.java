package com.assignment.ForLoop;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int num=101;
		boolean flag =false;
		for (int i=2 ; i<=num/2 ; ++i ) {
			
			if (num%i==0) {
				
			flag= true;
			break;	
			}
		}
		if (!flag) {
			System.out.println("the no. is  prime ");
		}
			
		else {
			System.out.println("the no is not prime");
		}
			
		
	}

}
