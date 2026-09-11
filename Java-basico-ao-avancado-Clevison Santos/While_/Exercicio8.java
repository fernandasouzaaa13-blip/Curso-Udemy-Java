package While_;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, contador = 0;
        System.out.print("Digite um número (0 para encerrar): ");
        numero = entrada.nextInt();
        while (numero != 0) {
            if (numero > 0) {
                contador++;
            }
            System.out.print("Digite outro número: ");
            numero = entrada.nextInt();
        }
        System.out.println("Quantidade de números positivos digitados: " + contador);
        entrada.close();
    }
}