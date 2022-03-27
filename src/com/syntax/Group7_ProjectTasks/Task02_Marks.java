package com.syntax.Group7_ProjectTasks;
/*
2.	 We have to calculate the average of marks obtained in three subjects by student A and 4 subjects by student B.
     Create class 'Marks' with an abstract method 'getAvg' that will be returning the average percentage of marks.
     Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks in
     three subjects as its parameters and the marks in four subjects as its parameters for student B.
     Test your code
 */
abstract class Marks {

   abstract double getAvg();

}

class StudentA extends Marks {

   private double s1, s2,s3;

    StudentA(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    double getAvg(){
        double avg = (s1 + s2 + s3)/3;
        return avg;
    }

}

class StudentB extends Marks {

    private double s1, s2, s3, s4;

    StudentB(int s1, int s2, int s3, int s4){
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    @Override
    double getAvg() {
        return (s1+s1+s3+s4)/4;
    }
}


public class Task02_Marks {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(10,20,30);
        System.out.println("Student A average: " +studentA.getAvg());

        StudentB studentB = new StudentB(10,20,30,40);
        System.out.println("Student B average: " +studentB.getAvg());
    }
}


