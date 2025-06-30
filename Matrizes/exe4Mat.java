public class exe4Mat {
    public static void main(String[] args) {

        System.out.println("1. Quadrado Cheio:");
        for (int i = 0; i < 4; i++) {         
            for (int j = 0; j < 4; j++) {     
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("2. Quadrado Oco:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("3. Triangulo Inferior:");
        for (int i = 0; i < 4; i++) {          
            for (int j = 0; j < 4; j++) {      
                if (j <= i) {                  
                    System.out.print("* ");
                } else {
                    System.out.print("  ");  
                }
            }
            System.out.println();
        }

    }
}