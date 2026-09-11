// ============================================================================
// Declara o pacote onde a classe está inserida.
// Pacotes (ou packages) em Java organizam classes relacionadas
//			em grupos lógicos, facilitando a manutenção, 
//			localização de arquivos e evitando conflitos de nomes.
package While_.Resolucao_Prof;

// ============================================================================
// Importa a classe Scanner da biblioteca java.util.
// A classe Scanner permite a leitura de dados fornecidos 
//			pelo usuário através do teclado.
// Esse recurso é essencial para a interação entre o programa e o usuário.
import java.util.Scanner;


/*
* Exercício 7 - Ler senha até que esteja correta.
* ------------------------------------------------
* 
* Objetivo:
* 
* - Continuar solicitando a senha até que o usuário digite a senha correta: "1234".
* - Se a senha estiver errada, mostrar uma mensagem de erro e pedir novamente.
* - Quando a senha estiver correta, mostrar uma mensagem de sucesso.
*/

// ============================================================================
// Declaração da classe pública Exercicio7.
// A palavra-chave `public` torna a classe visível para todo o projeto.
// O nome da classe precisa ser o mesmo do nome do arquivo `.java`.
public class Exercicio9 {

	// ======================================================================================
    // Método principal (main): ponto de entrada do programa.
    // Quando o programa for executado, a execução começa aqui.
    // public → acessível de qualquer lugar.
    // static → executável sem criar um objeto da classe.
    // void → não retorna nada.
    // String[] args → permite receber parâmetros da linha de comando.
	public static void main(String[] args) {

		// ============================================================================
		// Criação de um objeto Scanner chamado `entrada`.
		// Esse objeto será utilizado para capturar o que o usuário digitar no console.
		// `System.in` indica que a entrada virá do teclado (padrão de entrada).
		Scanner entrada = new Scanner(System.in);

		// ============================================================================
		// Declaração e inicialização da variável `senha`.
		// Essa variável armazenará a senha digitada pelo usuário a cada iteração.
		// Inicialmente, a variável é uma string vazia para garantir a entrada no laço.
		String senha = "";

		// ============================================================================
		// Início do laço `while`.
		// A condição `!senha.equals("1234")` significa "enquanto a
		//			senha for diferente de '1234'".
		// A exclamação `!` representa a negação lógica. Portanto, o 
		//			laço se repete até que a senha correta seja digitada.
		while (!senha.equals("1234")) {

			// ========================================================================
			// Exibe a mensagem no console pedindo que o usuário digite a senha.
			// O `print` (sem `ln`) mantém o cursor na mesma linha, 
			//			aguardando o usuário digitar.
			System.out.print("Digite a senha: ");

			// ========================================================================
			// Lê a linha digitada pelo usuário e armazena esse valor na variável `senha`.
			// Utiliza o método `nextLine()` do Scanner, que lê a linha 
			//			inteira, incluindo espaços.
			senha = entrada.nextLine();

			// ========================================================================
			// Verifica se a senha digitada é incorreta, ou seja, diferente de "1234".
			if (!senha.equals("1234")) {

				// ====================================================================
				// Se a condição acima for verdadeira (senha errada), 
				//			exibe uma mensagem de erro.
				// Essa mensagem orienta o usuário a tentar novamente.
				System.out.println("Senha incorreta. Tente novamente.");
				
			}
		}

		// ============================================================================
		// Esse trecho é executado apenas quando a senha correta ("1234") é digitada.
		// Informa que o acesso foi permitido com sucesso.
		System.out.println("Senha correta. Acesso permitido!");

		// ============================================================================
		// Fecha o objeto Scanner para liberar os recursos do sistema.
		// É uma boa prática encerrar o Scanner quando ele 
		//			não for mais necessário.
		entrada.close();
		
	}
}