import java.util.Scanner;
 
public class Exercicio2 {
 
    public static void main (String[] args){
 
    double[] numeros= new double [10];
    int contadorPares = 0;
 
 
    for(int i=0; i<10; i++){
 
            numeros[i] =(int)(Math.random()*101);
       
        }
 
        for (double numero : numeros) {
            System.out.println(numero);
 
            if (((int)numero) % 2 == 0) {
                contadorPares++;
        }
    }
    System.out.println("Quantidade de numeros pares: " + contadorPares);
  }
}