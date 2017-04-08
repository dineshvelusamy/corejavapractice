package com.dinesh.javapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the limit : ");
		String s = br.readLine();
		fibonacci(Integer.parseInt(s));
	}

	public static void fibonacci (int i) {
		int f = 1;
		int f1 = 0;
		System.out.print(0);
		do {
			System.out.print( "," + f);
			int nxt = f+f1;
			f1 = f;
			f = nxt;
		}while (f < i);
	}
	
}
