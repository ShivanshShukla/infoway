package Infoway;

class PP1 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 7; i++) {
            for (int b = 7; b > i; b--) {
                System.out.print("*");
            }
            for (int a = 0; a < i; a++) {
                System.out.print("  ");
            }
            for (int j = 7; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}