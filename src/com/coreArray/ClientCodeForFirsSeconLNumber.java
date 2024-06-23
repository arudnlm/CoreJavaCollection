package com.coreArray;

public class ClientCodeForFirsSeconLNumber {

	public static void main(String[] args) {
		
		int[] intArray=new int[13];
		//int[] intArray=new int[4];
		intArray[0]=64;
		intArray[1]=90;
		intArray[2]=75;
		intArray[3]=1192;
		intArray[11]=1006;
		intArray[12]=44;
		intArray[4]=120;
		intArray[5]=505;
		intArray[6]=205;
		intArray[7]=55;
		intArray[8]=770;
		intArray[9]=105;
		intArray[10]=1200;
		
		FirsSecondLargestNumber fSLNumber= new FirsSecondLargestNumber();
		fSLNumber.findFirsSecondLargestNumber(intArray);

	}

}
