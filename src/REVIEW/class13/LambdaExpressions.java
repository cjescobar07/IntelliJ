package REVIEW.class13;

import java.util.ArrayList;

public class LambdaExpressions {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Chris");
        names.add("Jacob");
        names.add("Sebastian");
        names.add("Doggy");
       long m = names.stream().filter(x -> x.contains("M")).count();
        System.out.println(m);
    }
}
