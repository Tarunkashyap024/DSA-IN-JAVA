package Pattern;

import java.util.Scanner;

public class Hollow_Rectangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter The first  Number :");
//        int n = sc.nextInt();
//        System.out.println("Enter  The second Number :");
//        int m = sc.nextInt();
        int row,col;


        for ( row = 1; row <=4;row++);
        {
            for ( col = 1; col <= 5; col++)
            {
                if(row == 1 || col == 1 || row == 4 || col == 5 )
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
