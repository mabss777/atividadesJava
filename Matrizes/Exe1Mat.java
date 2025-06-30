import java.util.Scanner;
public class Exe1Mat {
 
    public static void main(String[] args) {
        int[][] numDigitado = new int[5][5];
        int somaImpares = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5; i++){
            for(int a=0; a<5; a++){
                System.out.print("Digite o valor da posicao [" + i + "][" + a + "]: ");
                numDigitado[i][a] = scanner.nextInt();

                if (numDigitado[i][a] %2 != 0){
                    somaImpares += numDigitado[i][a];
                }
            }
        }
 
       
       System.out.println("\nSoma dos numeros impares: " + somaImpares);
       for(int a=0; a<5; a++){
        int somaColuna = 0;

        for(int i=0; i<5; i++){
            somaColuna += numDigitado[i][a];
        }
        System.out.println("Coluna "+ a +": "+somaColuna);
       }
        for (int i = 0; i < 5; i++) {
            int somaLinha = 0;
            for (int a=0; a < 5; a++) {
                somaLinha += numDigitado[i][a];
            }
            System.out.println("Linha " + i + ": " + somaLinha);
        }

       
        scanner.close();
    }
}