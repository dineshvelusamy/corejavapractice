package com.dinesh.javapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersToWords {

	public static String[] numbers = {
			"",
			"ONE",
			"TWO",
			"THREE",
			"FOUR",
			"FIVE",
			"SIX",
			"SEVEN",
			"EIGHT",
			"NINE",
			"TEN",
			"ELEVEN",
			"TWELVE",
			"THIRTEEN",
			"FOURTEEN",
			"FIFTEEN",
			"SIXTEEN",
			"SEVENTEEN",
			"EIGHTEEN",
			"NINETEEN"
	};
	public static String[] tens = {
			"",
			"",
			"TWENTY",
			"THIRTY",
			"FORTY",
			"FIFTY",
			"SIXTY",
			"SEVENTY",
			"EIGHTY",
			"NINETY"
	};
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long i = 0;
		do {
			System.out.println("Enter the number to convert or 0 to exit ");
			i = Long.parseLong(br.readLine());
			if(i > 0)
				System.out.println(convertToWord(i));
		}while (i > 0);

	}

	public static String convertToWord(long i) {
		String result="";

		int length = String.valueOf(i).length();
		if(length > 3) {
			if( i / 10000000 > 0) {
				result = convertToWord(i / 10000000) + " crore ";
				i = i % 10000000;
			}
			if ( i / 100000 > 0) {
				result = result + convertToWord(i/100000) + " lakh ";
				i = i% 100000;
			}
			if ( i / 1000 > 0) {
				result = result + convertToWord(i/1000) + " thousand ";
				i = i% 1000;
			}
			 if ( i < 1000) {
				 result = result + convertToWord(i);
			 }
		} else {
			if (i/100 > 0) {
				result = result + numbers[(int) (i/100)] + " hundred ";
				i=i%100;
			} 
			if(i >= 20) {
				result = result + tens[(int) (i/10)] + " ";
				i = i%10;
			}
			else {
				result = result + numbers[(int) i] + " ";
				i=i / 100;
			}
			if(i>0) {
				result = result + numbers[(int) i] + " ";
			}
		}

		return result;
	}
}
