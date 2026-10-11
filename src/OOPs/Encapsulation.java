package OOPs;

               /* Encapsulation in java */

public class Encapsulation
{

    private int a;// Data Hiding

    public void Setvalue(int x)//Setter
    {
         a = x;
    }
    public int getvalue()// Getter
    {
        return  a;
    }

}
class  over
{
    static void main(String[] args) {
        Encapsulation x = new Encapsulation();
        x.Setvalue(16);
        System.out.println(x.getvalue());
    }
}
