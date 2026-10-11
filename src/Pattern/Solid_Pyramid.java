package Pattern;

import java.util.Scanner;

public class Solid_Pyramid {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");

        int n = sc.nextInt();

        for (int row = 1; row <= n; row++)
        {
            //Space print
           for (int col = 1; col <= n- row; col++)
           {
               System.out.print(" ");
           }

            //Star print
            for (int col = 1; col <= 2*row-1; col++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
