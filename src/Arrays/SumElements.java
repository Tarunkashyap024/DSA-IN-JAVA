package Arrays;

public class SumElements {
    static void main(String[] args) {

        int arr[] = { 23,45,34,64,54,76,76,44};
         int sum = 0;


        for (int i = 0; i <arr.length; i++)
        {
            sum += arr[i];
        }
        System.out.println();
        System.out.println("The sum of array elements :" + sum);
    }
}
