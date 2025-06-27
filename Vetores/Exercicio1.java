import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args){
        int[] numDigitado = new int[6];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<6; i++){

            System.out.println("Digite um numero inteiro: ");
            numDigitado[i] = scanner.nextInt();
        }

        for(int i = 0; i <6; i++){
            System.out.println("Valor "+(i+1)+": "+numDigitado[i]);
        }
    }
}