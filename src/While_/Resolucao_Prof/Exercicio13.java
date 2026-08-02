package While_.Resolucao_Prof;
// Define o pacote onde a classe está localizada.
// Os pacotes são usados em Java para organizar as classes em grupos lógicos.
// Por exemplo, este código está no pacote "while_4".

// Importa a classe Scanner da biblioteca java.util.
// A classe Scanner é usada para ler dados de entrada do 
// 			usuário via teclado, permitindo que o programa interaja com o usuário.
import java.util.Scanner;

/*
 * Exercício 10: 
 * -------------
 * Objetivo do programa:
 * 
 * ➤ Solicitar dois números inteiros ao usuário.
 * ➤ Verificar se são diferentes. Se forem iguais, 
 * 				exibir mensagem informando isso.
 * ➤ Se forem diferentes, exibir todos os números que 
 * 				estão entre eles (exclusivo),
 *    			ou seja, sem incluir os números digitados.
 * ➤ Utilizar obrigatoriamente a estrutura de repetição "while".
 */

// Declara a classe pública chamada Exercicio10.
// Em Java, toda aplicação começa com uma classe.
public class Exercicio13 {

	// ======================================================================================
    // Método principal (main): ponto de entrada do programa.
    // Quando o programa for executado, a execução começa aqui.
    // public → acessível de qualquer lugar.
    // static → executável sem criar um objeto da classe.
    // void → não retorna nada.
    // String[] args → permite receber parâmetros da linha de comando.
	public static void main(String[] args) {

        // Cria um objeto da classe Scanner chamado "entrada".
        // Esse objeto será utilizado para capturar os dados digitados pelo usuário.
        Scanner entrada = new Scanner(System.in);

        // Solicita ao usuário que digite o primeiro número.
        // A mensagem aparece no console para guiar o usuário.
        System.out.print("Digite o primeiro número: ");

        // Lê o valor digitado pelo usuário e armazena na variável "numero1".
        // O método nextInt() é usado para capturar valores inteiros.
        int numero1 = entrada.nextInt();

        // Solicita ao usuário que digite o segundo número.
        System.out.print("Digite o segundo número: ");

        // Lê o segundo valor digitado e armazena na variável "numero2".
        int numero2 = entrada.nextInt();

        // Verifica se os dois números digitados são iguais.
        // O operador "==" compara o valor de numero1 com numero2.
        if (numero1 == numero2) {

            // Se os valores forem iguais, não há intervalo entre eles.
            // Portanto, o programa exibe uma mensagem informando isso.
            System.out.println("Os números são iguais. Não há números entre eles.");

        // else - Senão
        } else {
        	
            // Caso os números sejam diferentes, o código dentro deste bloco será executado.

            // Exibe uma mensagem indicando os valores digitados e
            // 			que serão exibidos os números entre eles.
            System.out.println("Números entre " + numero1 + " e " + numero2 + ":");

            // Usa o método Math.min() para determinar o menor 
            //			valor entre os dois digitados.
            // Isso garante que a contagem sempre começará do menor para o maior.
            int menor = Math.min(numero1, numero2);

            // Usa o método Math.max() para determinar o maior 
            //			valor entre os dois digitados.
            int maior = Math.max(numero1, numero2);

            // Declara a variável "atual" e inicia com o número seguinte ao menor.
            // Isso evita incluir o valor do menor número no resultado.
            int atual = menor + 1;

            // Inicia o laço de repetição while / Enquanto.
            // A condição "atual < maior" garante que o laço pare 
            //			antes de incluir o número maior.
            while (atual < maior) {

                // Exibe no console o valor atual (intermediário entre os números digitados).
                System.out.println(atual);

                // Incrementa o valor da variável "atual" em 1, avançando 
                //			para o próximo número.
                atual++;
                
            }
        }

        // Encerra o objeto Scanner após o uso.
        // Isso é importante para liberar os recursos de entrada do sistema.
        entrada.close();
        
    }
}
