package com.assignment.switchcase;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num1 =5.0f;
		float num2 =10.0f;
		double result;
		char operator= '/';
		
		System.out.println();
		
		switch(operator) {
		
		case '+' :
		result =num1 + num2;
        System.out.println("addition of 2 no. is " + result );
        break;
		
		case '-' :
			result =num1 - num2;
	        System.out.println("subtraction of 2 no. " + result );
	        break;
	        
		case '*' :
			result =num1 * num2;
	        System.out.println("multiplication of 2 no. " + result );
	        break;
	        
		case '/' :
			result =num1 / num2;
	        System.out.println("division of 2 no. " + result );
	        break;
	        
	        default :
	        	System.out.println("please enter valid operator");
		}
		 
		
		
		
		
	}

}
