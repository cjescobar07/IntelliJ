package REVIEW.class07;

public class Practice5 {

    String weekDay(String day){

        switch (day){

            case "Monday":
                return "It is a lazy day";

            case "Tuesday":
                return "It is a productive day";

            case "Wedneday":
                return "It is a gloomy day";

            case "Thursday":
                return "It is an exciting day";

            case "Friday":
                return "No work today";

            default:
                return "No correct option found";
        }
    }

    public static void main(String[] args) {
        Practice5 p = new Practice5();
        String output = p.weekDay("Friday");
        System.out.println(output);

    }
}
