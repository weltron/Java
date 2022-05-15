/*
 * Lab Assignment 18A Recursion
 * Weltron Bitange
 * This program accepts an integer and returns the number of odd digits in it
 * */
import java.util.*;
import java.io.*;
public class Lab18A {
	//main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long number= input.nextLong();
		
		System.out.println(countOddDigits(number));

	}
	//recursion method
	public static long countOddDigits(long num) {
		//base case
		if(num == 0)
			return 0;
		//recursive case
		else if(num%2 != 0)
			return (1 + countOddDigits(num / 10));
	
		else
			return countOddDigits(num / 10);
		
		
	}
}
