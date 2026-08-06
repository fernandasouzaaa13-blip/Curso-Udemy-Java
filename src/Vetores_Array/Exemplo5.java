package Vetores_Array;

// ========================================================
// Declaração do pacote "Vetores_Array".
// Um pacote em Java é como uma "pasta" onde você organiza
// 			suas classes de forma lógica e estruturada.
// Isso ajuda a manter projetos grandes organizados.
// ========================================================
// ========================================================
// Declaração da classe pública chamada "Exemplo5".
// Em Java, toda a aplicação é construída com base em classes.
// Esta classe contém o método main, que é o 
//			ponto de partida do programa.
// ========================================================
public class Exemplo5 {

	// ============================================================
    // Método principal "main", ponto de entrada da aplicação Java.
    // Todo programa Java começa a execução por este método.
    // "public" → significa que qualquer outra classe pode acessar esse método.
    // "static" → permite que o método seja executado sem instanciar a classe.
    // "void" → indica que o método não retorna nenhum valor.
    // "String[] args" → parâmetro que pode receber argumentos via 
	//			linha de comando (não usado aqui).
    public static void main(String[] args) {

        // ========================================================
        // Declaração e inicialização do primeiro vetor de inteiros.
        // Esse vetor possui 5 elementos fixos já definidos.
        // Cada número é armazenado em uma posição (índice) do vetor:
        // vetor1[0] = 1, vetor1[1] = 2, ..., vetor1[4] = 5.
        // ========================================================
        int[] vetor1 = {12, 20, 34, 42, 53};

        // ========================================================
        // Declaração e inicialização do segundo vetor.
        // Assim como o vetor1, ele possui 5 valores definidos diretamente.
        // Cada elemento deste vetor será somado com o correspondente do vetor1.
        // Exemplo: vetor2[0] = 5 será somado com vetor1[0] = 1.
        // ========================================================
        int[] vetor2 = {5, 4, 3, 2, 1};

        // ========================================================
        // Criação de um terceiro vetor chamado "soma" com 5 posições.
        // Esse vetor servirá para armazenar os resultados da 
    	//			soma dos dois vetores anteriores.
        // Ele é inicializado com valores padrão (todos os elementos começam como 0).
        // A alocação é feita usando "new int[5]", indicando que terá 5 posições.
        // ========================================================
        int[] soma = new int[5];

        // ========================================================
        // Estrutura de repetição do tipo "for" com índice.
        // Este laço percorre todas as posições de 0 até 4 (inclusive).
        // Em cada repetição, acessa um índice dos vetores vetor1 e 
    	//			vetor2 e armazena a soma desses dois valores na 
    	//			mesma posição do vetor "soma".
        //
        // Exemplo de iteração:
        // i = 0 → soma[0] = vetor1[0] + vetor2[0] → soma[0] = 1 + 5 = 6
        // i = 1 → soma[1] = vetor1[1] + vetor2[1] → soma[1] = 2 + 4 = 6
        // ... até i = 4
        // ========================================================
        for (int i = 0; i < 5; i++) {

            // ========================================================
            // Aqui ocorre a operação de soma dos elementos correspondentes
            // 			dos dois vetores e o resultado é armazenado no vetor "soma".
            // ========================================================
            soma[i] = vetor1[i] + vetor2[i];
            
        }

        // ========================================================
        // Estrutura de repetição "for-each" (também chamada de "for aprimorado").
        // Serve para percorrer todos os elementos de um vetor de forma simples,
        // 			sem a necessidade de utilizar índices explícitos.
        //
        // A variável "valor" assume, a cada repetição, o conteúdo de 
    	//			uma posição do vetor "soma".
        // ========================================================
        for (int valor : soma) {

            // ========================================================
            // Exibe o valor atual na tela usando o método System.out.println().
            // Cada valor do vetor "soma" será exibido em uma 
        	//			nova linha no console.
            // ========================================================
            System.out.println(valor);
            
        }
    }
}