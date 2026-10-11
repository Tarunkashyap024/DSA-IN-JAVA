package Arrays;

import java.util.Scanner;

public class TakinginputInArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];


        for (int i = 0; i <arr.length; i++)
        {
            System.out.println("provides input for index :" +i);
            arr[i] = sc.nextInt();
        }

        System.out.println("you array contain");
        for (int i = 0; i < arr.length; i++)
        {

            System.out.println(arr[i]);
        }

    }
}
