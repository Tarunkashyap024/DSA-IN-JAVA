package BasicMaths;

public class CountEvenDigits {
    static void main(String[] args) {
        int n =2343567;
        int count = 0;

        while (n != 0)
        {
            int digits = n %10;
            if (digits % 2==0) {
                System.out.println("Even Number in digits:+" + " "+ " "+ digits);
                count++;
            }
            n = n /10;
        }
        System.out.println("The count of even Number : " + count);
    }

}
