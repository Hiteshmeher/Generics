package com.bridgelabz.generics;

import java.util.Scanner;
/**
 * 
 * @author HITESH
 *
 */
// Extended this class with MaximumGenerics class
public class GenericsMain extends MaximumGenerics {
	// Scanner Class for user input
	static Scanner scanner = new Scanner(System.in);
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Maximum of three number");
		System.out.println("Enter 3 String values");
		// Taking 3 String values from user
		String str1 = scanner.next();
		String str2 = scanner.next();
		String str3 = scanner.next();
		System.out.println("Max: " + findStringMax(str1, str2, str3));
	}
}