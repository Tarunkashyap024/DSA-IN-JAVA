package OOPs;
            /* Compile time polymorphism / Method overloading */

public class overloading {


    //Method -1
    void add(int a, int b)
    {
       int  c = a +b;
        System.out.println(c);
    }

    //Method -2
    void add(int a,int b,int c)
    {
       int  d = a + b + c;
        System.out.println(d);
    }

    //Method -3
    void add(String n,int a)
    {
       String name = n;
       int age = a;
        System.out.println(n + " " + a);
    }

    static void main(String[] args) {
        overloading x = new overloading();
        x.add(10,20);
        x.add("Tarun",20);
        x.add(30,40,50);
    }
}


