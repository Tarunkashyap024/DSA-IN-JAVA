package Pattern;

import java.util.Scanner;

public class inverted_solid_pyramid {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++)
        {
            //Space print
            for (int col = 1; col <= row-1; col++)
            {
                System.out.print("  ");
            }
            //star print
            for (int col = 1; col <= 2*n-2*row +1; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
