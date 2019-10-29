package com.java.kondareddy;

public class ReverseFIrstAndSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "kondareddyragula";
		String s2 = s1.substring(0, 10);
		
		int a = s2.length();
		
		for (int i = a - 1; i >= 0; i--) {
		System.out.print(s2.charAt(i));
		}
		String s3 = s1.substring(10);
		int b = s3.length();
		System.out.print("   ");
		for (int j = b - 1; j >= 0; j--) {
		System.out.print(s3.charAt(j));
		}
		
	}

}
