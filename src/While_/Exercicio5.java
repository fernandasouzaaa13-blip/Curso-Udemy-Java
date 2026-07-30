package While_;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int soma = 0;
        int i = 0;

        while (numero != -1) {
            System.out.print(" Digite um número (- 1 para sair): ");
            numero = entrada.nextInt();
            if (numero != -1) {
                soma += numero;
                i++;
            }

        }
        System.out.println("Média é: " + soma / i);

        entrada.close();
    }

}
