package OOPs;

public class Student {

//    Attributes
    public int id;
    public int age;
    public String name = "Tarun";
    public int NOS;
    public char grade;

//    Behaviour
    public void study()
    {
        System.out.println(name  + " Studing");
    }
    public void game()
    {
        System.out.println(name +" Gaming");
    }

      public static void main(String[] args){

        Student obj = new Student();
        obj.game();
        obj.study();

    }



}
