package com.coreJava;

public class ICalculateCircleAreaImpl implements ICalculateCircleArea {

	@Override
	public void calculateArea(int r) {
		float circleArea=ICalculateCircleArea.PI*r*r;
		System.out.println("Circle Area>>>>:"+circleArea);
		
	}
	
	

}
