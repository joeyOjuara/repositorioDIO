import java.util.Scanner;

public class loop_do_while {
    
    // Ler 5 números e informar qual o maior número entres eles e a média deles
    private static void calcularMaiorEMedia() {
        int numero;
        int maiorNumero = 0;
        double mediaNumero = 0 ;
        int count = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Digite um número");
            numero = scan.nextInt();
            if (numero > maiorNumero)
                maiorNumero = numero;
            count++;
            mediaNumero += numero;
        } while (count < 5);

        System.out.println("O maior número é: " +maiorNumero);
        System.out.println("A média é: " +mediaNumero/5);

    };

    // Ler N números inteiros e dizer a quantidade de números pares e ímpares
    private static void contarParImpar () {
        int numero, parada;
        int numeroPar = 0, numeroImpar = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Numero:");
            numero = scan.nextInt();
            if ((numero % 2) == 0)
                numeroPar++;
            else
                numeroImpar++;
            System.out.println("Quer continuar? Digite 1 para Sim: ");
            parada = scan.nextInt();
        } while (parada == 1);

        System.out.println(numeroPar + " números Pares.");
        System.out.println(numeroImpar + " números Ímpares.");
    }



    public static void main(String[] args) {
        
        calcularMaiorEMedia();
        contarParImpar();
        


        



        


    }

}
