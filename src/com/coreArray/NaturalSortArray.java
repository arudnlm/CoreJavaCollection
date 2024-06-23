package com.coreArray;

public class NaturalSortArray {

	public static void main(String[] args) {
		int i;

		// Initializing an array
		int array[] = { 12, 66, 34, 5, 8, 9, 20, 66, 64};
		System.out.print("Array element before sorting..>>> \n");
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + ", ");

		sortElement(array, array.length);
		System.out.println("\nArray element after sorting..>>>");
		// accessing elements of the sorted array
		for (i = 0; i < array.length; i++) {
			System.out.print(array[i] +" ");
		}

	}

	// user defined method to sort an array in ascending order
	private static void sortElement(int array[], int n) {
		for (int i = 1; i < n; i++) {
			int j = i;
			int a = array[i];
			while ((j > 0) && (array[j - 1] > a)) { //returns true when both conditions are true 
				array[j] = array[j - 1];
				j--;
			}
			array[j] = a;
		}

	}
}
//https://www.javatpoint.com/how-to-sort-an-array-in-java