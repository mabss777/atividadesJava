import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        int[] numeros = new int[6];
        int somaPares = 0;
        int qtdImpares = 0;

        Scanner scanner = new Scanner(System.in);

        // Entrada dos numeros
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "° numero inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNumeros pares digitados:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
                somaPares += num;
            }
        }

        System.out.println("\nSoma dos numeros pares: " + somaPares);

        System.out.println("\nNumeros impares digitados:");
        for (int num : numeros) {
            if (num % 2 != 0) {
                System.out.println(num);
                qtdImpares++;
            }
        }

        System.out.println("\nQuantidade de numeros impares: " + qtdImpares);

   
    }
}
