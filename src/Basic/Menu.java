package Basic;

import java.util.Scanner;

public class Menu {
    static void main(String[] args) {

        // Print Menu
        System.out.println("--- MENU ---");
        System.out.println("1.JAVA");
        System.out.println("2.PYTHON");
        System.out.println("3.C++");
        System.out.println("4.JAVASCRIPT");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Language Numbers:");
        int ch = sc.nextInt();

        //Condition
        if (ch == 1)
        {
            System.out.println("Java was created by James Gosling and his team at Sun Microsystem " +
                    " in 1991,originally"+" named Oak for digital devices" +
                    "before being renamed Java and released in 1995 for the web..");
        }
        else if (ch == 2)
        {
            System.out.println("Python was created by Guido van Rossum in the late 1980s as a " +
                    "successor the ABC language and was officially released in 1991");
        } else if (ch == 3) {
            System.out.println("C++ was created by Bjarne Stroustrup at Bell Labs in 1979, Originally developed as C with Classes..");

        } else if (ch == 4) {
            System.out.println("Javascript was created by Brendan Eich in 1995 in just 10 days while working at Netscape, originally named Mocha and later LiveScript before its final release.. ");

        }
        else
        {
            System.out.println("LANGUAGE IS NOT AVAILABLE IN CURRENT LANGUAGE MENU, Sorry...? ");
        }

        sc.close();

    }
}
