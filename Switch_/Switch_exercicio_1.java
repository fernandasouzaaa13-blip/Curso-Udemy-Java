package Switch_;

import java.util.Scanner;

public class Switch_exercicio_1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dias da semana");
        System.out.println("1-Domingo");
        System.out.println("2-Segunda-feira");
        System.out.println("3-Terça-feira");
        System.out.println("4-Quarta-feira");
        System.out.println("5-Quinta-feira");
        System.out.println("6-Sexta-feira");
        System.out.println("7-Sábado");
        System.out.println("Escolha um dia da semana:");
        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                System.out.println(" O dia da semana escolhido foi Domingo");
                break;
            case 2:
                System.out.println(" O dia da semana escolhido foi Segunda-feira");
                break;
            case 3:
                System.out.println("O dia da semana escolhido foi Terça-feira");
                break;
            case 4:
                System.out.println("O dia da semana escolhido foi Quarta-feira");
                break;
            case 5:
                System.out.println("O dia da semana escolhido foi Quinta-feira");
                break;
            case 6:
                System.out.println("O dia da semana escolhido foi Sexta-feira");
                break;
            case 7:
                System.out.println("O dia da semana escolhido foi Sábado");
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        entrada.close();
    }
}
