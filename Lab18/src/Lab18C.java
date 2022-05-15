/*
 * Lab Assignment 18C Recursion
 * Weltron Bitange
 * This program of a method that accepts two strings with the first one longer than the 
 * second. It returns the first string with all instances of the second one removed
 * */
public class Lab18C {

	
	public static void main(String[] args) {
		String str1 = "funandfunandfunandfun";
		String str2 = "fun";
		
		System.out.println(repString(str1, str2));
	

	}
	public  static String repString(String string1, String string2) {
		if(string1.contains(string2)) {
			string1 = string1.replaceFirst(string2, "");
			System.out.println("The string is currently at: " + string1);
		}
		else 
			return string1;
	
	return repString(string1, string2);
	}
}
