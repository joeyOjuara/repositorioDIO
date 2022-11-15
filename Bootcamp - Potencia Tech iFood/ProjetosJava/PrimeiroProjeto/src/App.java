public class App {

    /**
     * Esse comentário é para documentar uma classe ou método que está por vir.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Comentário de apenas uma linha

        /* Comentário
         * em
         * várias
         * linhas
         */



        //COMO USAR IF E SWITCHS

        int mesAno = 0;

        if (mesAno == 1){
            System.out.println("Janeiro");
        } else if (mesAno == 2) {
            System.out.println("Fevereiro");
        } else if (mesAno == 3) {
            System.out.println("Março");
        } else if (mesAno == 4) {
            System.out.println("Abril");
        } else if (mesAno == 5) {
            System.out.println("Maio");
        } else if (mesAno == 6) {
            System.out.println("Junho");
        } else if (mesAno == 7) {
            System.out.println("Julho");
        } else if (mesAno == 8) {
            System.out.println("Agosto");
        } else if (mesAno == 9) {
            System.out.println("Setembro");
        } else if (mesAno == 10) {
            System.out.println("Outubro");
        } else if (mesAno == 11) {
            System.out.println("Novembro");
        } else if (mesAno == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês inválido");
        }

        if (mesAno == 7 || mesAno == 1 || mesAno == 12) {
            System.out.println("Férias Merecidas");
        } else if (mesAno > 12 || mesAno < 1) {
            System.out.println("Mês Inválido");
        } else {
            System.out.println("Trabalhe que nem um cachorro");
        }
        

        String diaSemana = "Quarta";

        switch (diaSemana) {
            case "Domingo":
                System.out.println(1);
                break;
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            default:
                System.out.println("Dia Inválido");
                break;
        }


        int testeValor = 2;

        switch (testeValor) {
            case 1:
            case 2:
            case 3:         // Qnd vários casos possuem o mesmo resultado, pode repeti-los um abaixo do outro sem utilizar o break e pôr o comportamento apenas no último case.
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
            }
    }
}
