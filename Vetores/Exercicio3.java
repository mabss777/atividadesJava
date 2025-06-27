import java.util.Scanner;
 
public class Exercicio3 {
 
    public static void main (String[] args){
 
    double[] numeros= new double [10];
 
 
    for(int i=0; i<10; i++){
 
            numeros[i] =(int)(Math.random()*101);
       
        }
 
        double maior = numeros[0];
        double menor = numeros[0];
 
        for (double numero : numeros) {
            System.out.println(numero);
 
           
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
 
    System.out.println("Qual o maior numero: " +maior);
    System.out.println("Qual o menor numero: " +menor);
    }
   
  }