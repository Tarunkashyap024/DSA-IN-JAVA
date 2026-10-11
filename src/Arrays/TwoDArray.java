package Arrays;

public class TwoDArray {

    static void main(String[] args) {

        //Declaration
        int mat[][];

        //Allocation
        mat = new  int[4][3];

        //initiazation

        int bat[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //Acessing elements

        for (int i = 0; i < bat.length; i++)
        {
            for (int j = 0;j < bat.length;j++)
            {
                System.out.print(bat[i][j] + " ");
            }
            System.out.println();
        }


    }
}
