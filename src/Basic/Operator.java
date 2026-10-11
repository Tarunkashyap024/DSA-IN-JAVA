package Basic;

public class Operator {
    static void main(String[] args) {

        //Assignment operator
        int num1 = 12;
        int num2 = 10;

        int addition = num1  + num2;
        int subtract = num1 - 2;
        int multiply = num2 * 5;
        int divide = num1 / 2;
        int remainder = num2 % 3;

        System.out.println(addition);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(remainder);

        //Relational operator


        System.out.println("Relational Operator:");
        int num3 = 24;
        int num4 = 48;

        System.out.println(num3 == num4);
        System.out.println(num3 != num4);
        System.out.println(num3 > num4);
        System.out.println(num3 < num4);
        System.out.println(num3 >= num4);
        System.out.println(num3 <= num4);

        //Arithmetic operator

        System.out.println("Assignment operator");

        int num5 = 120;             //num5 = 120
        num5 +=10;                  //num5 = num5 + 10
        System.out.println(num5);
        num5 -= 30;                 //num5 = num5 -  30
        System.out.println(num5);
        num5 *= 2;                  //num5 = num5 * 2
        System.out.println(num5);
        num5 /= 2;                  // num5 = num5 /2
        System.out.println(num5);
        num5 %= 25;                 //num5 = num5 % 25
        System.out.println(num5);

        //increment and decrement
        int num6 = 60;
        int prefix = ++num6;
        int postfix = num6++;


        System.out.println(prefix);
        //prefix = 61
        System.out.println(postfix);
        //postfix = 61
        System.out.println(num6);
        //num6 = 62





    }
}
