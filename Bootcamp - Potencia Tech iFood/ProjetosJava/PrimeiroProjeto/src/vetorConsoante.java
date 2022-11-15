import java.util.Scanner;

public class vetorConsoante {
    
    public static void main(String[] args) {
        
        String[] vetorConsoantes = new String[6]; //String é um objeto.
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int consoantes = 0;

        do {
            System.out.println("Digite uma letra");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")) ) {
                    consoantes++;
                    vetorConsoantes[count] = letra;
                
            }

            count++;

        } while (count < vetorConsoantes.length);

        System.out.print("Foram digitadas " + consoantes + " consoantes: ");
        
        for (String i : vetorConsoantes) {
            if (i != null) {
                System.out.print(i);        
            }
        }


    }
}
