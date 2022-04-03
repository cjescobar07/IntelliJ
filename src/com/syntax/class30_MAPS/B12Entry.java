package com.syntax.class30_MAPS;

import java.util.HashSet;
import java.util.Set;

public class B12Entry {
    String key;
    Double value;
    String name = "Chris";

    public B12Entry(String key, Double value) {
        this.key = key;
        this.value = value;
    }
    String getKey(){
        return key;
    }
    Double getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "B12Entry{" +
                "key='" + key + '\'' +
                ", value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Set<B12Entry> entries = new HashSet<>();
        entries.add(new B12Entry("Apple", 12.0));
        entries.add(new B12Entry("Mango", 15.0));
        entries.add(new B12Entry("Banana", 18.0));
        entries.add(new B12Entry("Kiwi", 12.0));
        System.out.println(entries);

        for (B12Entry b:entries) {
            System.out.println(b);
            System.out.println(b.getKey());
            System.out.println(b.getValue());
        }
    }
}