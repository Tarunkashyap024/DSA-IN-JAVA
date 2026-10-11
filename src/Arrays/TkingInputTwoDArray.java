package Arrays;

import java.util.Scanner;

public class TkingInputTwoDArray {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][3];

       //input
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                mat[i][j] = sc.nextInt();

            }

        }
        //prin
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                System.out.print(mat[i][j] + " ");

            }
            System.out.println();

        }



    }
}
