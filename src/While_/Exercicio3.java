package While_;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para receber dados digitados pelo usuário.
        Scanner entrada = new Scanner(System.in);

        // Cria a variável numero e inicia com -1.
        // Foi escolhido -1 apenas para que o while comece executando.
        // Se começasse com 0, o while nem seria executado.
        int numero = -1;

        // Enquanto o número for diferente de 0, o programa continuará pedindo valores.
        while (numero != 0) {

            // Exibe uma mensagem solicitando que o usuário digite um número.
            // Se ele digitar 0, o programa será encerrado.
            System.out.print("Digite um número (0 para sair): ");

            // Lê o número digitado pelo usuário e armazena na variável numero.
            numero = entrada.nextInt();
        }

        // Quando o usuário digitar 0, o while termina e esta mensagem será exibida.
        System.out.print("Programa encerrado");

        // Fecha o Scanner para liberar os recursos utilizados.
        entrada.close();
    }
}