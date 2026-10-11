package Strings;

public class CountStringWithoutLength {

    static void main(String[] args) {
        String name = "tarun kashyap";

        int count = 0;

        for (int i = 0; i <name.length(); i++)
        {
            count++;
        }
        System.out.println(count);
    }
}
