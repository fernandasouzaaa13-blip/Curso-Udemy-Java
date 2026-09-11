package Funcao_If; // Define o pacote onde esta classe está localizada.
// O package serve para organizar as classes do projeto.

import java.util.Scanner;
// Importa a classe Scanner.
// O import permite utilizar recursos que já existem na biblioteca do Java.
// Scanner é utilizado para ler dados digitados pelo usuário.

public class If_Exemplo_3 {
    // Declara a classe.
    // Esta classe demonstra como receber um valor
    // digitado pelo usuário e utilizar a estrutura if.

    // Método principal.
    // Todo programa Java começa sua execução por aqui.
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado "entrada".
        // System.in representa o teclado.
        // A partir de agora será possível ler o que o usuário digitar.
        Scanner entrada = new Scanner(System.in);

        // Exibe uma mensagem no terminal
        // solicitando que o usuário digite a nota.
        System.out.println("Digite a nota do aluno: ");

        // nextDouble()
        // Aguarda o usuário digitar um número decimal.
        // O valor digitado será armazenado na variável "nota".
        double nota = entrada.nextDouble();

        // Primeira condição.
        // O Java verifica se a nota é maior ou igual a 7.
        //
        // Exemplo:
        // nota = 8
        // 8 >= 7
        // Resultado: true
        if (nota >= 7) {

            // Executa este bloco se a condição for verdadeira.
            System.out.println("Aluno aprovado.");

        // Segunda condição.
        // Só será analisada caso o primeiro if seja falso.
        //
        // Exemplo:
        // nota = 6
        // 6 >= 5
        // Resultado: true
        } else if (nota >= 5) {

            // Executa este bloco caso a nota esteja
            // entre 5 e 6.9.
            System.out.println("Aluno em recuperação");

        // Caso nenhuma das condições anteriores seja verdadeira.
        } else {

            // Será executado quando a nota for menor que 5.
            System.out.println("Reprovado.");
        }

        // Fecha o Scanner.
        // É uma boa prática fechar recursos que não serão mais utilizados.
        // Isso evita desperdício de memória.
        entrada.close();
    }
}