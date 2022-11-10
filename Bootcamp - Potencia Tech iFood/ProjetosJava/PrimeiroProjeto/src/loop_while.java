import java.util.Scanner;

public class loop_while {
    
    public static void main(String[] args) {
        
        // Ler um nome e idade e ficar repetindo até o usuário digitar "0" no nome.
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scanner.next();
            if (nome.equals("0"))
                break;
            System.out.println("Idade: ");
            idade = scanner.nextInt();

        }
        System.out.println("Fim do Programa");



        // Ler nota e repetir uma msg de nota inválida solicitando digitar novamente sempre que uma nota não esteja entre 0 e 10.
        int nota = 0;

        System.out.println("Digite uma nota: ");
        nota = scanner.nextInt();

        while (nota < 0 || nota > 10) {
                System.out.println("Nota inválida. Digite uma nota válida: ");
                nota = scanner.nextInt();
        }

        System.out.println("Nota válida. Fim do Programa.");
        
        

    }



}
