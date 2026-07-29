package While_;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabuada = 1;
        int numero = 0;
        int multiplicacao = 0;
        System.out.print("Digite a tabuada deseja : ");
        numero = entrada.nextInt();
        System.out.println("Tabuada de multiplicação");
        while (tabuada <= 10) {
            multiplicacao = (numero * tabuada);
            System.out.println(numero + " X " + tabuada + " = " + multiplicacao);
            tabuada++;
        }

        entrada.close();
    }
}
