/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author canthony2
 */
public class demo1 {
    public static void main(String[] args) {
        
        //HashMap, Hashtable, TreeMap, LinkedHashMap
        
//        Map myMap = new HashMap();
//        myMap.put("small", new Integer(5));
//        myMap.put("medium", new Integer(100));
//        myMap.put("large", new Integer(1000));
//        
//        Integer i = (Integer)myMap.get("medium");
//        System.out.println(i);

        Map myMap = new HashMap();
        myMap.put(1, "January");
        myMap.put(2, "February");
        myMap.put(3, "March");
        
        String m = (String)myMap.get(1);
        System.out.println(m);
        
    }
}
