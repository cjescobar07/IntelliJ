package com.syntax.class09_ARRAYS;

public class ArrayTask01 {

	public static void main(String[] args) {
		
	/*Create an array of chars and store grades into it: A,B,C,D,E,F. 
	 * Then print a grade B (use 2 different ways of creating an array).
	 */
		//First way
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		System.out.println("");
		
		//Easy way
		char[] grade={'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println("Your grade is: "+grade[1]);
		
		System.out.println("------------------");
		
	/* Create an array of names and store all names of your group. 
	 * Then print your name from that array. (use 2 different ways of creating an array).
	 */
		
		//First way
		String[] names=new String[9];
		names[0]="Amanada";
		names[1]="Charles";
		names[2]="Christian";
		names[3]="Gigi";
		names[4]="Michael";
		names[5]="Mujeeb";
		names[6]="Phiny";
		names[7]="Tolga";
		names[8]="Waheed";
		
		System.out.println(names[2]);
		System.out.println("");
		
		//Easy way
		String[] name= {"Amanda", "Charles", "Christian", "Gigi", "Michael", "Mujeeb", "Waheed"};
		System.out.println(name[2]);
		
		System.out.println("-----------------");
	
	
	/*Create an array of words: Java, Saturday, day, coding, is. 
	 * Print the following sentence using elements of array: �Saturday is Java coding Day�. 
	 */
		//First way
		String[] word=new String[5];
		
		word[0]="Java";
		word[1]="Saturday";
		word[2]="day";
		word[3]="coding";
		word[4]="is";
		
		System.out.println(word[1]+" " + word[4]+" " + word[0]+" " + word[3]+" " + word[2]);		
		System.out.println();
		
		//Easy way
		String[] words={"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1]+" " + words[4]+" " + words[0]+" " + words[3]+" " + words[2]);
		
		
		
		
	}
}
