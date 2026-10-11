package OOPs;

          /* Hierarchical Inheritance*/

public class Super //super class
{
    public String surename = "Kashyap";

    public void sure()
    {
        System.out.println(surename);
    }
}
class sub1 extends Super // Sub1 class
{
    public String name = "Tarun";
    public void nam()
    {
        System.out.println(name);
    }

}
class sub2 extends Super //sub2 class
{
    public String name = "Yaman";
    public  void dam()
    {
        System.out.println(name);
    }

}
class  sub3 extends  Super //Sub 3 class
{
   public String name = "ritwik";
   public void kam()
   {
       System.out.println(name);
   }

}
class test
{
    static void main(String[] args)
    {
        sub1 s1 = new sub1();
        s1.nam();s1.sure();

        sub2 s2 = new sub2();
        s2.dam(); s2.sure();

        sub3 s3 = new sub3();
        s3.kam(); s3.sure();
        
    }

}
