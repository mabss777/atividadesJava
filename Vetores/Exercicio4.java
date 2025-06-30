import java.util.Scanner;
 
public class Exercicio4 {
 
    public static void main (String[] args){
 
    int[]valores= new int [6];
 
    for(int i=0; i<6; i++){
 
         int numeroRandomico = (int)(Math.random()* 101);
        valores[i]=numeroRandomico;
        System.out.println("Vetor na ordem normal "+(i+1)+": "+numeroRandomico);
 
        }
 
        System.out.println("\nVetor na ordem invertida:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println("Posicao " + (i + 1) + ": " + valores[i]);
        }
    }
 
 
}