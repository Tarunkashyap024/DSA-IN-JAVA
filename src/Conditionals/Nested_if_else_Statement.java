package Conditionals;

public class Nested_if_else_Statement {
    static void main(String[] args) {
        boolean hasSubcription = true;
        int solveproblem = 220;

        if (hasSubcription)
        {
            if (solveproblem >= 200)
            {
                System.out.println("Unlock Advanced sheet:" );
            }
            else
            {
                System.out.println("Practice more problem :");
            }

        }
        else
        {
            System.out.println("Upgrade to premium :");
        }

    }


}
