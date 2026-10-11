package OOPs;
                     /* this keyword */

public class This1 {
    public int a;
    //Parameterized Ctor
    This1(int a)
    {

        this.a = a;
    }
    void show()
    {

        System.out.println(a);
    }

    static void main(String[] args) {
        This1 x = new This1(200);
        x.show();
    }
}
