package Strings;

import java.util.Scanner;

public class Base {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Declaretion
        String name = "Tarun";
        String lastname = "Kashyap";

        System.out.println(name + " " + lastname);


        //Create a string
        //simpe methods
        String str = "Tarun kashyap";

        //using new keyword

        String se = new String("Tarun");

        System.out.println(str);
        System.out.println(se);

        //methods

        //Find length in a string
        System.out.println(str.length());


        //Find a char in a string
        System.out.println(str.charAt(4));

        //Camparision in two string
        System.out.println(str.equals(se));


        String yname = " Tarun";
//        System.out.println(yname);
         yname = "Tarun";

        System.out.println(yname);


        //Input string

        System.out.println("Provides a string content:");
        String tname = sc.next();

        System.out.println("The use of next();"+ tname);


        System.out.println("Provides a string content:");
        String sname = sc.nextLine();
        System.out.println("The use of nextint() :" + sname);







    }
}
