package Funcao_If_Se;

import java.util.Scanner;

public class If_Exercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        int numero = entrada.nextInt();
        if (numero > 0) {
            System.out.println("Maior que ZERO.");
        } else if (numero < 0) {
            System.out.println("Menor que ZERO.");
        } else {
            System.out.println("ZERO");
        }
        entrada.close();
    }
}
