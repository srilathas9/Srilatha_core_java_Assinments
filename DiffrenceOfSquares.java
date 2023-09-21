package com.coreJava;

public class DiffrenceOfSquares {

	public static void main(String[] args) {

		int i =3;
		System.out.println(squarsOfSum(i)-sumOfSquares(i));	
	}
	public static int squarsOfSum(int i) {
		int sum =0;
		for (int a=0; a<=i; a++){
			sum=sum+(a*a);
		}
		return sum;
	}

	public static int sumOfSquares(int i) {

		int sum =0;
		int sumOfSquares =0;
		for (int a=0; a<=i; a++) {
			sum =sum+a;
			
		}
		sumOfSquares=sum*sum;
		return sumOfSquares;
	}	
}
