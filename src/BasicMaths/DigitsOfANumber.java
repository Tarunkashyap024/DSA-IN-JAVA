package BasicMaths;

public class DigitsOfANumber {
    static void printDigits(int num) {

        //Agar mera num =0 h ,to main rukjaunga
        //Agar mera num !=0 h to main processinng karta hu

        while(num != 0)
        {
            int digits = num % 10;
            System.out.println(digits);
            num = num /10;
        }

    }

    static void main(String[] args) {
        int num = 235434325;
        printDigits(num);
    }
}
