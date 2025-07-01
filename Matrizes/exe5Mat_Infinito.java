import java.util.Random;

public class exe5Mat_Infinito {
    public static void main(String[] args) {
        Random numRandomico = new Random();
        int[][] quadradoMagico = new int[3][3];
        boolean magico;

        do {
            int[] somaLinhas = new int[3];
            int[] somaColunas = new int[3];
            int diagonalPrincipal = 0;
            int diagonalSecundaria = 0;
            magico = true;

            // Gerar nova matriz aleatória
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    quadradoMagico[i][j] = numRandomico.nextInt(300) + 1;
                    System.out.print(quadradoMagico[i][j] + "\t");
                }
                System.out.println();
            }

            // Calcular somas
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    somaLinhas[i] += quadradoMagico[i][j];
                    somaColunas[j] += quadradoMagico[i][j];
                    if (i == j) diagonalPrincipal += quadradoMagico[i][j];
                    if (i + j == 2) diagonalSecundaria += quadradoMagico[i][j];
                }
            }

            int valorMagico = somaLinhas[0];

            for (int i = 0; i < 3; i++) {
                if (somaLinhas[i] != valorMagico || somaColunas[i] != valorMagico) {
                    magico = false;
                    break;
                }
            }

            if (diagonalPrincipal != valorMagico || diagonalSecundaria != valorMagico) {
                magico = false;
            }

            System.out.println("\nResultado:");
            if (magico) {
                System.out.println(" EH UM QUADRADO MAGICO!!! \n");
            } else {
                System.out.println(" Nao eh um quadrado magico... tentando de novo!\n");
            }

        } while (!magico);
    }
}