package com.java.kondareddy;

public class ReverseWordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strWord = "Hi hello this is kondareddy";
		String[] words = strWord.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++) {
		String word = words[i];
		String reverseWord = "";
		for (int j = word.length() - 1; j >= 0; j--) {
		reverseWord = reverseWord + word.charAt(j);
		}
		reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(strWord);
		System.out.println(reversedString);
	}

}
