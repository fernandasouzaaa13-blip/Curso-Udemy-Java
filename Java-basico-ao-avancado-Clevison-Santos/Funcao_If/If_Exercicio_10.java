// Verificar se uma letra é vogal ou consoante 
package Funcao_If; // Pacote onde a classe está organizada.

import java.util.Scanner; // Importa a classe Scanner para ler dados digitados pelo usuário.

public class If_Exercicio_10 {

    public static void main(String[] args) {

        // Cria um objeto Scanner para receber dados do teclado.
        Scanner entrada = new Scanner(System.in);

        // Mostra uma mensagem pedindo que o usuário digite uma letra.
        System.out.print("Digite uma letra: ");

        // Lê o que o usuário digitou.
        // next() -> lê uma palavra.
        // toLowerCase() -> transforma tudo em minúsculo.
        // charAt(0) -> pega apenas o primeiro caractere da palavra.
        char letra = entrada.next().toLowerCase().charAt(0);

        // Verifica se a letra digitada é uma vogal.
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            // Executa se alguma das condições for verdadeira.
            System.out.println("É uma vogal");
        } else {
            // Executa caso nenhuma condição seja verdadeira.
            System.out.println("É uma consoante.");
        }
        // Fecha o Scanner para liberar recursos do sistema.
        entrada.close();
    }
}