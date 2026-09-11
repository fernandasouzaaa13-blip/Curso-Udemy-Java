//Criar um programa que receba um número inteiro do usúario e verifique se ele é positivo ou não
package Funcao_If;

import java.util.Scanner;

public class If_Exercicio_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("O número digitado é POSITIVO");
        } else {
            System.out.println("O número digitado é NEGATVO");
        }

        entrada.close();
    }

}