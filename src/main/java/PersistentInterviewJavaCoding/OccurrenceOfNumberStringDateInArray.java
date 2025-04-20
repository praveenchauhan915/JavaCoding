package PersistentInterviewJavaCoding;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfNumberStringDateInArray {
    public static void main(String[] args) {
        Object[] array = {
                "apple", 42, "banana", 42,
                new Date(2024 - 1900, Calendar.APRIL, 18),
                "apple",
                new Date(2024 - 1900, Calendar.APRIL, 18),
                99, "banana"
        };

        Map<Object,Integer> stringCount = new HashMap<>();
        Map<Object, Integer> integerCount = new HashMap<>();
        Map<Object, Integer> dateCount = new HashMap<>();

        for(Object obj : array){
            if(obj instanceof String){
                stringCount.put(obj,stringCount.getOrDefault(obj,0) +1);
            } else if (obj instanceof Number) {
                integerCount.put(obj,integerCount.getOrDefault(obj,0)+1);
            } else if (obj instanceof Date) {
                dateCount.put(obj,dateCount.getOrDefault(obj,0) +1);
            }
        }
        System.out.println("String Occurrences");
        for (Map.Entry<Object, Integer> entry : stringCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nNumber Occurrences:");
        for (Map.Entry<Object, Integer> entry : integerCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nDate Occurrences:");
        for (Map.Entry<Object, Integer> entry : dateCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
