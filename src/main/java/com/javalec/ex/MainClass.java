package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		//simple calculation with java spring
		//xml-based DI
		String configLocation = "classpath:applicationCTX.xml";	//xml path
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);	
		Calc myCalc = ctx.getBean("myCalc", Calc.class);
		
		myCalc.addition();
		myCalc.subtraction();
		myCalc.multiplication();
		myCalc.division();
		

	}

}
