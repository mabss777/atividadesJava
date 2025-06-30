import java.util.Scanner;

public class exe3Mat {
    public static void main(String[] args) {
        double[][] diagonal = new double[4][4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor da posicao [" + i + "][" + j + "]: ");
                diagonal[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("\nDiagonal principal:");
        for (int a = 0; a < 4; a++) {
            System.out.print(diagonal[a][a] + " ");
        }

        System.out.println("\n\nDiagonal secundaria:");
        for (int s = 0; s < 4; s++) {
            System.out.print(diagonal[s][3 - s] + " ");
        }

        System.out.println("\n\nMatriz transposta:");
        for (int j = 0; j < 4; j++) {
            for (int v = 0; v < 4; v++) {
                System.out.print(diagonal[v][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}