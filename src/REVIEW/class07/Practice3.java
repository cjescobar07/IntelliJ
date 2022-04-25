package REVIEW.class07;

public class Practice3 {

    String studentName;
    String course;
    int studentID;
    int grades;

    void displayStudentRecord(){
        System.out.println("The student name is " + studentName + " and the course student enrolled for is " + course);
        System.out.println("The student id is " + studentID + " and the grade student achieved is " + grades);
    }

    public static void main(String[] args) {
        // Creating the first object of a class to assign first set of values
        Practice3 p1 = new Practice3();
        p1.studentName = "Chris";
        p1.course = "SDET";
        p1.studentID = 229007;
        p1.grades = 100;
        p1.displayStudentRecord();

        System.out.println("---------------------------------------------------------------------------");

        // Creating the second object of a class to assign second set of values
        Practice3 p2 = new Practice3();
        p2.studentName = "Sebastian";
        p2.course = "Muay Thai";
        p2.studentID = 201504;
        p2.grades = 100;
        p2.displayStudentRecord();
    }

}
