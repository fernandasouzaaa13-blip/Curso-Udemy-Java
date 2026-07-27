package Funcao_If_Se; // Define o pacote onde esta classe está localizada.
// O package serve para organizar as classes do projeto.

import java.util.Scanner;
// Importa a classe Scanner.
// Scanner é utilizado para receber informações digitadas pelo usuário.

public class If_Exemplo_5 {
    // Declara a classe.
    // Esta classe demonstra como utilizar
    // o operador lógico OR (||).

    // Método principal.
    // Todo programa Java começa sua execução por aqui.
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado "entrada".
        // System.in representa o teclado.
        Scanner entrada = new Scanner(System.in);

        // Exibe uma mensagem solicitando a idade.
        System.out.print("Digite sua idade ");

        // nextInt()
        // Lê um número inteiro digitado pelo usuário.
        // O valor informado será armazenado na variável idade.
        int idade = entrada.nextInt();

        // Consome o ENTER deixado pelo nextInt().
        // Isso evita que o próximo nextLine() seja pulado.
        entrada.nextLine();

        // Solicita ao usuário que informe
        // se ele é estudante.
        System.out.println("Você é estudante? (sim/não): ");

        // nextLine()
        // Lê todo o texto digitado.

        // toLowerCase()
        // Converte o texto para letras minúsculas.
        //
        // Exemplos:
        // "SIM" -> "sim"
        // "Sim" -> "sim"
        // "sIm" -> "sim"
        String estudante = entrada.nextLine().toLowerCase();

        // if → Estrutura de decisão.

        // idade < 18
        // Verifica se a pessoa possui menos de 18 anos.

        // || (OU / OR)
        // Basta UMA das condições ser verdadeira
        // para que toda a expressão seja verdadeira.

        // estudante.equals("sim")
        // Verifica se o usuário respondeu "sim".

        // Se a pessoa for menor de idade
        // OU for estudante,
        // ela terá direito à meia-entrada.
        if (idade < 18 || estudante.equals("sim")) {

            // Executa este bloco se pelo menos
            // uma das condições for verdadeira.
            System.out.println("Você tem direito a meia-entrada no cinema");

        } else {

            // Executa este bloco somente quando
            // todas as condições forem falsas.
            System.out.println("Você não tem direito a meia-entrada no cinema.");
        }

        // Fecha o Scanner.
        // Boa prática para liberar os recursos utilizados.
        entrada.close();
    }
}