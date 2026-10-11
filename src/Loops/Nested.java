package Loops;

public class Nested {

    static void main(String[] args) {

        //Nested loop

        for (int i =1; i <= 5; i++) // Rows
        {
            for (int j = 1; j <= 5; j++) // Column
            {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line
        }

        //Second loop
        for (int k = 1; k <= 5; k++)
        {
            for (int l = 1; l <= 5;l++)
            {
                System.out.print(", k = " + k + ", l = " + l );
            }
            System.out.println();
        }


        //Break Stmt
        for (int q = 1; q <= 10; q++)
        {
            if (q == 6)
            {
                break;
            }
            System.out.println(q);
        }

        //Continue Stmt
        for (int y = 1; y <= 12; y++)
        {
            if (y == 10)
            {
                continue;
            }
            System.out.println(y);
        }
    }
}
