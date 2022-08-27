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
		System.out.println("Enter 3 Float values");
		// Taking 3 Float values from user
		Float x = scanner.nextFloat();
		Float y = scanner.nextFloat();
		Float z = scanner.nextFloat();
		System.out.println("Max: " + maxfloat(x, y, z));
	}
}