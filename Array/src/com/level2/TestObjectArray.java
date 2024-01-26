package com.level2;

public class TestObjectArray {
	
	public static void main(String[] args) {
		//declare an array of student
		//Student[] s;
		
		//allocating memory for 5 objects of type student
		Student[] s = new Student[5];
		int[] a = new int[5];
		
		s[0] = new Student(1, "ajit");
		s[1] = new Student(2, "siya");
		s[2] = new Student(3, "bhavana");
		s[3] = new Student(4, "kimaya");
		s[4] = new Student(5, "sonali");
		
		/*for(int i=0;i<=s.length-1;i++) {
			System.out.println(s[i].getRollNo());
		}*/
		
		for(Student st : s) {
			System.out.println(st.getName());
		}
		
		
		
		
	}

}
