package Pattern;

import java.util.Scanner;

public class Hollow_Right_Angle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();

        for (int row = 1; row <= n;row++)
        {
            if (row == 1|| row==2|| row == n)
            {
                for (int col =1 ; col <= row;col++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                System.out.print("* ");
                for (int col = 1; col <= (row -2); col++)
                {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
