import java.util.*; 

public class Hashing {
    public static void main(String args[])
    {
        //visit elements in a sortd manner using TreeSet
        Set<String> names = new TreeSet<String>();

        //main characters
        String myArray1[] = {"me","Tabitha", "B", "C", "D", "E"};

        for(String str: myArray1)
        {
            names.add(str);
        }

        //minor characters
        String myArray2[] = {"Tabitha", "Mary", "Tess", "Hillary", "Erick"};

        //include minor characters
        for(String str: myArray2)
        {
            if(!names.contains(str))
            {
                names.add(str);
            }
           
        }
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
    
    }
}
