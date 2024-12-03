import java.util.*;

public class map {
    public static void main(String args[])
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Kenya", "Nairobi");
        map.put("Uganda", "Kampala");
        map.put("Somalia", "Mogadishu");
        map.put("Tanzania", "Dodoma");


        System.out.println(map.get("Kenya"));

    //     System.out.println("Iterating over map:");
    //     for (Map.Entry<String, String> entry : map.entrySet()) {
    //         System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    //     }
    // 


    //returns all keys in the map
    for(String i: map.keySet())
    {
        System.out.println(i);
    }


    //returns all values in the map
    for(String i: map.values())
    {
        System.out.println(i);
    }

    //output the map ie both key and value
    System.out.println(map.entrySet());
    
}
}
