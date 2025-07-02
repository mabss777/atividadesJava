import java.util.Scanner;
public class jogoDaVeia{
 
    public static void main(String[] args) {
        int[][] tabuleiro = new int[3][3];
        int numRodadas = 0;
        int jogadores = 0; 
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int j = 0;
        
        do{
            socorro();
           for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {        
                System.out.println(tabuleiro[i][j] + "\t");
                    }                                 
                }            
            
            System.out.println("Deseja finalizar? digite 1 para sair e digite 2 para continuar!");
            sair = scanner.nextInt();

            switch(sair){
                case 1:
                    System.out.println("========== JOGO ENCERRADO ===============");
                case 2:
                     System.out.println("========= Vamos continuar este jogo! ========");
             } 
            }while(sair = 2); 

            public static int socorro() {

            System.out.println("Rodada "+ (numRodadas + 1) );
            System.out.println("Eh a vez do jogador "+ (jogadores+1));
            
            System.out.println("Qual linha voce ira escolher?");
            tabuleiro[i] = scanner.nextInt();
            
            System.out.println("Qual coluna voce ira escolher?");
            tabuleiro[j] = scanner.nextInt();
            }       
        }    
    }