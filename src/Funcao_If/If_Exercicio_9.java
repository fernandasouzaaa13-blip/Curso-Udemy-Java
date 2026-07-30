// Verificar se uma letra é vogal ou consoante 
package Funcao_If; // Pacote onde esta classe está organizada.

import java.util.Scanner; // Importa a classe Scanner para ler dados do teclado.

public class If_Exercicio_9 {

    public static void main(String[] args) {

        // Cria um Scanner para receber o que o usuário digitar.
        Scanner entrada = new Scanner(System.in);

        // Mostra uma mensagem na tela.
        System.out.print("Digite uma letra :");

        // Lê o texto digitado e transforma tudo em letras minúsculas.
        String letra = entrada.nextLine().toLowerCase();

        // Verifica se o usuário digitou "a".
        if (letra.equals("a")) {

            System.out.print("Foi digitada a vogal A");

        // Caso não seja "a", verifica se é "e".
        } else if (letra.equals("e")) {

            System.out.print("Foi digitada a vogal E");

        // Caso não seja "e", verifica se é "i".
        } else if (letra.equals("i")) {

            System.out.print("Foi digitada a vogal I");

        // Caso não seja "i", verifica se é "o".
        } else if (letra.equals("o")) {

            System.out.print("Foi digitada a vogal O");

        // Caso não seja "o", verifica se é "u".
        } else if (letra.equals("u")) {

            System.out.print("Foi digitada a vogal U");

        // Se não for nenhuma vogal, considera uma consoante.
        } else {

            System.out.println("A letra digitada é uma consoante");
        }
        // Fecha o Scanner.
        entrada.close();
    }
}