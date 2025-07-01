import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        menuCalculadora();

        System.out.print("Digite o número da operação desejada: ");
        int operacao = scanner.nextInt();

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
        }

        scanner.close();
    }

    public static void menuCalculadora() {

        System.out.println("============= SEJA BEM VINDO A CALCULADORA =============");
        System.out.println("==== Escolha a operação! ====");
        System.out.println("▶▶▶▶▶▶ Multiplicar: 1 ◀◀◀◀◀◀◀");
        System.out.println("▶▶▶▶▶▶ Somar: 2 ◀◀◀◀◀◀◀");
        System.out.println("▶▶▶▶▶▶ Subtrair: 3 ◀◀◀◀◀◀");
        System.out.println("▶▶▶▶▶▶ Dividir: 4 ◀◀◀◀◀◀");
        System.out.println("▶▶▶▶▶▶ Resto da Divisão: 5 ◀◀◀◀◀◀");
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