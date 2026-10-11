package Arrays;

import java.util.Scanner;

public class MaxTwoDArray {
    static void main(String[] args)
    {
        int mat[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int maxvlaue = mat[0][0];

         // Input Section
        for (int i = 0; i< mat.length;i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                mat[i][j] =  sc.nextInt();
            }

        }

        // decision Section
        for (int i = 0; i< mat.length;i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
              if (mat[i][j] > maxvlaue)
              {
                  maxvlaue = mat[i][j];
              }
            }

        }
        System.out.println(maxvlaue);
    }
}
