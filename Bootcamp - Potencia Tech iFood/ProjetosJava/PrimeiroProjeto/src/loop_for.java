import java.util.Scanner;

public class loop_for {
    
    //Mostrar a tabuada com o usuário inserido de qual número ele quer ver.

    public static void calcularTabuada() {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tabuada?");
        numero = sc.nextInt();

        System.out.println("Tabuada de " +numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + numero*i);
        }

    }

    //Calcular fatorial - Essa foi a minha resposta.
    public static void calcularFatorial() {
        int numero, fatorial;
        Scanner sc = new Scanner(System.in);
        String resposta;

        System.out.println("Qual número?");
        numero = sc.nextInt();
        fatorial = numero;
        resposta = numero + "! = " + numero + "x";

        for (int i = 1; i < numero; i++) {
            fatorial *= numero-i;
            if (i == (numero-1))
                resposta += (numero-i) + " = ";
            else    
                resposta += (numero-i) + "x";
        }

        System.out.println(resposta + fatorial);
        
    }

    //Calcular fatorial - resposta do curso
    public static void calcularFatorial2 () {
        int numero, resultadoFatorial = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número: ");
        numero = sc.nextInt();

        System.out.print(numero + "! = ");                  //o PRINT permite imprimir ele e o que vem depois na mesma linha
        for (int i = numero; i >= 1; i--) {
            resultadoFatorial *= i;
            if (i == 1)                                     //essa impressão eu acrescentei       
                System.out.print(i + " = ");
            else
                System.out.print(i + "x");
        }

        System.out.print(resultadoFatorial);
    }


    public static void main(String[] args) {
        //calcularTabuada();
        //calcularFatorial();
        calcularFatorial2();
    }

}
