package com.syntax.class16;

import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {
		// How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever

		
		String s = "This is sentence i want to reverse";
		System.out.println(s);
		
		StringBuilder stringBuilder = new StringBuilder("This is sentence i want to reverse");
		System.out.println(stringBuilder.reverse());
		
		System.out.println("---------Another Way--------");
		
		StringBuilder sB = new StringBuilder(s);
		sB.reverse();
		s = sB.toString();
		
		System.out.println(s);
		
		String newStr = "";
		String s2 = stringBuilder.toString();
		String[] strArr = s2.split(" "); 
		System.out.println(Arrays.toString(strArr));
	
		for (int i = strArr.length-1; i >=0; i--) {
			newStr+=strArr[i]+" ";
		}
		System.out.println(newStr);
	}
}
