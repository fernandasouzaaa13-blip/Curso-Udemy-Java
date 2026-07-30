// Declaração do pacote
package Do_While_;

//Importa a classe Scanner da biblioteca java.util para ler 
//			dados digitados pelo usuário.
import java.util.Scanner; 

// ============================================================
// Exercício 3 - Ler números até digitar zero.
// O programa solicita ao usuário que digite números inteiros,
// 		e só termina sua execução quando o número digitado for igual a 0.
// ============================================================

// Declaração da classe pública chamada Exercicio3.
// Toda aplicação Java precisa obrigatoriamente estar 
//			dentro de uma classe.
// O nome da classe (Exercicio3) deve ser exatamente igual ao 
//			nome do arquivo (Exercicio3.java).
public class Do_while_Exercicio4 {

	 // Método principal — este é o ponto de entrada do programa.
	 // Quando a aplicação é executada, a JVM (Java Virtual Machine) 
	 //			procura e executa esse método.
	 //
	 // Modificadores:
	 // public  → permite que o método seja acessado de qualquer lugar.
	 // static  → permite que o método seja chamado sem criar um objeto da classe.
	 // void    → indica que este método **não retorna nenhum valor**.
	 // String[] args → parâmetro que representa um vetor de 
	 //			Strings, que pode conter argumentos da linha de comando.
	 public static void main(String[] args) {
	
	     // =======================================================
	     // DECLARAÇÃO E INICIALIZAÇÃO DO OBJETO SCANNER
	     // =======================================================
	
	     // Scanner é uma classe da biblioteca java.util, usada 
		 //			para capturar entradas do usuário via teclado.
	     // Criamos um objeto chamado "entrada" que será 
		 //			responsável por fazer essa leitura.
	     // System.in indica que estamos utilizando a entrada 
		 //			padrão do sistema (o teclado).
	     Scanner entrada = new Scanner(System.in);
	
	     // =======================================================
	     // DECLARAÇÃO DA VARIÁVEL QUE RECEBERÁ OS NÚMEROS
	     // =======================================================
	
	     // Criamos uma variável do tipo inteiro chamada "numero".
	     // Essa variável será usada para armazenar o valor 
		 //			digitado pelo usuário a cada iteração.
	     // Aqui, **não atribuímos valor inicial** diretamente 
		 //			porque ela será lida dentro do laço.
	     int numero;
	
	     // =======================================================
	     // LAÇO DE REPETIÇÃO COM ESTRUTURA DO-WHILE
	     // =======================================================
	     //
	     // O laço "do-while" executa o bloco de código **antes** de 
		 //			verificar a condição.
	     // Isso significa que o código dentro do "do" será 
		 //			executado pelo menos uma vez, 
	     // 		mesmo que a condição final (numero != 0) já seja falsa.
	     //
	     // A estrutura do-while é ideal quando se quer garantir que o 
		 //			bloco seja executado pelo menos uma vez.
	     do {
	    	 
	    	 // System.out → representa a saída padrão (console/terminal)
	    	 // println() → método usado para imprimir uma linha de texto
	         // Exibe no console a mensagem orientando o usuário a digitar um número.
	         // O "\n" não está sendo usado aqui, então o cursor permanece na mesma linha.
	         System.out.print("Digite um número (0 para sair): ");
	
	         // Utiliza o método nextInt() do Scanner para ler um valor 
			 //			inteiro digitado pelo usuário.
	         // Esse valor será armazenado na variável "numero".
	         numero = entrada.nextInt();
	
	         // Após essa linha, o programa volta ao "while" para avaliar se o 
			 //			número digitado é diferente de 0.
	         // Se for diferente, o laço repete. Se for 0, o laço termina.
	
	     // Condição lógica que determina se o laço continuará ou não.
	     // Enquanto o valor de "numero" for diferente de 0, o 
	     //			bloco do "do" será repetido.
	     } while (numero != 0);
	
	     // System.out → representa a saída padrão (console/terminal)
	     // println() → método usado para imprimir uma linha de texto
	     // Quando o laço termina (isto é, quando o usuário digita 0),
	     // esta linha será executada, indicando o fim da aplicação.
	     System.out.println("Programa encerrado.");
	
	     // Boa prática: fecha o Scanner após o uso para liberar o 
		 //			recurso de entrada (teclado).
	     // Isso evita vazamentos de recursos no sistema.
	     entrada.close();
	     
	     /*	Resumo dos principais conceitos usados:

		 	Elemento / Estrutura						Explicação
		 	public static void main(String[] args)		Ponto de entrada do programa Java; obrigatório para iniciar a execução.
		 	Scanner entrada = new Scanner(System.in);	Cria um objeto que lê dados do teclado.
		 	int numero;									Declara uma variável inteira que armazenará os valores digitados.
			 do { ... } while (condição);				Laço de repetição que executa o bloco ao menos uma vez, e repete enquanto a condição for verdadeira.
			 System.out.print("mensagem");				Imprime uma mensagem no console sem pular de linha.
			 entrada.nextInt();							Lê um número inteiro digitado pelo usuário.
			 numero != 0								Condição de repetição: enquanto o valor digitado for diferente de 0, continua o laço.
			 System.out.println("mensagem");			Imprime uma mensagem no console e **pula para a próxima linha**.
			 entrada.close();							Fecha o Scanner e libera o recurso de leitura de entrada (boa prática). */

	 }
}