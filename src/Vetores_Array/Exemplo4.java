package Vetores_Array;
// ========================================================
// Declaração do pacote "Vetores_Array"
// Pacotes são usados para organizar as classes em grupos
// 			lógicos e evitar conflitos de nomes em projetos maiores.
// ========================================================


// ========================================================
// Exemplo 4 - Contar quantas vezes um número aparece no vetor
// Objetivo: Verificar quantas vezes o número 7 aparece
// 			em um vetor de 10 posições inteiras.
// ========================================================

// Declaração da classe pública chamada "Exemplo4"
// A classe contém o método principal que executa o programa.
public class Exemplo4 {

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
        // Declara e inicializa um vetor com 10 números inteiros.
        // O vetor é preenchido manualmente com os seguintes valores:
        // [0]=7, [1]=3, [2]=5, [3]=7, [4]=2, [5]=7, [6]=8, [7]=1, [8]=7, [9]=6
        // Repare que o número 7 aparece diversas vezes.
        // ========================================================
        int[] vetor = {7, 3, 5, 7, 2, 7, 8, 1, 7, 6};

        // ========================================================
        // Criação de uma variável chamada "contador", iniciada em 0.
        // Essa variável será usada para contar quantas vezes o número 7
        // 			aparece no vetor acima.
        // ========================================================
        int contador = 0;

        // ========================================================
        // Utilizamos o laço "for-each" para percorrer todos os elementos do vetor.
        // Esse tipo de laço é ideal quando precisamos apenas acessar os valores,
        // 			sem nos preocupar com os índices.
        //
        // A cada repetição, a variável "valor" assume o 
    	//			conteúdo de um elemento do vetor.
        // Exemplo:
        // Primeira repetição → valor = 7
        // Segunda repetição → valor = 3
        // Terceira repetição → valor = 5
        // ... e assim por diante
        // ========================================================
        for (int valor : vetor) {

            // ========================================================
            // Verifica se o valor atual do vetor é igual a 7.
            // Se for, significa que encontramos uma ocorrência do número procurado.
            // Neste caso, incrementamos o contador em 1.
            // ========================================================
            if (valor == 7) {
            	
                contador++;  // contador = contador + 1
                
            }
        }

        // ========================================================
        // Após percorrer todos os elementos do vetor,
        // 			exibimos no console a quantidade de vezes 
    	//			que o número 7 apareceu.
        // Utilizamos concatenação (+) para incluir o valor do 
    	//			contador na mensagem.
        // ========================================================
        System.out.println("O número 7 aparece " + contador + " vezes.");
        
    }
}