package com.coreArray;

public class MissingNumber {
	
	public void findMissingNumber(int [] intArray) {
		int n = 10;
		int sumNaturalNum= n*(n+1)/2;
		
		int sumArrayElement=0;
		
		for(int i=0; i<intArray.length; i++) {
			sumArrayElement=sumArrayElement+intArray[i];
		}
		
		int missingNumber=sumNaturalNum-sumArrayElement;
		System.out.println("Missing Number :>>>>"+ missingNumber);
		
	}


	}

