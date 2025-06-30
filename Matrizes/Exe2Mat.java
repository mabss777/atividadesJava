import java.util.Scanner;
public class Exe2Mat {
    public static void main(String[] args) {
       int[][] numeros = new int[3][5];
       int pares = 0;
       int impares = 0;
        boolean temRepetido = false;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < 5; a++) {
                System.out.print("Digite o valor da posicao [" + i + "][" + a + "]: ");
                numeros[i][a] = scanner.nextInt();

                if (numeros[i][a] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        for (int i1 = 0; i1 < 3; i1++) {
            for (int a1 = 0; a1 < 5; a1++) {
                for (int i2 = 0; i2 < 3; i2++) {
                    for (int a2 = 0; a2 < 5; a2++) {                        
                        if (!(i1 == i2 && a1 == a2) && numeros[i1][a1] == numeros[i2][a2]) {
                            temRepetido = true;
                        }
                    }
                }
            }
        }
        System.out.println("\nA matriz possui elementos repetidos? " + (temRepetido ? "Sim" : "Nao"));
        System.out.println("Quantidade de numeros pares: " + pares);
        System.out.println("Quantidade de numeros impares: " + impares);

        scanner.close();
    }

    
}

