package com.java.kondareddy;

import java.util.HashMap;

public class countTest {

	public static void main(String[] args) {
		String str="kondareddy";
		String[] words=str.split("");
		HashMap <String, Integer> hm=new HashMap<>();
		for(int i=0;i<words.length;i++) {
			if(hm.containsKey(words[i])) {
				hm.put(words[i], hm.get(words[i])+1);
				
			}
			else {
				hm.put(words[i], 1);
				
			}
		}
		System.out.println(hm);
		

	}

}
