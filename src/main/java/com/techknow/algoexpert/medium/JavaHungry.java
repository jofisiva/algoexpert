package com.techknow.algoexpert.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class JavaHungry {
    public static void main(String[] args) {
        HashMap<String, Integer> hashmap = new HashMap();
        hashmap.put("Java", 1);
        hashmap.put("Hungry", 2);
        hashmap.put("Blogspot", 3);

      ArrayList<Integer> list = new ArrayList(hashmap.values());

        hashmap.values().forEach(a->{
            System.out.println(a);
        });

   hashmap.forEach( (k,v)->{
       System.out.println(k+","+v);
   });

        Iterator iteratorobject = hashmap.keySet().iterator();
        while (iteratorobject.hasNext()) {
            String hashmapkey = (String) iteratorobject.next();
            System.out.print(hashmap.get(hashmapkey));
        }
    }
}
