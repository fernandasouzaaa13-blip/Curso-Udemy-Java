package Funcao_If;

import java.util.Scanner;

public class If_Exercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número é multiplo de (3 e 5).");
        } else {
            System.out.println("O número não é multiplo de (3 e 5).");
        }
        entrada.close();
    }
}
