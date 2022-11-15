import java.util.Random;

public class matriz {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {                       // i = linhas     j = colunas
                matriz[i][j] = random.nextInt(9);
            }
        }

        for (int[] linha : matriz) {                                           // cria uma elemento linha do tipo matriz
            for (int coluna : linha) {                                         // itera sobre o elemento linha para pegar os valores e acrescetar ao elemento coluna
                System.out.print(coluna + " ");
            }
            System.out.println();
        }



           
    }
}
