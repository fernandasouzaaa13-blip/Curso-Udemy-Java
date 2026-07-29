package While_;

public class Exemplo1 {
    public static void main(String[] args) {

        // Exibe um título na tela informando qual será o primeiro exercício.
        System.out.println("\n1. Contar de 1 até 5 com while\n");

        // Cria uma variável chamada contador e inicia com o valor 1.
        int contador = 1;

        // Enquanto o contador for menor ou igual a 5, o laço continuará executando.
        while (contador <= 5) {

            // Exibe o valor atual do contador.
            System.out.println("Contador: " + contador);

            // Soma 1 ao contador para que ele avance para o próximo número.
            contador++;
        }

        // Exibe um título para o segundo exercício.
        System.out.println("\n2. Contagem regressiva de 5 até 1 com while\n");

        // Cria uma variável chamada numero e inicia com o valor 5.
        int numero = 5;

        // Enquanto o número for maior ou igual a 1, o laço continuará executando.
        while (numero >= 1) {

            // Mostra o valor atual da variável numero.
            System.out.println("Número: " + numero);

            // Diminui 1 da variável para fazer a contagem regressiva.
            numero--;
        }

        // Exibe um título para o terceiro exercício.
        System.out.println("\n3. Soma dos números de 1 até 10 com while\n");

        // Variável que armazenará a soma dos números.
        // Ela começa com zero porque ainda não foi somado nada.
        int soma = 0;

        // Variável usada para contar de 1 até 10.
        int i = 1;

        // Enquanto i for menor ou igual a 10, o laço continuará executando.
        while (i <= 10) {

            // Soma o valor de i à variável soma.
            // É a mesma coisa que escrever:
            // soma = soma + i;
            soma = soma + i;

            // Aumenta i em 1 para passar ao próximo número.
            i++;

        }
        System.out.print("A soma 1 até 10 é: " + soma);
    }

}