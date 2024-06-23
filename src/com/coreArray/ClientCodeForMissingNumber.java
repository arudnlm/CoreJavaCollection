package com.coreArray;

public class ClientCodeForMissingNumber {

	public static void main(String[] args) {
		int [] intArray= new int[10];
		intArray[0]=1;
		intArray[1]=2;
		intArray[2]=3;
		intArray[3]=4;
		intArray[4]=5;
		intArray[5]=6;
		intArray[6]=7;
		//intArray[7]=8;
		intArray[8]=9;
		intArray[9]=10;
		
		new MissingNumber().findMissingNumber(intArray);

	}

}
