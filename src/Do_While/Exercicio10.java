package Do_While;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero ;
        int contador = 1;
        int mult ;
        System.out.println("=============");
        System.out.println("===TABUADA===");
        System.out.println("=============");
        System.out.print("Digite a tabuada desejada: ");
        numero = entrada.nextInt();
        do {

            mult = numero * contador;
            System.out.println(numero + "x" + contador + "=" + mult);
            contador++;
        } while (contador <= 10);

        entrada.close();

    }
}
