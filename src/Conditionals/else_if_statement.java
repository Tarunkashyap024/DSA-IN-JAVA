package Conditionals;

public class else_if_statement {
    static void main(String[] args) {
        int accuracy = 76;

        if (accuracy >= 90 )
        {
            System.out.println("Eccellant:");
        } else if (accuracy>= 75)
        {
            System.out.println("Good:");
        }
        else
        {
            System.out.println("Needs Improvement :");
        }
    }
}
