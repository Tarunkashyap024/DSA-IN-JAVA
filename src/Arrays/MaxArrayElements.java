package Arrays;

public class MaxArrayElements {
    static void main(String[] args) {

        int arr[] = { 23,34,21,98,54};

        int maxvalue = arr[0];
        int minvalue = arr[0];

        for (int i =0; i < arr.length;i++)
        {
            if (arr[i] > maxvalue)
            {
                maxvalue = arr[i];
            }

        }
        System.out.println("The maximum value of  an Array :"+ maxvalue);


        for (int i =0; i < arr.length;i++)
        {
            if (arr[i] < minvalue)
            {
                minvalue = arr[i];
            }

        }
        System.out.println("The Minimum value of  an Array :" + minvalue);
    }
}
