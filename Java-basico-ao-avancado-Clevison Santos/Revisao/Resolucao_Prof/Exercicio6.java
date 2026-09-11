///Resolução Professor
package Revisao.Resolucao_Prof;
// Declaração do pacote ao qual esta classe pertence.
// Pacotes em Java servem para organizar o 
//			código em estruturas hierárquicas.
// Esse pacote específico está voltado a exemplos que 
//			envolvem laços com break e continue.

/*
 * =====================================================================================
 * EXERCÍCIO 6: VALIDAR SENHA COM NO MÁXIMO 3 TENTATIVAS
 *
 * Descrição do Problema:
 * - Criar um sistema de verificação de senha.
 * - O usuário terá no máximo 3 tentativas para digitar a senha correta.
 * - Se a senha for digitada corretamente em qualquer uma 
 * 				das 3 tentativas, o acesso é concedido.
 * - Caso contrário, após 3 tentativas erradas, o acesso é bloqueado.
 * 
 * Conceitos aplicados:
 * - Entrada de dados com Scanner;
 * - Comparação de Strings com equals;
 * - Laço de repetição "for" com controle de tentativas;
 * - Uso de "break" para interromper o laço ao atingir uma condição esperada;
 * - Boas práticas com liberação de recursos (fechamento do Scanner).
 * =====================================================================================
 */

// Importa a classe Scanner da biblioteca java.util.
// Scanner permite capturar entradas do usuário digitadas no console.
// É amplamente usado em programas interativos via terminal.
import java.util.Scanner;

// Declaração da classe principal "Exercicio6".
// A palavra-chave "public" permite que a classe seja 
//			acessível por outras partes do programa.
// O nome da classe deve coincidir com o nome do arquivo (.java).
public class Exercicio6 {

	// Método principal da aplicação — ponto de entrada do programa.
    // "public" → o método pode ser acessado pela JVM para iniciar a execução.
    // "static" → não é necessário criar um objeto da 
	//			classe para chamar esse método.
    // "void" → o método não retorna nenhum valor.
    public static void main(String[] args) {

        // Cria um objeto do tipo Scanner, chamado "entrada", que 
    	//			será usado para capturar dados do teclado.
        // System.in → representa a entrada padrão, normalmente o teclado.
        Scanner entrada = new Scanner(System.in);

        // Define a senha correta como uma constante (neste caso "1234").
        // Essa será a referência de comparação para validar o acesso.
        String senhaCorreta = "1234";

        // Início de um laço "for" que controla o número de 
        //			tentativas permitidas (de 1 até 3).
        // Essa estrutura é adequada aqui pois sabemos 
        //			exatamente o limite de repetições.
        for (int tentativas = 1; tentativas <= 3; tentativas++) {

            // Exibe no console uma mensagem solicitando ao 
        	//			usuário que digite a senha.
            // O cursor permanecerá na mesma linha esperando a entrada.
            System.out.print("Digite a senha: ");

            // Captura a linha digitada pelo usuário e armazena na variável "senha".
            // nextLine() lê toda a linha até o Enter ser pressionado.
            String senha = entrada.nextLine();

            // Compara a senha digitada com a senha correta.
            // O método equals é usado para comparação de Strings em 
            //			Java (== compara referências, não valores).
            if (senha.equals(senhaCorreta)) {

                // Caso a senha esteja correta, exibe uma mensagem de sucesso ao usuário.
                System.out.println("Acesso permitido!");

                // O comando break encerra imediatamente o laço "for",
                // evitando que as outras tentativas sejam processadas.
                break;
                
            } else {
            	
                // Caso a senha esteja errada, exibe uma mensagem 
            	//		informando o número da tentativa.
                // Isso fornece feedback ao usuário sobre seu 
            	//		progresso e chances restantes.
                System.out.println("Senha incorreta. Tentativa " + tentativas + " de 3.");
                
            }

            // Verifica se esta é a última tentativa (terceira).
            // Essa verificação é feita fora do bloco else para 
            //			garantir que ela seja avaliada
            // 			mesmo se houver lógica futura que altere a estrutura.
            if (tentativas == 3) {

                // Informa ao usuário que o número máximo de tentativas foi excedido.
                // Essa é a mensagem final que representa o bloqueio do acesso.
                System.out.println("Número de tentativas excedido. Acesso bloqueado.");
                
            }
        }

        // Após o uso, o Scanner deve ser fechado para liberar o 
        //			recurso do sistema associado à entrada padrão.
        entrada.close();
    }

    // Fim do método main.
}

// Fim da classe Exercicio6.