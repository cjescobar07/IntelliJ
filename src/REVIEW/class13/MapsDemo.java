package REVIEW.class13;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> personInfo = new HashMap<>();
        personInfo.put(651165615, "person1");
        personInfo.put(489651445, "person2");
        personInfo.put(878941654, "person3");
        personInfo.put(489153614, "person4");
        personInfo.put(965254132, "person5");

        for (Map.Entry<Integer,String> entry: personInfo.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
