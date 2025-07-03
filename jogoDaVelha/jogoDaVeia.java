import java.util.Scanner;
public class jogoDaVeia{

    public static void imprimirTabuleiro(char[][] tabuleiro){
        
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for ( int j = 0; j < 3; j++) {        
                System.out.print("\t"+tabuleiro[i][j]);
                if (j < 2)
                    System.out.print("\t|");
            }
            System.out.println();
             if (i < 2){
                System.out.println("____________________________________________________");
            }
            System.out.println();       
        }
    }
    
    public static void main(String[] args) {
        char[][] tabuleiro = 
        {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '},
        };

        

        System.out.println("############### BEM VINDOS AO JOGO DA VELHA ###############");

        pedidos();

        imprimirTabuleiro(tabuleiro);
    
        }
    
    public static int pedidos() {
        int numRodadas = 0;
        int jogadores = 0; 
        Scanner scanner = new Scanner(System.in);
        int[][] tabuleiro = new int[3][3];
        int i = 0;
        int j = 0;
        
            System.out.println("Rodada "+ (numRodadas + 1) );
            System.out.println("Eh a vez do jogador "+ (jogadores+1));
            
            System.out.println("Qual linha voce ira escolher?");
            tabuleiro[i] = Scanner.nextInt();
            
            System.out.println("Qual coluna voce ira escolher?");
            tabuleiro[j] = Scanner.next();
            } 
}

/*public static void limparTela(){
        try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e){
            System.out.println("Erro ao tentar limpar a tela!");
        }
    }*/