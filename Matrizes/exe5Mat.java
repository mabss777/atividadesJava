import java.util.Random;

public class exe5Mat {
    public static void main(String[] args) {
        int[][] quadradoMagico = new int[3][3];
        Random aleatorio = new Random();

        System.out.println("Matriz 3x3 com numeros aleatorios:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                quadradoMagico[i][j] = aleatorio.nextInt(10) + 1;
                System.out.print(quadradoMagico[i][j] + "\t");
            }
            System.out.println();
        }

        int[] somaLinhas = new int[3];
        int[] somaColunas = new int[3];
        int diagonalPrincipal = 0;
        int diagonalSecundaria = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaLinhas[i] += quadradoMagico[i][j];
                somaColunas[j] += quadradoMagico[i][j];
                if (i == j)
                    diagonalPrincipal += quadradoMagico[i][j];
                if (i + j == 2)
                    diagonalSecundaria += quadradoMagico[i][j];
            }
        }

        boolean ehMagico = true;
        int valorMagico = somaLinhas[0];

        for (int i = 0; i < 3; i++) {
            if (somaLinhas[i] != valorMagico || somaColunas[i] != valorMagico) {
                ehMagico = false;
                break;
            }
        }

        if (diagonalPrincipal != valorMagico || diagonalSecundaria != valorMagico) {
            ehMagico = false;
        }

        System.out.println(ehMagico ? "\nE um quadrado magico!" : "\nNao e um quadrado magico.");
    }
}
