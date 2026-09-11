package Do_While;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Digite um número ou (número(-) para encerrar): ");
            numero = entrada.nextInt();
        } while (numero >= 0);
        System.out.println("Número negativo digitado. Programa encerrado");
    entrada.close();
    }

}
