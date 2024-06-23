package com.coreArray;

public class AssindingShortingArray {

	public static void main(String[] args) {
		//int [] arr= new int[] {9,3,5,1,4,7,6,8,9};
		//int [] arr1= {4,2,1,9,6,7,3,5,8};
		
		int [] arr2= new int [9];
		arr2[0]=32;
		arr2[1]=11;
		arr2[2]=62;
		arr2[3]=42;
		arr2[4]=302;
		arr2[5]=72;
		arr2[6]=2;
		arr2[7]=22;
		arr2[8]=92;
		//System.out.println(arr2); 
		System.out.print("Your original array is :  ");
		for(int num:arr2) {
			System.out.print(num +"  ");
		}
		System.out.println("\nAssending arry after short :  ");
		for(int i=0; i<arr2.length; i++) {
			for(int j=i+1; j<arr2.length; j++) {
				int temp=0;
				//if(arr2[i]<arr2[j])
					if(arr2[i]>arr2[j]){
					temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
					
				}
			}
			System.out.print(arr2[i]+ "  ");
		}
		
		
		
		

	}

}
