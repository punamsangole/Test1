package com.level1;

public class TestArray {
	
	public static void main(String[] args) {
		int a[] = new int[5];
		a[0]= 10;
		int b = 10;
		
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		//traversing array.
		/*for(int i=0; i<= a.length-1 ; i++) {
			System.out.println(a[i]);
		}*/
		
		for(int i : a) {
			System.out.println(i);
		}
		
	
	}

}
