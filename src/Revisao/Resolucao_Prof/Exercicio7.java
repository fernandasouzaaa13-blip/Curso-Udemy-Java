package Revisao.Resolucao_Prof;

    // Declaração da classe pública "Exercicio7".
// A palavra-chave "public" torna a classe acessível a 
//			partir de qualquer parte do código.
public class Exercicio7 {

	// Método principal da aplicação — ponto de entrada do programa.
    // "public" → o método pode ser acessado pela JVM para iniciar a execução.
    // "static" → não é necessário criar um objeto da 
	//			classe para chamar esse método.
    // "void" → o método não retorna nenhum valor.
    public static void main(String[] args) {

        // Inicializa a variável "i" com o valor 1.
        // Esta variável será usada para testar, em sequência, 
    	//			todos os números inteiros.
        int i = 1;

        // Inicializa o "contador" com valor 0.
        // Esta variável será usada para contar quantos 
        //			múltiplos de 4 já foram encontrados.
        int contador = 0;

        // Início de um laço infinito.
        // Este laço não tem condição de parada explícita e 
        //		continuará executando até que o "break" seja acionado.
        while (true) {

            // Verifica se o valor atual de "i" é múltiplo de 4.
            // Isso é feito utilizando o operador módulo (%), que 
        	//			retorna o resto da divisão.
            // Se o resto da divisão de i por 4 for igual a zero, 
        	//			então "i" é múltiplo de 4.
            if (i % 4 == 0) {

                // Imprime no console o valor de "i", que é múltiplo de 4.
                System.out.println(i);

                // Incrementa o "contador", pois um novo múltiplo 
                //		foi encontrado e impresso.
                contador++;
                
            }

            // Verifica se já foram encontrados 10 múltiplos de 4.
            // Se sim, o laço deve ser encerrado.
            if (contador == 10) {

                // O comando "break" interrompe imediatamente o laço "while".
                // Nenhuma outra iteração será feita, mesmo 
            	//			que "while (true)" continue verdadeiro.
                break;
                
            }

            // Incrementa a variável "i" para testar o próximo 
            //			número na próxima iteração do laço.
            i++;
            
        }

        // Fim do método main.
        
    }

    // Fim da classe Exercicio7.
    
}

