package Pattern;

import java.util.Scanner;

public class Hollow_Solid_Pyramid {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++)
        {
           for (int col = 1; col <= (n - row); col++)
           {
               System.out.print("  ");
           }
           if (row == 1 || row == n)
           {
               for (int col = 1; col <= (2*row-1); col++)
               {
                   System.out.print("* ");
               }
           }
           else
           {
               System.out.print("* ");
               for (int col =1 ; col <= (2*row-3); col++)
               {
                   System.out.print("  ");
               }
               System.out.print("* ");
           }
            System.out.println();
        }

    }
}
