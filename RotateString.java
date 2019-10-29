 
package com.java.kondareddy;

class RotateString{

 public static void printRotatedString(String str) 
	{ 
		int len = str.length(); 
	 
		StringBuffer sb; 
		
		for (int i = 0; i < len; i++) 
		{ 
			sb = new StringBuffer(); 
			
			int j = i; 			
			int k = 0; 
	
			 
			for (int k1 = j; k1 < str.length(); k1++) { 
				sb.insert(k, str.charAt(j)); 
				k++; 
				j++; 
			} 
	
			j = 0; 
			while (j < i) 
			{ 
				sb.insert(k, str.charAt(j)); 
				j++; 
				k++; 
			} 
	
			System.out.println(sb); 
		} 
	} 
	
	public static void main(String[] args) {
	 
		String str = new String("kondareddy"); 
		printRotatedString(str); 
	} 
} 
