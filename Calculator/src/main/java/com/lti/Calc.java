package com.lti;

public class Calc {
	public static int add(int a, int b){
		return a+b;
	}
	public static int sub(int a, int b){
		return a-b;
	}
	public static int mul(int a, int b){
		return a*b;
	}
	public static void main(String[] args) {
		System.out.println("Additon: "+ add(12,14));
		System.out.println("Subtraction: "+ sub(12,10));
	}
}
