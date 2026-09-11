package Revisao;

public class Exemplo1 {
// Declaração do pacote ao qual essa classe pertence.
// Aqui, o pacote é chamado "controle_de_repetcao_com_break_e_continue",
// 			indicando que o código demonstra controle de laços 
//			com "break" e "continue".


// Início da definição da classe pública "Exemplo1".

	// ============================================================
    // Método principal "main", ponto de entrada da aplicação Java.
    // Todo programa Java começa a execução por este método.
    // "public" → significa que qualquer outra classe pode acessar esse método.
    // "static" → permite que o método seja executado sem instanciar a classe.
    // "void" → indica que o método não retorna nenhum valor.
    // "String[] args" → parâmetro que pode receber argumentos via 
	//			linha de comando (não usado aqui).
    public static void main(String[] args) {

        // --------------------------------------------------------------
        // Exibe o título da primeira parte do exemplo.
        System.out.println("\n1. Laço for com break e continue\n");

        // Início do laço 'for' que vai de 1 até 10.
        // "int i = 1" → inicializa a variável de controle com 1.
        // "i <= 10" → o laço continuará enquanto i for menor ou igual a 10.
        // "i++" → incrementa i de 1 em 1.
        for (int i = 1; i <= 10; i++) {

            // Se o valor de i for igual a 5:
            if (i == 5) {
            	
                // Exibe mensagem dizendo que o número 5 será pulado.
                System.out.println("Número 5 pulado com 'continue'");

                // 'continue' faz com que o restante do corpo do laço seja ignorado,
                // e o controle retorne ao início do laço para a próxima iteração.
                continue;
                
            }

            // Se o valor de i for igual a 8:
            if (i == 8) {
            	
                // Exibe mensagem informando que o número 8 foi encontrado.
                System.out.println("Número 8 encontrado. Parando com 'break'.");

                // 'break' termina completamente o laço for, saindo dele.
                break;
                
            }

            // Se nenhuma das condições acima for atendida, exibe o valor de i.
            System.out.println("Número: " + i);
            
        }

        // --------------------------------------------------------------
        // Exibe o título da segunda parte do exemplo.
        System.out.println("\n2. Laço while com break e continue\n");

        // Inicializa a variável "contador" com valor 0.
        int contador = 0;

        // Início do laço 'while' que será executado enquanto contador < 10.
        while (contador < 10) {

            // Incrementa o contador em 1 no início de cada iteração.
            contador++;

            // Verifica se o contador é par.
            if (contador % 2 == 0) {
            	
                // Se for par, não imprime nada e pula para a próxima iteração.
                continue;
                
            }

            // Verifica se o valor do contador é igual a 7.
            if (contador == 7) {
            	
                // Exibe mensagem e encerra o laço com 'break'.
                System.out.println("Número 7 encontrado. Encerrando com 'break'.");
                break;
                
            }

            // Se o número não for par nem 7, imprime o número ímpar.
            System.out.println("Número ímpar: " + contador);
            
        }

        // --------------------------------------------------------------
        // Exibe o título da terceira parte do exemplo.
        System.out.println("\n3. Laço do-while com break e continue\n");

        // Inicializa a variável "numero" com valor 0.
        int numero = 0;

        // Início do laço 'do-while'.
        // Esse tipo de laço garante que o bloco será executado ao menos uma vez,
        // mesmo que a condição seja falsa na primeira verificação.
        do {
        	
            // Incrementa a variável numero no início da iteração.
            numero++;

            // Se o número for igual a 3:
            if (numero == 3) {
            	
                // Exibe mensagem e pula o restante da iteração com 'continue'.
                System.out.println("Número 3 ignorado com 'continue'");
                
                // volta para o início do laço, sem imprimir o número.
                continue; 
                
            }

            // Se o número for igual a 6:
            if (numero == 6) {
            	
                // Exibe mensagem e termina o laço com 'break'.
                System.out.println("Número 6 encontrado. Saindo do laço com 'break'.");
                break;
                
            }

            // Se nenhuma das condições acima for verdadeira, imprime o número.
            System.out.println("Número: " + numero);

        // A condição do laço é verificada após a execução do corpo.
        // O laço continua enquanto o número for menor que 10.
        } while (numero < 10);

        // Fim do método main.
    }

    // Fim da classe.
}