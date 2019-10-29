package com.java.kondareddy;

public class Test {
public static void reverseString(String original) {
int length = original.length();
for (int i = length - 1; i >= 0; i--) {
System.out.print(original.charAt(i));
}
}

public static void main(String[] args) {
//  reverse String Char
String str, rev = "";
str = "kondareddy";
int length = str.length();
for (int i = length - 1; i >= 0; i--)
rev = rev + str.charAt(i);
System.out.println(rev);

// reverse First Half snd second half
String s1 = "kondareddyragula";
String s2 = s1.substring(0, 10);
String s3 = s1.substring(10);
int a = s2.length();
int b = s3.length();
for (int i = a - 1; i >= 0; i--) {
System.out.print(s2.charAt(i));
}
System.out.print("   ");
for (int k = b - 1; k >= 0; k--) {
System.out.print(s3.charAt(k));
}
System.out.println("");
// Recursive Alg
String string = "HaiHello";
reverseString(string);
System.out.println();
// 4: Reverse Word Program
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
