package com.syntax.class20;

public class Teacher2 {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses
    MathTeacher,ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    Test all 4 classes
     */
    public static void main(String[] args) {
        Teacher2 mathTeacher = new Teacher2();
        mathTeacher.name = "Chris";

    }

    String name;
    int age;
    double weight;

    void printName() {
        System.out.println(name);
    }

    class MathTeacher extends Teacher {
        boolean teachesCalculus = true;

        void teachesMath() {
            System.out.println(name + " teaches Calculus.");
        }
    }

    class ChemistryTeacher extends Teacher {
        boolean teachesChemistry = true;

        void teachesOrganicChemistry() {
            System.out.println(name + " teaches organic chemistry.");
        }
    }

    class PianoTeacher extends Teacher {
        boolean teachesHowToPlayPiano = true;

        void teachesPiano() {
            System.out.println(name + " teaches piano lessons.");
        }
    }

}

