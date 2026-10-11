package BasicMaths;

import java.util.Scanner;

public class GCD {
    static void main(String[] args) {

        //gcd(a , b) = gcd (b, a%b)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of A :");
        int a = sc.nextInt();
        System.out.println("Enter the Value of B :");
        int b = sc.nextInt();

        while (b !=0)
        {
            int oldvaluseofb = b;
            b = a % b;
            a = oldvaluseofb;

            int ans = a;
            System.out.print(ans);
        }
    }
}
