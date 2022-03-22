package com.syntax.Group7_ProjectTasks;
/*
2.	 We have to calculate the average of marks obtained in three subjects by student A and by student B.
     Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
     Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in
     three subjects as its parameters and the marks in four subjects as its parameters for student B.
     Test your code
 */
abstract class Marks {

   abstract double getPercentage();

}

class StudentA extends Marks {
    int sub1, sub2, sub3;

    StudentA(int s1, int s2, int s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }

    public double getPercentage() {
        double total = ((sub1 + sub2 + sub3) / (double) 300) * 100;
        return total;
    }
}


class StudentB extends Marks{
    int sub1, sub2, sub3, sub4;
    StudentB(int s1, int s2, int s3, int s4){
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        sub4 = s4;
    }
    public double getPercentage() {
        double total = ((sub1+sub2+sub3+sub4)/(double)300)*100;
        return total;
    }
}

public class Task02_Marks {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(90, 85, 91);
        System.out.println("Student A percentage: " +studentA.getPercentage());

        StudentB studentB = new StudentB(95,89,76,82);
        System.out.println("Student B percentage: " +studentB.getPercentage());
    }
}


