package Methods;

//Create a method ISEVEN(int NUMBER) that returns true if Number is even

public class question_3 {
    static boolean ISEVEN( int NUMBER) {

        if(NUMBER % 2 ==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("ODD:");
        }

        return true;

    }

    static void main(String[] args) {
        ISEVEN(5);
    }
}
