package com.dinesh.javapractice;

public class TestFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFinally obj = new TestFinally();
		System.out.println(obj.testmethod());
	}

	public int testmethod() {
		try {
			throw new Exception();
			//System.out.println("\nInside try method\n");  ====== Always unreachable code
		} catch (Exception e) {
			System.out.println("\nInside catch block");
			//System.exit(0);
			return 2;  //Will not be executed but no error will be thrown
		} finally {
			System.out.println("\nInside finally block");
			System.exit(12);
			return 1; //will be always executed
		}
		//return 3; //Unreachable code
	}
	
}
