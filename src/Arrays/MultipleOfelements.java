package Arrays;

public class MultipleOfelements {
    static void main(String[] args) {
        int arr[] = {2,4,5,7,8,6};

        int mul = 1;

        for (int i = 0; i < arr.length; i++)
        {
            mul *= arr[i];
        }
        System.out.println("The Multiplication of array elements :" + mul);
    }
}
