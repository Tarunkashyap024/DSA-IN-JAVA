package OOPs;

                /* Interface */

import java.util.Scanner;

interface Client {

     void input(); //public + abstract
     void output(); //public + abstract
}
class aman implements Client
{
    String name;
    double sel;
    String add;
    public void input()
    {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the username:");
        name = c.nextLine();
        System.out.println("Enter the Address:");
        add = c.nextLine();
        System.out.println("Enter the Salary:");
        sel = c.nextDouble();


    }
    public void output()
    {
        System.out.println(name + " " +  sel + " " + add);
    }

    static void main(String[] args) {
        Client x = new aman();
        x.input(); x.output();
    }
}
