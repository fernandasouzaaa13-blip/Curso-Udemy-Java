package While_;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        // Cria o Scanner para ler os dados digitados pelo usuário
        Scanner entrada = new Scanner(System.in);

        // Armazena o número digitado pelo usuário
        // Começa com 0 apenas para o while iniciar
        int numero = 0;

        // Variável responsável por somar todos os números digitados
        int soma = 0;

        // Conta quantos números válidos foram digitados
        int quantidade = 0;

        // O programa continuará executando enquanto o número for diferente de -1
        while (numero != -1) {

            // Solicita que o usuário digite um número
            System.out.print("Digite um número (-1 para sair): ");

            // Lê o número digitado
            numero = entrada.nextInt();

            // Verifica se o número digitado NÃO é -1
            // Se não for, ele participa da soma e da média
            if (numero != -1) {

                // Soma o número digitado ao valor acumulado
                soma += numero;

                // Conta mais um número válido
                quantidade++;
            }
        }

        // Verifica se pelo menos um número válido foi digitado
        if (quantidade > 0) {

            // Calcula a média
            // O (double) faz a divisão retornar um valor com casas decimais
            double media = (double) soma / quantidade;

            // Exibe a média
            System.out.println("Média dos números: " + media);

        } else {

            // Caso o usuário digite apenas -1, nenhuma média poderá ser calculada
            System.out.println("Nenhum número válido foi digitado");
        }

        // Fecha o Scanner
        entrada.close();
    }
}