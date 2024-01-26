package com.handson;

public class SortAnArray {
	
	public static void main(String[] args) {
		int a[] = {40,10,30,20};
		System.out.println("Before sorting>>");
		for(int i : a) {
			System.out.print(" "+i);
		}
		
		
		//Ascending sorting 
		//10,20,30,40
		int temp =0;
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1; j <=a.length-1;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j]= temp;
				}
			}
		}
		System.out.println();

		System.out.println("After sorting>>");
		for(int i : a) {
			System.out.print(" "+i);
		}
		System.out.println("Min no.>> "+a[0]);

		System.out.println("Max no.>> "+a[(a.length-1)]);
		
		
	}

}
