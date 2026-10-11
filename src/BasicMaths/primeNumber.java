package BasicMaths;

import java.util.Scanner;

public class primeNumber {
    static boolean primeorNot(int n ) {
        for (int i =2; i*i <= n;i++) {
            if (n % i == 0) {
                return false;
            }


        }

        return true;
    }

    static void main(String[] args) {
        int n = 6;
        System.out.println(primeorNot(n));
    }
//  static void main(String[] args) {
//
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the Numbers :");
//    int n = sc.nextInt();
//
//    for (int i = 2; i*i <= n; i++)
//    {
//        if (n % 2 == 0)
//        {
//            System.out.println("Not prime:");
//        }
//    }
//      System.out.println("Prime:");

//  }
}
