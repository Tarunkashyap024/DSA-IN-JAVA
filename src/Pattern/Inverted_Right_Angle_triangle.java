package Pattern;

import java.util.Scanner;

public class Inverted_Right_Angle_triangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber :");
        int n = sc.nextInt();

        for (int row = 1; row <=n; row++)
        {    // For each row -> variable column
            for (int col = 1; col <= n-row+1;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
