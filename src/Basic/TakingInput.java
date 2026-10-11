package Basic;
import java.util.Scanner;

public class TakingInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  The First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number :");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum of :" + sum);


        sc.close();
    }

}
