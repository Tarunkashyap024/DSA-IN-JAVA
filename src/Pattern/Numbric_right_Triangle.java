package Pattern;

import java.util.Scanner;

public class Numbric_right_Triangle {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter a Number :");
        int n = sc.nextInt();
        int k = 1;

        for (int row  = 1; row <= n; row++)
        {
            for (int col = 1; col <= row; col++)
            {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
        sc.close();
    }
}
