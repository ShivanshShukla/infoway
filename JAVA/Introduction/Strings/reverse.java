package Strings;

public class reverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        for (int i = sb.length() - 1; i >= 0; i--) {
            System.out.print(sb.charAt(i));
        }
    }
}
