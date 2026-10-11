package Collection_framework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;


public class basic {
    static void main(String[] args) {
//        List or collection  -> interface

//        ArrayList -> concrete class
        ArrayList<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
//        Collection<Integer> collection = new ArrayList<>();

        // Methods -> add
         list.add(20);
         list.add(40);
         list.add(50);
        System.out.println(list);
        list.add(60);
        System.out.println(list);
        
        // Methods -> remove
        list.removeFirst();
        System.out.println(list);

        // Methods -> addAll
        list2.add(100);
        list2.add(110);
        list2.add(120);
        System.out.println(list2);

        list.addAll(list2);
        System.out.println(list);

        // Methods -> removeAll
        list.removeAll(list2);
        System.out.println(list);

        //get methods
        System.out.println(list.get(0));

        // Methods - > size()
        System.out.println(list.size());

        System.out.println("Printing list " +list);

////       //Methods -> clear()
//        list.clear();
//        System.out.println("Printing list " +list);
//
//        Collection<Integer> col = new ArrayList<>();
//        col .add(60);
//
//        col.add(50);
//        col.add(90);
//        System.out.println("New Collection "+col);
//
//        // Methods sort -> arrange the elements
//
//        col.sort(col);
//        System.out.println(col);
        System.out.println(list);
        System.out.println(list2);






        


    }
}
