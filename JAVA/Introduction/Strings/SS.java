package Strings;

class PP {
    public static void main(String[] args) {
        String str = "hello";
        String rev_str = "";
        int l = str.length();
        l -= 1;
        while (l >= 0) {
            // System.out.println(str.charAt(l));
            rev_str += str.charAt(l);
            l--;
        }
        System.out.println(rev_str);

    }
}