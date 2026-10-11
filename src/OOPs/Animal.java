package OOPs;

/* Run time polymorphism / Method Overriding */

public class Animal {

    void sound()
    {
        System.out.println("Animal sounds:");
    }
}
class dog extends Animal
{
    @Override
   void sound()
   {
       System.out.println("Dog Sound Barks:");
   }

    static void main(String[] args) {
        dog x = new dog();
        x.sound();
    }



}