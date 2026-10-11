package BasicMaths;

public class SumOfdigits {
    static void main(String[] args) {
        int num = 53546;
        int sum = 0;

        while (num != 0)
        {
            int digits = num % 10;
            sum +=digits;

            num = num /10;

        }
        System.out.println( "The sum of Digits : "+sum);
    }
}
