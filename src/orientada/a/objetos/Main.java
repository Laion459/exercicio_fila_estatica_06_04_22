package orientada.a.objetos;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        System.out.println("##################################################\n");
	    Row row = new Row(10);

        // Verifica se fila esta vazia
        System.out.println("- Verifica se fila esta vazia: " + row.isEmpity());
        System.out.println("##################################################\n");


        // insere elementos na fila
        System.out.println("- Insere elementos: ");
        row.insert(21);
        row.insert(23);
        row.insert(52);
        row.insert(72);
        row.insert(2);
        row.insert(200);
        row.insert(44);
        row.insert(339);
        //row.insert(2);
        row.insert(100);
        System.out.println("##################################################\n");

        System.out.println("- Verifica se fila esta vazia: " + row.isEmpity());
        System.out.println("##################################################\n");


        // verificar se há espaço na fila
        System.out.println("- Verificar se há espaço na fila: " + row.checkSpace());
        System.out.println("##################################################\n");

        System.out.println("    * Completa a fila para teste! *");
        row.insert(55);

        // verificar se há espaço na fila
        System.out.println("- Verificar se há espaço na fila: " + row.checkSpace());
        System.out.println("##################################################\n");

        // Recuperar o número de elementos da fila
        System.out.println("- Recupera o número de elementos da fila: " + row.numbersOfElements());
        System.out.println("##################################################\n");

        System.out.println("    * Remove um elemento para teste: * ");
        row.remove(2);

        // Recuperar o número de elementos da fila
        System.out.println("- Recupera o número de elementos da fila: " + row.numbersOfElements());
        System.out.println("##################################################\n");


        //  Verificar se um determinado elemento está na fila
        System.out.println("- Verificar se um determinado elemento está na fila: " + row.checksElement(200));
        System.out.println("##################################################\n");

        System.out.println("    * Verifica com elemento inexistente para teste! * ");

        //  Verificar se um determinado elemento está na fila
        System.out.println("- Verificar se um determinado elemento está na fila: " + row.checksElement(299));
        System.out.println("##################################################\n");


        // Verificar se uma posição qualquer é válida
        System.out.println("- Verificar se uma posição qualquer é válida: " + row.checkPosition(1));
        System.out.println("##################################################\n");

        System.out.println("    * Verifica em posição invalida para teste! * ");

        // Verificar se uma posição qualquer é válida
        System.out.println("- Verificar se uma posição qualquer é válida: " + row.checkPosition(100));
        System.out.println("##################################################\n");

        // Recuperar um elemento da fila pelo elemento
        Object test = 2;
        System.out.println("- Recuperar um elemento da fila pelo elemento: " + row.retrieveAnElement(test));
        System.out.println("##################################################\n");

        // Recuperar um elemento da fila pelo index
        System.out.println("- Recuperar um elemento da fila pelo index: " + row.retrieveAnElement(2));
        System.out.println("##################################################\n");

        System.out.println("    * Recupera um elemento inexistente para teste! * : " + row.retrieveAnElement(488));
        System.out.println("##################################################\n");

        //  Recuperar a posição de um elemento da fila
        System.out.println("- Recuperar a posição de um elemento da fila: " + row.regainAPosition(72));
        System.out.println("##################################################\n");

        System.out.println("    * Recupera posição inexistente para teste! * ");

        //  Recuperar a posição de um elemento da fila
        System.out.println("- Recuperar a posição de um elemento da fila: " + row.regainAPosition(700));
        System.out.println("##################################################\n");

        // Recuperar o primeiro elemento da fila
        System.out.println("- Recuperar o primeiro elemento da fila: " + row.retrieveTheFristElement());
        System.out.println("##################################################\n");

        // Recuperar o último elemento da fila
        System.out.println("- Recuperar o último elemento da fila: " + row.retrieveTheLastElement());
        System.out.println("##################################################\n");


        System.out.println("- Já foram inseridos e removidos elementos da lista! ");
        System.out.println("##################################################\n");

        System.out.println("- Exibe os elementos da fila");
        row.showList();
        System.out.println("##################################################\n");

        // Desenvolva um programa para simular uma bilheteria de um cinema durante os 45 minutos que
        //  antecedem a sessão. A cada minuto chegam de 2 a 4 pessoas, que são dispostas em uma fila. Antes
        //  do início da abertura da bilheteria já se encontram 12 pessoas na fila. Existe apenas um atendente,
        //  que demora 30 segundos para vender um bilhete.

        //  Indique o número de pessoas que vieram assistir determinado filme e quantas pessoas estavam na
        //  fila da bilheteria quando a sessão teve início.

        // Fiz de conta que chegaram 2 pessoas a cada minutos, total 90

        Row row1 = new Row(200);

        // coloca 12 pessoas que já estavam na fila
        for (int i = 0; i < 12; i++){
            row1.insert(i+1);
        }

        // insere as pessoas que foram chegando
        int tempo45 = 90;
        for (int i = 0; i < tempo45; i++){
            row1.insert(row1.getCount());
        }

        // Total de pessoas que vieram assistir o filme
        System.out.println("- Total pessoas que vieram assistir o filme: " + row1.getCount());

        // Fiz de conta que sairam 2 pessoas por minuto 2 * 45 = 90
        int pessoasQueJaEntraram = 90;
        for (int i = 0; i < pessoasQueJaEntraram; i++){
            row1.remove(row1.getCount());
        }

        System.out.println("- Total de pessoas na fila na hora do incicio da sessão: " + row1.getCount());
        System.out.println("\n##################################################\n");
    }
}
