package Revisao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int numero;
        while (true) {
            System.out.print("Digite um número: ");
            numero = entrada.nextInt();
            if (numero < 0) {
                break;
            }
            soma += numero;
        }

        System.out.println("A soma total dos números é: " + soma);
        entrada.close();
    }
}
