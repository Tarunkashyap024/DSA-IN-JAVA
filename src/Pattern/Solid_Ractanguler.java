package Pattern;

import java.util.Scanner;

public class Solid_Ractanguler {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number :");
        int n = sc.nextInt();;

        for (int row = 1; row <= n; row++)
        {
            for (int col = 1; col <= 8; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
