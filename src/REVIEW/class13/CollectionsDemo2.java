package REVIEW.class13;

import org.apache.xmlbeans.InterfaceExtension;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Chris");
        names.add("Jacob");
        names.add("Sebastian");
        names.add("Doggy");

        /*Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            if(iterator.next().length()>5){
                iterator.remove();
            }
        }
        System.out.println(names);
         */

        ListIterator<String> stringListIterator = names.listIterator();
        //while (stringListIterator.)


    }
}
