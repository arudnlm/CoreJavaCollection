package com.coreArray;

public class SortArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating an instance of an array  
		int[] arr = new int[] {5, 6, 4, 8, 2, 1, 9, 0};  
		System.out.println("Array elements after sorting:");  
		//sorting logic  
		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		//prints the sorted element of the array  
		System.out.print(arr[i]+" ");  
		}  

	}

}
