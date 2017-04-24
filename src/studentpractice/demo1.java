/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author canthony2
 */
public class demo1 {
    public static void main(String[] args) {
        
        //HashMap, Hashtable, TreeMap, LinkedHashMap
        //(key, value)
        
        //No Generics
        Map myMap = new HashMap();
        myMap.put("small", new Integer(5));
        myMap.put("medium", new Integer(100));
        myMap.put("large", new Integer(1000));
        
        Integer i = (Integer)myMap.get("medium");
        System.out.println(i);

        //No Generics
        Map monthMap = new HashMap();
        monthMap.put(1, "January");
        monthMap.put(2, "February");
        monthMap.put(3, "March");
        
        String m = (String)monthMap.get(1);
        System.out.println(m);
        
        //With Generics
        //Map<key, value> mapName = new MapType<>();
        
    }
}
