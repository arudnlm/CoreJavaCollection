package com.coreArray;

import java.util.Arrays;

public class ClientCodePassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray2=new int[5];
		intArray2[0]=5;
		intArray2[1]=7;
		intArray2[2]=1;
		intArray2[3]=8;
		intArray2[4]=2;
		
		int[] arr3= {5, 6, 4, 8, 2, 1, 9, 0};
		
		CoppyArrayOnetoAnother cAOA=new CoppyArrayOnetoAnother();
		cAOA.copyArray(intArray2);
		System.out.print("\nOriginal Array is :>>>> ");
		/*for(int i=0; i<intArray2.length; i++) {
			System.out.print(intArray2[i]+" ,");
		}*/
		System.out.println(Arrays.toString(intArray2));
		
		cAOA.sortedArray(arr3);
		
	}

}
