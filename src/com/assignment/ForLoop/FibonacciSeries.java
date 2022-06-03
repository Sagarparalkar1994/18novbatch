package com.assignment.ForLoop;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s=0;  //-----first no.
		int p=1;  //-----second no.
		
		System.out.println("fibonacci series upto 10 no.");
		
		for (int i=1; i<=10; ++i) {
			System.out.print(s + ",");
			
			
		int k= s + p;	 //k = next no = first no + second no i.e ----  k=1; k=2
			s=p;         //s = first no. = second no  i.e ------  s=1 ; s=1
		    p=k;         //p=  second no =next no     i.e-------- p=1 ; p=2
		}
		
		System.out.println("......");
		
		
		

	}

}
