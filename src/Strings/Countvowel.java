package Strings;

public class Countvowel {

    static void main(String[] args) {

        String str = "Tarun kashyap";

        int count =0;
        for (int i =1; i <= str.length();i++) {
            char ca = str.charAt(i);
            if (ca == 'a' || ca == 'e' || ca == 'i' || ca == 'o' || ca == 'u' ||
                    ca == 'A' || ca == 'E' || ca == 'I' || ca == 'O' || ca == 'U') {
                count++;
            }
            System.out.println(count);
        }

    }
}
