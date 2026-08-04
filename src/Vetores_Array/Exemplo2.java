// ===========================================================
// Declaração do pacote onde esta classe está localizada.
// Os pacotes organizam o código-fonte em módulos lógicos.
// ===========================================================

package Vetores_Array;


// ===========================================================
// Exemplo 2 - Cópia de Vetores
// Objetivo: Demonstrar como copiar os elementos de um vetor
// 			para outro vetor utilizando um laço de repetição.
// ===========================================================

// Declaração da classe pública "Exemplo2".
// Como é pública, pode ser acessada por outras classes.
public class Exemplo2 {

	// ============================================================
    // Método principal "main", ponto de entrada da aplicação Java.
    // Todo programa Java começa a execução por este método.
    // "public" → significa que qualquer outra classe pode acessar esse método.
    // "static" → permite que o método seja executado sem instanciar a classe.
    // "void" → indica que o método não retorna nenhum valor.
    // "String[] args" → parâmetro que pode receber argumentos via 
	//			linha de comando (não usado aqui).
    public static void main(String[] args) {

        // ===========================================================
        // Criação do vetor original com 5 elementos inteiros.
        // Os valores são definidos diretamente nas posições do vetor.
        // Cada número será associado automaticamente a um índice:
        // [0] = 10, [1] = 20, [2] = 30, [3] = 40, [4] = 50
        // ===========================================================
        int[] original = {10, 20, 30, 40, 50};

        // ===========================================================
        // Criação de um novo vetor chamado "copia", também com 5 posições.
        // Inicialmente, todos os elementos desse vetor são 0 por padrão.
        // Esse vetor será usado para armazenar a cópia dos elementos
        // 			do vetor "original".
        // ===========================================================
        int[] copia = new int[5];

        // ===========================================================
        // Laço for tradicional para percorrer todas as posições do vetor.
        // A variável "i" vai de 0 até o comprimento do vetor (exclusive).
        // A cada iteração, o elemento da posição "i" do vetor original
        // 			é copiado para a mesma posição "i" do vetor copia.
        // ===========================================================
        for (int i = 0; i < original.length; i++) {
        	
            // Cópia elemento por elemento (índice a índice).
            copia[i] = original[i];
            
        }

        // ===========================================================
        // Utiliza um laço for-each para exibir os valores armazenados
        // 			no vetor "copia". O laço percorre todos os 
    	//			elementos do vetor sem a necessidade de usar índices.
        // A variável "valor" recebe, a cada iteração, um elemento do vetor.
        // ===========================================================
        for (int valor : copia) {
        	
            // Exibe no console o valor atual do vetor "copia".
            System.out.println("Número: " + valor);
            
        }
    }
}
