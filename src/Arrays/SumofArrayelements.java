package Arrays;

import java.util.Scanner;

public class SumofArrayelements {
    static void main(String[] args) {
        int mat[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i< mat.length;i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
             mat[i][j] =  sc.nextInt();
            }

        }

        for (int i = 0; i< mat.length;i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                sum += mat[i][j];

            }

        }
        System.out.println("The sum of : "+ sum);

    }
}
