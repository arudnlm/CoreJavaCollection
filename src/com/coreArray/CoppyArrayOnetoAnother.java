package com.coreArray;

//import java.util.Arrays;

public class CoppyArrayOnetoAnother {

	public void copyArray(int[] intArray) {
		/*
		 * int[] arr=new int[5]; System.out.print("New Array is : >>> "); for(int i=0;
		 * i<intArray.length; i++) { arr[i]=intArray[i];
		 * 
		 * System.out.print(arr [i]+","); } System.out.println();
		 */

		// Arrays.sort(intArray);
		System.out.print("Your given array is: >>> ");
		for (int num : intArray) {
			System.out.print(num + " ");
		}

	}

	public void sortedArray(int[] arr3) {
		System.out.print("Before short your array element is: >>>");
		for (int num : arr3) {
			System.out.print(num + " ");
		}
		System.out.println("\nSorted Array is : >>> ");
		for (int i = 0; i < arr3.length; i++) {

			for (int j = i + 1; j < arr3.length; j++) {
				int temp = 0;

				if (arr3[i] > arr3[j]) {
					temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;

				}

				// System.out.println();

			}
			System.out.print(arr3[i] + " ");
		}

	}

}
