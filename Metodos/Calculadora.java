import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    

        int operacao;
        
        do{
        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        menuCalculadora();

        System.out.print("Digite o numero da operacao desejada: ");
        operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado: " + multiplicar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado: " + soma(num1, num2));
                break;
            case 3:
                System.out.println("Resultado: " + subtrair((int)num1, (int)num2));
                break;
            case 4:
                System.out.println("Resultado: " + dividir((int)num1, (int)num2));
                break;
            case 5:
                System.out.println("Resultado: " + resto((int)num1, (int)num2));
                break;
            case 6:
                System.out.println("====== CALCULADORA ENCERRADA! ======");
            case 7:

            }
        } while(operacao != 6);


        scanner.close();
    }

    public static void menuCalculadora() {

       System.out.println("\n==== Escolha a operacao! ====");
            System.out.println("1 - Multiplicar");
            System.out.println("2 - Somar");
            System.out.println("3 - Subtrair");
            System.out.println("4 - Dividir");
            System.out.println("5 - Resto da Divisao");
            System.out.println("6 - Sair");
    }

    public static double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static int dividir(int numero1, int numero2) {
        return numero1 / numero2;
    }

    public static int subtrair(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static int resto(int numero1, int numero2) {
        return numero1 % numero2;
    }
}