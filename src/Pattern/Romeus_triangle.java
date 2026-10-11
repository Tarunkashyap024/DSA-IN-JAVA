package Pattern;

import java.util.Scanner;

public class Romeus_triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number :");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++)
        {
            //Space print
            for (int col = 1; col<= n-row; col++)
            {
                System.out.print(" ");
            }
            // star print
            for (int col = 1; col <= n; col++)
            {
                System.out.println();
            }
        }

        sc.close();
    }
}
