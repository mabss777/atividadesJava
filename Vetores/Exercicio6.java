import java.util.Scanner;
 
public class Exercicio6 {
 
    public static void main(String[] args) {
 
       int[] valorA = new int[10]; 
       int[] valorB = new int[10]; 
       int[] valorC = new int[10];
       Scanner scanner = new Scanner(System.in);

       for(int a=0; a<10; a++){
        System.out.println("Digite o numero "+ (a+1) +" da tabela A: ");
        valorA[a] = scanner.nextInt();
       }
       
       for(int b=0; b<10; b++){
        System.out.println("Digite o numero "+ (b+1) +" da tabela B: ");
        valorB[b] = scanner.nextInt();
       }

       for (int c = 0; c < 10; c++) {
        valorC[c] = valorA[c] - valorB[c];
        }

        System.out.println("Vetor C (A - B):");
        for (int i = 0; i < 10; i++) {
        System.out.println("C[" + i + "] = " + valorC[i]);
        }
    }
}