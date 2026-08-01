package Do_While;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int i = 0;
        do {
            System.out.print("Digite um número: ");
            numero = entrada.nextInt();
            if (numero > 0) {
                i++;
            }

        } while (numero != 0);
        System.out.println("A quantidade de números é: " + i);
        entrada.close();
    }

}
