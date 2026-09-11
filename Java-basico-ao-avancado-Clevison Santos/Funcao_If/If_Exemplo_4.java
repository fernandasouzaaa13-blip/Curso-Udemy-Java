package Funcao_If; // Define o pacote onde esta classe está localizada.
// O package serve para organizar as classes do projeto.

import java.util.Scanner;
// Importa a classe Scanner.
// Scanner é utilizado para receber informações digitadas pelo usuário.

public class If_Exemplo_4 {
    // Declara a classe.
    // Esta classe demonstra como utilizar
    // entrada de dados, Strings e operadores lógicos.

    // Método principal.
    // Todo programa Java começa sua execução por este método.
    public static void main(String[] args) {

        // Cria um objeto Scanner chamado "entrada".
        // System.in representa o teclado.
        // Tudo o que o usuário digitar poderá ser lido pelo Scanner.
        Scanner entrada = new Scanner(System.in);

        // Exibe uma mensagem solicitando a idade.
        System.out.println("Digite sua idade");

        // nextInt()
        // Lê um número inteiro digitado pelo usuário.
        // O valor será armazenado na variável idade.
        int idade = entrada.nextInt();

        // nextLine()
        // Consome o ENTER que ficou armazenado
        // após o uso do nextInt().
        //
        // Sem esta linha, o próximo nextLine()
        // seria pulado automaticamente.
        entrada.nextLine();

        // Solicita ao usuário que informe
        // se é brasileiro ou naturalizado.
        System.out.println("Você é brasileiro ou naturalizado? (sim/não): ");

        // nextLine()
        // Lê toda a linha digitada pelo usuário.
        //
        // toLowerCase()
        // Converte todo o texto para letras minúsculas.
        //
        // Exemplos:
        // "SIM" -> "sim"
        // "Sim" -> "sim"
        // "sIm" -> "sim"
        //
        // Isso facilita a comparação.
        String nacionalidade = entrada.nextLine().toLowerCase();

        // if → Estrutura de decisão.

        // idade >= 16
        // Verifica se a idade é maior ou igual a 16.

        // && (E / AND)
        // Exige que TODAS as condições sejam verdadeiras.

        // nacionalidade.equals("sim")
        // Verifica se o texto digitado
        // é exatamente igual à palavra "sim".
        //
        // equals() é utilizado para comparar Strings.
        //
        // Não devemos utilizar == para comparar textos.

        if (idade >= 16 && nacionalidade.equals("sim")) {

            // Este bloco será executado
            // apenas quando as duas condições
            // forem verdadeiras.
            System.out.println("Você pode votar!");

        } else {

            // Caso alguma das condições seja falsa,
            // este bloco será executado.
            System.out.println("Você não pode votar!");
        }

        // Fecha o Scanner.
        // Boa prática para liberar os recursos utilizados.
        entrada.close();
    }
}

// Scanner
// Lê informações digitadas pelo usuário.

// nextInt()
// Lê números inteiros.

// nextLine()
// Lê uma linha inteira de texto.

// String
// Armazena textos.

// toLowerCase()
// Converte o texto para letras minúsculas.

// equals()
// Compara o conteúdo de duas Strings.

// ==
// Utilizado para comparar valores primitivos
// (int, double, char, boolean etc.).

// &&
// Significa "E".
// Todas as condições precisam ser verdadeiras.