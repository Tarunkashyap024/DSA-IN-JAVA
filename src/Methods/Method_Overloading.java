package Methods;

public class Method_Overloading {

    static int add( int a,int b)
    {
        return  a +b;
    }
    static int add(int a,int b,int c)
    {
        return  a + b + c;
    }

    static void main(String[] args) {
        System.out.println(add(6,8));
        System.out.println(add(9,2,5));
    }
}
