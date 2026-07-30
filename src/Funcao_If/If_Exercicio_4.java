package Funcao_If;

import java.util.Scanner;

public class If_Exercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();
        if (numero >= 10 && numero <= 100) {
            System.out.println("Número Válido, O número está entre 10 e 100.");
        } else {
            System.out.println("Número Inválido,O número não está entre 10 e 100");
        }
        entrada.close();
    }
}
