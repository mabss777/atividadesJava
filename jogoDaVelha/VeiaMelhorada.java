import java.util.Scanner;
public class VeiaMelhorada{
    static int[][] matriz = new int[3][3];
    public static void main(String[] args) {  //cadeia principal
        
        // ==================== Variaveis ==================== 
        int linha = 0;
        int coluna = 0;
        int numRodadas = 0;

        Scanner scanner = new Scanner(System.in); 

        
        
        //==================== Loop Principal ==================== 

        for(numRodadas = 0; numRodadas < 9; numRodadas++){
            System.out.println("Rodada "+ (numRodadas + 1) +"!" );

            tabuleiro();

            System.out.println("Qual linha voce ira escolher?");
            linha = scanner.nextInt();

            System.out.println("Qual coluna voce ira escolher?");
            coluna = scanner.nextInt();
        }


        }
    public static void tabuleiro(){
        System.out.println();
        for(int linha = 0; linha < 3; linha++){
            for(int coluna = 0; coluna < 3; coluna++){
                System.out.print("  ");
                if(coluna < 2)
                System.out.print("|");
                }
                System.out.println();
                if(linha < 2)
                System.out.println("--------");
            }
        }

    public static int vencedor(){
        

    
        for(int linha = 0; linha < 3; linha++){ //lendo as linhas 3 vezes
            if(matriz[linha][0] != 0 && matriz[linha][0] == matriz[linha][1] && matriz[linha][1] == matriz[linha][2]){
                return matriz[linha][0];
            }
                }
        for(int coluna = 0; linha < 3; linha++){ //lendo as linhas 3 vezes
            if(matriz[coluna][0] != 0 && matriz[coluna][0] == matriz[coluna][1] && matriz[coluna][1] == matriz[coluna][2]){
                return matriz[coluna][0];
            }
                }

            }
}