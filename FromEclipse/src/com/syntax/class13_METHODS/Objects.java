package com.syntax.class13_METHODS;

public class Objects {
	
String name;
String id;
int age;
char gender;
double gpa;

void student(){
	System.out.println(name + " is studying");
	System.out.println(name + " has a GPA of " + gpa);
}

public static void main(String[] args) {
	
Objects chrisobj = new Objects();
chrisobj.name =  "Chris";
chrisobj.gpa = 3.5;
chrisobj.student();

	
	
	
	
 }
}
