package REVIEW.class13;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo1 {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            list.addFirst("alkvnanvvnajrnvaodjk" );
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

        ArrayList<String> arrayList = new ArrayList<>();
        long startTime1 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            arrayList.add("alkvnanvvnajrnvaodjk");
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println(endTime1-startTime1);
    }
}
