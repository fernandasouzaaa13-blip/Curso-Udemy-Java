package While_;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 1;
        int contador = 0;
        while (numero != 0) {
            System.out.println("Digite um número ou 0 para sair:");
            numero = entrada.nextInt();
            if (numero > 0) {
                contador++;

            }
        }
         System.out.println("A quantidade total de números positivos é: " + contador);
        entrada.close();
    }
}
