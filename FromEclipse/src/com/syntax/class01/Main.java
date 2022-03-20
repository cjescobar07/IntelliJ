package com.syntax.class01;

public class Main {
	
	static int countA(String s){		
	s = s.replaceAll("[^Aa]", "");	
    return s.length();
	}
	
	//test case below (dont change):
	public static void main(String[] args){
    Main task133 = new Main();
		System.out.println(task133.countA("aaA")); //3
		System.out.println(task133.countA("aaBBdf8k3AAadnklA")); //6
	}

}
