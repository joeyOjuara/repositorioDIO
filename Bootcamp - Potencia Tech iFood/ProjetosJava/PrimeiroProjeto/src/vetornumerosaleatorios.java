import java.util.Random;

public class vetornumerosaleatorios {
    public static void main(String[] args) {
        Random random = new Random();
    int[] numerosAleatorios = new int[5]; //Qnd eu quero inicializar um vetor vazio com uma qnt determinada de espaços, é desse jeito q deve ser inicializado;
    
    System.out.print("Vetor Numeros Aleatórios: ");

    for(int i = 0; i < numerosAleatorios.length; i++){
        numerosAleatorios[i] = random.nextInt(100);
        if (i == numerosAleatorios.length-1) {
            System.out.println(numerosAleatorios[i]);
        } else {
            System.out.print(numerosAleatorios[i] + " - ");
        }
    }
        
    //IMPRIMIR SUCESSOR E ANTECESSOR NA MSM LINHA
    for (int i : numerosAleatorios) {
        System.out.println(i-1 + " - " + i + " - " + (i+1));        
    }

    }

    
}
