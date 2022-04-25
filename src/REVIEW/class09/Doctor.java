package REVIEW.class09;

public class Doctor {
    //instance variables declared inside the class, but outside a method, constructor, or block
   public String name;
   protected String lastName;
    String specialty;
   private double salary;

    // static - variables declared inside the class, but outside a method, constructor, or block using static keyword
   static String hospital = "George Washington";

   //Constructor - initializing instance variables
   Doctor(String name, String lastName){
       this.name = name;
       this.lastName = lastName;
   }
   //We can have multiple constructors by overloading them
   Doctor(String name, String lastName, String specialty){
       this(name,lastName);
       this.specialty = specialty;
   }

    //non-static methods can access static and non-static members
    public void printInfo (){
        hello(); // we dd not need to put this (complier adds it
        System.out.println("Doctor " + name + " " + lastName + " is a " + specialty + " at " + hospital);
    }

    // static methods can only access static variables
     protected static void work(){
        System.out.println("All doctors work at " + hospital);
    }

     void hello(){
        System.out.println("Hello");
    }

     private void getPaid(){
        System.out.println("Doctor " + name + " " + lastName + " gets paid " + salary);
    }

   /*
   // static methods cannot access non-static members
    static void printInfo(String name, String lastName, String specialty){
       System.out.println("Doctor. " + name + " " + lastName + " is a " + specialty);
    */

}

    class Hospital {
        public static void main(String[] args) {
            Doctor doctor = new Doctor("John", "Smith", "Cardiologist");
            doctor.printInfo();
            Doctor doctor1 = new Doctor("Jane", "Smith", "Surgeon");
            doctor1.printInfo();

            System.out.println("Changing value of instance");
            doctor1.specialty = "Dermatologist";
            doctor1.printInfo();

            doctor.printInfo();
            System.out.println("Changing the value of static");

            // static variable should access in static way -> by class name where variable is defined
            Doctor.hospital = "INOVA";
            doctor.printInfo();
            doctor1.printInfo();

            System.out.println("----------------------");
            doctor1.hospital = "Best Hospital";

            doctor.printInfo();
            doctor1.printInfo();



            /*
                                        VARIABLES
                     optional         optional        must   must
                access modifiers nonAccess modifiers dataType name;

                                          METHODS
                     optional         optional          must      must
                access modifiers nonAccess modifiers  returnType  name();
             */

            /*from the most restrictive to the least restrictive access modifier

              private -> default -> protected -> public

             */



        }
    }

    class MedicalSchool{
        public static void main(String[] args) {
            // I want to test accessibility
            Doctor doc = new Doctor("Chris", "Escobar", "Surgeon");
            doc.printInfo(); // public method available
            Doctor.work(); // protected method is available
            doc.hello(); // defdault method is available
            // doc.getPaid(); private method is not available in a different class
            System.out.println(doc.name);
            System.out.println(doc.lastName);
            System.out.println(doc.specialty);
            // System.out.println(doc.salary);

        }
    }