package BasicMaths;

import java.util.Scanner;

public class ArmstrongNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();
        int originalNum = num;

        int sum = 0;
        while (num != 0)
        {
            int digits = num % 10;
            int cube = (digits*digits*digits);
            sum = sum + cube;

            num = num /10;
        }

        if (originalNum == sum)
        {
            System.out.println("Armstrong Number:");
        }
        else {
            System.out.println("Not Armstrong :");
        }

    }
}
