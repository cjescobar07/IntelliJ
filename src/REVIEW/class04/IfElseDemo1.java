package REVIEW.class04;

public class IfElseDemo1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String month="Feb";
        int day=2;
        //"Jan".equals(month)
        if("Jan".equals(month)) {
            if(day==1) {
                System.out.println("it is the first of Jan");
            }else {
                System.out.println("It is Jan but not first of Jan");
            }

        }else {
            System.out.println("it is not Jan");
        }
    }
}
