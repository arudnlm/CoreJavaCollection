package com.coreArray;

public class FirsSecondLargestNumber {
	
	
	
	public void findFirsSecondLargestNumber(int[] intArray) {
		int firstLargestNumber=0;
		int secondLargestNumber=0;
		
		int firstNumber=intArray[0];
		int secondNumber=intArray[1];
	if(firstNumber>secondNumber) {
		firstLargestNumber=firstNumber;
		secondLargestNumber=secondNumber;
		
	}else {
		firstLargestNumber=secondNumber;
		secondLargestNumber=firstNumber;
		for(int i=2; i<intArray.length; i++) {
						
			if(intArray[i]>firstLargestNumber) {
				//int temp=firstLargestNumber;
				//firstLargestNumber=intArray[i];
				//secondLargestNumber=temp;
				secondLargestNumber=firstLargestNumber;
				firstLargestNumber=intArray[i];
				
			}else if(intArray[i]>secondLargestNumber){
				//int temp=secondLargestNumber;
				secondLargestNumber=intArray[i];
				
			
				
			}
			
		}
	}
	System.out.println("The first Largest Number is: "+firstLargestNumber);
	System.out.println("The Second Largest Number is: "+secondLargestNumber);
	}

}
