package com.syntax.class13;

public class MethodDemo2 {
	
	void ChrisAndMichelle(String name1 , String name2) {
		if("Chris".equals(name1) && "Michelle".equals(name2)) {
			System.out.println(name1 + " and " + name2 + " are married");
		}else {
			System.out.println("THE SIMPSONS");
		}
	}

	
public static void main(String[] args) {
	MethodDemo2 married = new MethodDemo2();
		
	married.ChrisAndMichelle("Chris", "Michelle");
	married.ChrisAndMichelle("Homer", "Marge");

	
	
 }
}
