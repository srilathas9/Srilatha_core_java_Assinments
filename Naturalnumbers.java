package com.coreJava;

public class Naturalnumbers {
public static void main(String[] args) {

	Naturalnumbers num = new Naturalnumbers();

	System.out.println(num.calculateSum(15));
}
	
	public int calculateSum(int i) {
		
		int sum=0;
		for(int a=0; a<=i; a++) {
			if(a%3==0 || a%5==0) {
				sum=sum+a;
			}
			
		}
		
		
	return sum;
	}
	
	
	
	
	
	
}


