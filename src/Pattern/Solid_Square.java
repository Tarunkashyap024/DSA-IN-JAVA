package Pattern;

import java.util.Scanner;

public class Solid_Square {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number :");
        int n = sc.nextInt();

        for (int rows = 1; rows <=n ; rows++)   //Row3
        {
            for (int  col = 1; col <= n; col++) //column
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
