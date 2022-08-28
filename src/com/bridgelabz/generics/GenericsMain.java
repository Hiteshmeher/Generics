package com.bridgelabz.generics;
/**
 * 
 * @author HITESH
 *
 */
// Extended this class with MaximumGenerics class
public class GenericsMain {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// initializing the values and finding the maximum
		System.out.println("Maximum of Integers is "+MaximumGenerics.toPrintMax(10,20,18));
		System.out.println("Maximum of Float is " +MaximumGenerics.toPrintMax(10.7f,20.4f,17.7f));
		System.out.println("Maximum of three Strings is" +MaximumGenerics.toPrintMax("Mango","Banana","Cherry"));
	}
}