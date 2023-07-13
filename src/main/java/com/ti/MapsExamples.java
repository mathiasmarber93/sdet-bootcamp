package com.ti;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapsExamples {


    public static void main(String[] args) {
        Map<String, List<String>> dropDownInfo = new LinkedHashMap<>();
        List<String> lstFruit = new ArrayList<>();
        lstFruit.add("Pineapple");
        lstFruit.add("Banana");
        lstFruit.add("Apple");
        lstFruit.add("Blueberry");

        dropDownInfo.put("Fruits", lstFruit);

        for(Map.Entry<String, List<String>> fruit: dropDownInfo.entrySet()){
            System.out.println("My " + fruit.getKey() + " contains" + fruit.getValue());
            fruit.getValue().forEach(x->{
                if(x.equals("Banana")){
                    System.out.println("I found the banana");
                }
            });
        }

    }

}
