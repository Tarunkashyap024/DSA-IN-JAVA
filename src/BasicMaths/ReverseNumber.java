package BasicMaths;

public class ReverseNumber {
    static void main(String[] args) {
        int num = 1234;
        int rev= 0;

        while(num != 0)
        {
            int digits = num %10;
            // 1st method
//            System.out.print(digits);

//            //2nd method
            rev = rev * 10 + digits;

            num = num /10;
        }
        System.out.println(rev);
    }
}
