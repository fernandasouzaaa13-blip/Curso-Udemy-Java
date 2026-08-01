// Cálcule a média de 10 números e diga a média
package For;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double soma = 0;
        double media = 0;
        double numero;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            numero = entrada.nextDouble();

            soma = soma + numero;

        }
        media = soma / 10;
        System.out.println("O média entre os números é: " + media);
        entrada.close();
    }
}
