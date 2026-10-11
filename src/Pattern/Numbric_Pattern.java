package Pattern;

import java.util.Scanner;

public class Numbric_Pattern {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number :");
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
