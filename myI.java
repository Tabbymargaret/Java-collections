import java.util.*;

public class myI{
    public static void main(String[] args) {
        //create an empty list to store strings
        LinkedList<String> Ins = new LinkedList<String>();
        Collection<String> alist = new ArrayList<String>() ;
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        Iterator<Integer> it = list.iterator();
        //display items using iterator object

        System.out.println("List items using Iterator:");
        while(it.hasNext()){
            System.out.println(it.next());
        }

        String name[] ={"A","B","C","D","E"};
        for(int i=0;i<name.length;i++){
            Ins.add(name[i]);
        }
    }
}