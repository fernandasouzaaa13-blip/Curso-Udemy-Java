//Rolução do Professor
package Do_While.Resolucao_Prof;

// Importa a classe Scanner para capturar entradas do teclado.
import java.util.Scanner;

/*
 * Exercício 5 - Calcular a média de números até digitar -1.
 *
 * Objetivo:
 * Ler vários números digitados pelo usuário e calcular a 
 * 			média entre eles.
 * O programa deve parar quando o usuário digitar -1, e 
 * 			este valor não deve ser incluído no cálculo.
 */

// Declaração da classe pública chamada Exercicio5.
// Em Java, todo código precisa estar contido dentro de uma classe.
// O nome da classe deve obrigatoriamente ser igual ao 
//			nome do arquivo (Exercicio5.java).
public class Exercicio5 {

	 // Método principal da aplicação.
	 // Este é o ponto inicial da execução do programa.
	 // Quando você executa a aplicação, o Java procura 
	 //			automaticamente este método.
	 public static void main(String[] args) {
	
	     // ============================================================
	     // CRIAÇÃO DO OBJETO SCANNER PARA CAPTURAR ENTRADA DO USUÁRIO
	     // ============================================================
	
	     // O objeto Scanner é utilizado para ler dados do teclado.
	     // System.in representa a entrada padrão do sistema (normalmente o teclado).
	     // Com isso, o programa poderá interagir com o usuário 
		 //			solicitando e lendo valores.
	     Scanner entrada = new Scanner(System.in);
	
	     // ============================================================
	     // DECLARAÇÃO E INICIALIZAÇÃO DAS VARIÁVEIS
	     // ============================================================
	
	     int soma = 0;           // Acumula a soma de todos os números válidos digitados.
	     int quantidade = 0;     // Conta quantos números válidos (≠ -1) foram informados.
	     int numero;             // Variável usada para armazenar temporariamente o número digitado.
	
	     // ============================================================
	     // INÍCIO DO LAÇO DE REPETIÇÃO DO-WHILE
	     // ============================================================
	
	     // A estrutura do-while é utilizada quando queremos que o 
		 //			bloco de código seja executado pelo menos uma vez, 
		 //			mesmo que a condição seja falsa desde o início.
	     // Neste caso, queremos garantir que o usuário veja o 
		 //			prompt pelo menos uma vez.
	     do {
	    	 
	         // Exibe uma mensagem no console pedindo para o 
			 //			usuário digitar um número.
	         // Informa que -1 é a condição de parada do laço.
	    	 // System.out → representa a saída padrão (console/terminal)
	    	 // println() → método usado para imprimir uma linha de texto
	         System.out.print("Digite um número (-1 para sair): ");
	
	         // Lê o número inteiro digitado pelo usuário e 
			 //			armazena na variável "numero".
	         numero = entrada.nextInt();
	
	         // ---------------------------------------------------------
	         // Verifica se o número digitado é diferente de -1
	         // Se for -1, significa que o usuário quer encerrar o programa,
	         // 			então ele não deve ser incluído na soma nem na contagem.
	         // ---------------------------------------------------------
	         if (numero != -1) {
	             soma += numero;       // Adiciona o número atual à variável acumuladora "soma".
	             quantidade++;         // Incrementa a variável "quantidade" para contar esse número.
	         }
	
	     // O laço continuará repetindo enquanto o número for diferente de -1.
	     // Assim que o usuário digitar -1, a condição se 
	     //			torna falsa e o laço termina.
	     } while (numero != -1);
	
	     // ============================================================
	     // CÁLCULO E EXIBIÇÃO DA MÉDIA DOS NÚMEROS DIGITADOS
	     // ============================================================
	
	     // Aqui verificamos se o usuário digitou pelo menos UM número válido.
	     // Se "quantidade" for maior que zero, podemos calcular a média.
	     if (quantidade > 0) {
	
	         // Fazemos um cast (conversão explícita) de "soma" para double.
	         // Isso garante que o resultado da divisão preserve as 
			 //			casas decimais e não seja truncado como em uma 
			 //			divisão entre inteiros.
	         double media = (double) soma / quantidade;
	
	         // System.out → representa a saída padrão (console/terminal)
	         // println() → método usado para imprimir uma linha de texto
	         // Exibe o resultado da média na tela do usuário.
	         System.out.println("Média: " + media);
	
	     } else {
	    	 
	    	 // System.out → representa a saída padrão (console/terminal)
	    	 // println() → método usado para imprimir uma linha de texto
	         // Se "quantidade" for 0, significa que o usuário digitou -1 logo no início,
	         // sem informar nenhum número válido. Exibimos uma mensagem informativa.
	         System.out.println("Nenhum número válido digitado.");
	         
	     }
	
	     // ============================================================
	     // ENCERRAMENTO DO SCANNER
	     // ============================================================
	
	     // Por boas práticas, sempre devemos fechar o Scanner após o uso
	     // 		para liberar os recursos alocados com o teclado.
	     entrada.close();
	     
	     /*  Elemento / Estrutura                       	Explicação
		     do 	{ ... } while (condição);           	Executa o bloco ao menos uma vez, mesmo que a condição já seja falsa.
		     if (numero != -1)                          	Verifica se o valor digitado é válido para ser somado.
		     soma += numero;                            	Adiciona o número atual à variável acumuladora.
		     quantidade++;                              	Conta quantos números válidos foram digitados.
		     (double) soma / quantidade                 	Cálculo da média com casas decimais (conversão explícita).
		     Scanner entrada = new Scanner(System.in); 		Permite capturar valores digitados pelo usuário.
		     entrada.nextInt();                         	Lê um valor inteiro digitado no teclado.
		     entrada.close();                           	Fecha o scanner e libera os recursos utilizados. */

	     
	 }
	 
}
