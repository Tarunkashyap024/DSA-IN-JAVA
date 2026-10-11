package OOPs;

                /* Multi-level Inheritance */

public class Alpha //Super class
{

    public int a = 10;
    public int b = 5;
    public int c;

    public void add() //Addition
    {
        c = a + b;
        System.out.println("The sum of two Numbers :" + c);

    }
    public  void sub() //subtraction
    {
        c = a - b;
        System.out.println("The subtraction of two Numbers :"+c);
    }

}
class beta extends  Alpha //Sub 1 class
{
    public void mul() //Multiplication
    {
        c = a * b;
        System.out.println("The Multiplication of two Number:"+c);
    }
    public void div()//Division
    {
        c = a / b;
        System.out.println("The Division of two Numbers ;"+c);
    }
}
class gama extends  beta//Sub2 class
{
    public void mod()
    {
        c = a % b;
        System.out.println("The Modulus of two Number :"+c);
    }

    static void main(String[] args) {
        gama sc = new gama();
        sc.add(); sc.sub(); sc.mod(); sc.mul(); sc.div();

    }
}
