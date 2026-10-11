package OOPs;
            /*Super keyword */

public class keyword {

    public  int a =10;
}
class mobile extends keyword
{
    public int a = 20;
    void show()
    {
        System.out.println(a);
        System.out.println(super.a);
    }

    static void main(String[] args) {
        mobile x = new mobile();
        x.show();
    }
}
