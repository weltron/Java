/*
 * Lab Assignment 18B Recursion
 * Weltron Bitange
 * This program accepts an array of integers and returns true if a element in the
 * array is twice the value of the previous element 
 * */
import java.util.*;
import java.io.*;
public class Lab18B {

	public static void main(String[] args) {
		System.out.println(isDouble(new int[]{2 ,4, 8, 16, 32, 64, 128 }, 0));
		System.out.println(isDouble(new int[]{4 ,42, 85, 162, 321, 634, 528 }, 0));
		System.out.println(isDouble(new int[]{10 ,20, 40, 80, 160, 320, 640 }, 0));
		System.out.println(isDouble(new int[]{140 ,41, 887, 216, 329, 786, 598 }, 0));

	}
	public static boolean isDouble(int[] array,int i) {
		//base case
		if(i == array.length - 1)
			return true;
		//recursive case
		if(array[i+1] != array[i] * 2)
			return false;
		else
			return isDouble(array, i + 1);
	}
	

}
