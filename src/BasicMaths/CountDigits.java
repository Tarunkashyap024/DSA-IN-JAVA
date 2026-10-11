package BasicMaths;

public class CountDigits {
    static void main(String[] args) {
        int num = 537657;

        int count = 0;

        while (num != 0)
        {
            int digits = num % 10;

            count++;

            num = num /10;
        }
        System.out.println(count);
    }
}
