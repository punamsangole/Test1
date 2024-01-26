package com.level1;

public class TestArray2 {
	
	public static void main(String[] args) {
		String str[] = {"ajit", "siya", "jagruti"};
		
		System.out.println(str.length);
		
		/*for(int i=0;i<=str.length-1;i++) {
			System.out.println(str[i]);
		}*/
		
		//for loop level 2
		for(String s : str) {
			System.out.println(s);
			//i++
		}
		
	}

}
