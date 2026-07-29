package While_;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int fatorial = 1;
        System.out.print("Digite um número para calcular o fatoral: ");
        numero = entrada.nextInt();
        while (numero >= 1) {
            fatorial = numero * fatorial;
            numero--;
        }
        System.out.println("O valor da fatorial: " + fatorial);
        entrada.close();
    }

}
