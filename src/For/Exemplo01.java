package For;

// Declara o pacote onde esta classe está localizada.

//Declaração da classe pública chamada Exemplo01.
//Em Java, todo código precisa obrigatoriamente estar 
//			contido dentro de uma classe.
//A palavra-chave "public" significa que esta classe pode 
//			ser acessada de qualquer outro lugar.
//O nome da classe "Exemplo01" deve ser exatamente igual ao 
//			nome do arquivo: Exemplo01.java
public class Exemplo01 {

	 // Método principal da aplicação: ponto de entrada de
	 //			qualquer programa Java.
	 //
	 // public → torna o método acessível de qualquer outra 
	 //			classe (modificador de acesso).
	 // static → significa que o método pode ser executado 
	 //			diretamente pela JVM, sem criar um objeto da classe.
	 // void → o método não retorna nenhum valor.
	 // main → nome reservado pela JVM (Java Virtual Machine) que 
	 //			indica o início do programa.
	 // String[] args → representa um vetor de strings que pode 
	 //			ser usado para receber parâmetros pela linha de comando.
	 public static void main(String[] args) {
	
	     // ======================================================
	     // EXEMPLO 1: Contar de 1 até 10 usando estrutura for
	     // ======================================================
	
	     // Imprime um cabeçalho para indicar visualmente o início do exemplo 1.
	     // \n → é um caractere especial chamado escape sequence, que 
		 //			representa uma quebra de linha.
	     System.out.println("\n Exemplo 1: Contar de 1 até 10\n");
	
	     // Estrutura de repetição for (contagem crescente):
	     // O for é composto por três partes:
	     // 1. Inicialização: int i = 1 → o contador "i" começa em 1.
	     // 2. Condição: i <= 10 → o laço continuará enquanto 
		 //			essa condição for verdadeira.
	     // 3. Incremento: i++ → após cada iteração, "i" será incrementado em 1.
	     for (int i = 1; i <= 10; i++) {
	    	 
	    	 // System.out → representa a saída padrão (console/terminal)
	    	 // println() → método usado para imprimir uma linha de texto
	         // Exibe o valor atual da variável "i" na tela, em cada iteração.
	         System.out.println("Valor de i: " + i);
	         
	     }
	
	     // ======================================================
	     // EXEMPLO 2: Contar de 10 até 1 (ordem decrescente)
	     // ======================================================
	
	     // System.out → representa a saída padrão (console/terminal)
	     // println() → método usado para imprimir uma linha de texto
	     System.out.println("\n Exemplo 2: Contar de 10 até 1 (ordem decrescente)\n");
	
	     // Estrutura de repetição for (contagem decrescente):
	     // Aqui o contador começa com valor 10 e vai diminuindo até chegar a 1.
	     // i-- → é o operador de decremento, reduz 1 a cada volta.
	     for (int i = 10; i >= 1; i--) {
	    	 
	    	 // System.out → representa a saída padrão (console/terminal)
	    	 // println() → método usado para imprimir uma linha de texto
	         System.out.println("Contando ao contrário: " + i);
	         
	     }
	
	     // ======================================================
	     // EXEMPLO 3: Exibir somente números pares de 2 até 20
	     // ======================================================
	
	     System.out.println("\n Exemplo 3: Mostrar apenas números pares de 2 a 20\n");
	
	     // Laço for iniciando com o valor 2 (primeiro número par).
	     // i += 2 → incrementa de 2 em 2, gerando apenas números pares.
	     // Assim, não há necessidade de verificar se o número é par dentro do laço.
	     // i = i + 2
	     for (int i = 2; i <= 20; i += 2) {
	    	 
	    	 // System.out → representa a saída padrão (console/terminal)
	    	 // println() → método usado para imprimir uma linha de texto
	         System.out.println("Número par: " + i);
	         
	     }
	
	     // ======================================================
	     // EXEMPLO 4: Somar os números de 1 até 100
	     // ======================================================
	
	     // System.out → representa a saída padrão (console/terminal)
	     // println() → método usado para imprimir uma linha de texto
	     System.out.println("\n Exemplo 4: Somar todos os números de 1 até 100\n");
	
	     // Variável "soma" é usada para acumular o total.
	     // Inicializa com 0, pois não somamos nada no início.
	     int soma = 0;
	
	     // Laço for que percorre de 1 até 100.
	     for (int i = 1; i <= 100; i++) {
	    	 
	    	 // soma = soma + i
	         // soma += i → significa: soma = soma + i;
	         // Exemplo: se i = 3, então soma += 3 acumula esse valor na variável soma.
	         soma += i;
	         
	     }
	
	     // System.out → representa a saída padrão (console/terminal)
	     // println() → método usado para imprimir uma linha de texto
	     // Após o término do laço (i = 101), o valor total acumulado será exibido.
	     System.out.println("A soma de 1 até 100 é: " + soma);
	     
	 }
}