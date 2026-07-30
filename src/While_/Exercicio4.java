package While_;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = 1;
        while (numero >= 0) {
            System.out.print("Digite um número: ");
            numero = entrada.nextInt();
        }
        System.out.println("Programa encerrado");
        entrada.close();

    }

}
