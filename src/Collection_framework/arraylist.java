package Collection_framework;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class arraylist {
    static void main(String[] args) {

//        //Implementation Arraylist
//        ArrayList <Integer> list = new ArrayList<>();
//        list.add(50);
//        list.add(30);
//        list.add(40);
//        list.add(60);
//        System.out.println( "Print list"+list);
//
//        System.out.println(list.size());
//
//
//        // Methods -> sort the element
//        Collections.sort(list);
//        System.out.println(list);
//
//        // Methods -> clone
//        ArrayList<Integer> newlist = ( ArrayList<Integer>)list.clone();
//        System.out.println(newlist);
//
//        // Methods -> ensureCapacity()
//        ArrayList<Integer> age = new ArrayList<>();
//        age.ensureCapacity(18);
//        System.out.println(age);
//
//
//        // Methods -> isEmpty
//        System.out.println(newlist.isEmpty());


        //Implementation
        ArrayList<Integer> arrayList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Collection<Integer> col = new ArrayList<>();

        arrayList.add(50);
        arrayList.add(30);
        arrayList.add(40);

        list.add(40);
        list.add(20);
        list.add(50);

        col.add(60);
        col.add(50);
        col.add(90);

        System.out.println("ArrayList = "+ arrayList);
        System.out.println("List = "+list);
        System.out.println("collection = "+col);

        //  Methods ->


        System.out.println(arrayList.get(2));

        arrayList.set(1,100);
        System.out.println(arrayList);

        arrayList.toArray();
        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println(arrayList.size());

        arrayList.clear();

        System.out.println(arrayList);


        System.out.println(arrayList.isEmpty());






    }
}
