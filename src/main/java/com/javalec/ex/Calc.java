package com.javalec.ex;

public class Calc {

	private Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	public Calc() {
		
	}
	
	public Calc(int secondNum) {
		//specified constructor
		this.secondNum = secondNum;
	}
	
	public int getFirstNum() {
		
		return this.firstNum;
	}
	
	public void setFirstNum(int firstNum) {
		
		this.firstNum = firstNum;
	}
	
	public int getSecondNum() {
		
		return this.secondNum;
	}
	
	public void setSecondNum(int secondNum) {
		
		this.secondNum = secondNum;
	}
	
	public void setCalculator(Calculator calculator) {
		//setter for the property calculator
		this.calculator = calculator;
	}

	//all of calculation is done in the Calculator class. we just pass parameters there
	public void addition() {
		
		calculator.addition(firstNum, secondNum);
		
	}
	
	public void subtraction() {
		
		calculator.subtraction(firstNum, secondNum);
		
		
	}
	
	public void multiplication() {
		
		calculator.multiplication(firstNum, secondNum);
		
		
	}
	
	public void division() {
		
		calculator.division(firstNum, secondNum);
		
		
	}
	

}
