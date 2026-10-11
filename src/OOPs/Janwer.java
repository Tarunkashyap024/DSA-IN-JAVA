package OOPs;

            /* Abstract class */

abstract class Janwar {

    public abstract void eat();
//    public abstract void sleep();
//    public void sleep()
//    {
//        System.out.println("All animals sleeping :");
//    }

}
class Cow extends Janwar{

   public void eat()
   {
       System.out.println("Cow  is vegetarian");
   }

}
class lion extends Janwar
{

    public void eat()
    {
        System.out.println("Lion is Non-vegetarian");
    }
}
class Test
{
    static void main(String[] args) {
        Janwar x = new Cow();
        x.eat();
        lion z = new lion();
        z.eat();
//        x.sleep();

    }


}