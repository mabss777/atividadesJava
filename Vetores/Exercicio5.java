import java.util.Scanner;
 
public class Exercicio5 {
 
    public static void main(String[] args) {
 
        String[] alunos = new String[15];
        double[] notas = new double[15];  
 
        Scanner scanner = new Scanner(System.in);
 
        for (int i = 0; i < 15; i++) {
 
            System.out.println("Digite o nome do aluno " + (i + 1) + ":");
            alunos[i] = scanner.nextLine();
 
            System.out.println("Digite a nota do aluno " + alunos[i] + ":");
            notas[i] = scanner.nextDouble();
 
            scanner.nextLine(); 
        }
 
        
        double soma = 0;
        for (int i = 0; i < 15; i++) {
            soma += notas[i];
        }
        double mediaGeral = soma / 15;
 
        System.out.println("Média geral da turma: " + mediaGeral);
 
        scanner.close();
    }
}