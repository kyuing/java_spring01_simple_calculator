package com.javalec.ex;

public class Calculator {

public void addition(int f, int s) {
		
		//letz calc here
		System.out.println("addition()");
		System.out.println(f + " + " + s + " is: " + (f + s));
	}
	
	public void subtraction(int f, int s) {
		
		
		System.out.println("subtraction()");
		System.out.println(f + " - " + s + " is: " + (f - s));
		
	}
	
	public void multiplication(int f, int s) {
		
		
		System.out.println("multiplication()");
		System.out.println(f + " * " + s + " is: " + (f * s));
		
	}
	
	public void division(int f, int s) {
		
		
		System.out.println("division()");
		System.out.println(f + " / " + s + " is: " + (f / s));
		
	}
	
}
