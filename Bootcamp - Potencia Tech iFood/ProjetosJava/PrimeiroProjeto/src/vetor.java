public class vetor {
    public static void main(String[] args) {
        //É ASSIM Q DECLARA UM VETOR/ARRAY "tipo_do_array[] nome_do_array" e, se quiser já inicia ele com elementos. Lembrando que elementos de um array devem ser do mesmo tipo.

        int[] vetor1 = {5, 3, -1, -26, 10, 50, 15};


        //IMPRIMIR vetor1
        System.out.print("vetor1 [");
        int count = 0;
        while (count < vetor1.length) {
            if (count == vetor1.length-1) {
                System.out.println(vetor1[count] + "]");
            }else{
                System.out.print(vetor1[count] + ", ");
            }
            count++;
        }

        //IMPRIMIR vetor1 COM FOR EACH
        System.out.print("Vetor1 com FOR EACH [");
        int countForEach = 0;
        for (int i : vetor1) {       //Laço FOR EACH: colocar uma variável de mesmo tipo do vetor antes dos dois pontos e, após os dois pontos, o vetor à ser iterável.
            if (countForEach == vetor1.length-1) {
                System.out.println(i + "]");
            } else {
                System.out.print(i + ", ");
            }
            countForEach++;

        }
       

        //IMPRIMIR vetor1 INVERSO COM WHILE
        int count2 = vetor1.length-1;
        
        System.out.print("vetor1 Inverso com While [");
        while (count2 >= 0) {
            if (count2 == 0) {
                System.out.println(vetor1[count2] + "]");
            } else {
                System.out.print(vetor1[count2] +", ");
            }
            count2--;
        }

        //IMPRIMIR vetor1 INVERSO COM FOR
        System.out.print("vetor1 Inverso com FOR [");
        for (int i = vetor1.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(vetor1[i] + "]");
            } else {
                System.out.print(vetor1[i] + ", ");
            }
        }

    }
}
