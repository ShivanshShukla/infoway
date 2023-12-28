package Strings;

import java.util.*;

public class Stringbuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string ");
        // String Str = sc.nextLine();
        StringBuilder sb = new StringBuilder("new string");
        System.out.println();

        // character at index:
        System.out.println(sb.charAt(0));

        // set characte at:
        sb.setCharAt(1, 'C');
        System.out.println(sb);

        // insert character at:

        sb.insert(0, "A");
        System.out.println(sb);

        // delete char at:

        sb.delete(0, 3);

        // append:
        sb.append("a");

    }

}
