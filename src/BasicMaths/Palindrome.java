package BasicMaths;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
                                                  // 1st Step is input reverse
                                                  // 2nd step is compare to original and reverse
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Original value :");

        int num = sc .nextInt();
        int original = num;
        int rev = 0;

        System.out.println("This is original Value : " + num);

        while (num  != 0)
        {
            int digits = num % 10;
             rev = rev * 10 + digits;

             num = num / 10;

        }
        System.out.println("This is Reverse value "+rev);
        if (original == rev)
        {
            System.out.println("Is palindrome:");
        }
        else
        {
            System.out.println("Is Not Palindrome:");
        }

    }
}
