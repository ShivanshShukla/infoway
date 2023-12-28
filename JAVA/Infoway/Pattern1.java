package Infoway;

class Pattern1 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");
            }
            for (int a = 7; a > i; a--) {
                System.out.print("  ");
            }
            for (int b = 2 * (8 - i); b > 2; b--) {
                System.out.print(" ");
            }
            for (int c = 0; c <= i; c++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
}