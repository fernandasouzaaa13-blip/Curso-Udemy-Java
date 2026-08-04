package Vetores_Array;

// ============================================================
// Declaração do pacote onde esta classe está localizada.
// Os pacotes ajudam a organizar o código-fonte de forma lógica.
// Neste caso, o pacote é chamado "Vetores_Array".

/*
 * ============================================================
 * Contar elementos pares
 *
 * Enunciado:
 * Leia 10 números inteiros digitados pelo usuário e conte 
 * 			quantos desses números são pares.
 * Um número é considerado par quando o resto da divisão 
 * 			dele por 2 é igual a zero (n % 2 == 0).
 * Ao final, exiba quantos dos números digitados são pares.
 * ============================================================
 */

// ============================================================
// Importa a classe Scanner do pacote java.util.
// A classe Scanner permite a leitura de dados do teclado pelo usuário.
// Será usada para ler os 10 números inteiros digitados.
import java.util.Scanner;

// ============================================================
// Início da definição da classe pública "Exemplo3".
// "public" → torna a classe acessível a qualquer outra parte do código.
// "class" → palavra reservada para definir a estrutura da classe.
public class Exemplo3 {

	// ============================================================
    // Método principal "main", ponto de entrada da aplicação Java.
    // Todo programa Java começa a execução por este método.
    // "public" → significa que qualquer outra classe pode acessar esse método.
    // "static" → permite que o método seja executado sem instanciar a classe.
    // "void" → indica que o método não retorna nenhum valor.
    // "String[] args" → parâmetro que pode receber argumentos via 
	//			linha de comando (não usado aqui).
    public static void main(String[] args) {

        // ============================================================
        // Criação de um objeto da classe Scanner.
        // Esse objeto será usado para capturar dados digitados pelo usuário.
        // System.in → significa que a entrada virá do teclado.
        Scanner scanner = new Scanner(System.in);

        // ============================================================
        // Declaração e criação de um vetor de inteiros com 10 posições.
        // Esse vetor armazenará os 10 números digitados pelo usuário.
        int[] numeros = new int[10];

        // ============================================================
        // Variável "pares" usada para contar quantos dos 
    	//			números digitados são pares.
        // Começa em 0 e será incrementada conforme forem 
    	//			encontrados números pares.
        int pares = 0;

        // ============================================================
        // Estrutura de repetição "for" que executa 10 vezes (de 0 até 9).
        // Em cada iteração, um número é solicitado ao usuário, 
    	//			armazenado no vetor e testado.
        for (int i = 0; i < 10; i++) {

            // ============================================================
            // Exibe uma mensagem ao usuário solicitando que digite o 
        	//			número correspondente.
            // "(i + 1)" é usado para mostrar a contagem começando do 1, não do 0.
            System.out.print("Digite o número " + (i + 1) + ": ");

            // ============================================================
            // Captura o número digitado pelo usuário e armazena no 
        	//			vetor na posição "i".
            numeros[i] = scanner.nextInt();

            // ============================================================
            // Verifica se o número digitado é par.
            // "numeros[i] % 2 == 0" → se o resto da divisão por 2 
        	//			for 0, então o número é par.
            if (numeros[i] % 2 == 0) {

                // ============================================================
                // Incrementa a variável "pares" em 1.
                // Isso conta que foi encontrado mais um número par.
                pares++;
                
            }
        }

        // ============================================================
        // Após o término do laço, exibe o total de números pares digitados.
        System.out.println("Quantidade de números pares: " + pares);

        // ============================================================
        // Fecha o objeto Scanner, liberando o recurso do teclado.
        scanner.close();
        
        /* Explicação geral do funcionamento:
		
		- Cria um vetor com 10 posições para armazenar os números digitados.
		- Lê os números um por um usando o Scanner.
		- A cada número, verifica se é par usando o operador % 2 == 0.
		- Se for par, incrementa a variável pares.
		- Ao final, exibe o total de números pares que foram digitados. */
        
    }
}