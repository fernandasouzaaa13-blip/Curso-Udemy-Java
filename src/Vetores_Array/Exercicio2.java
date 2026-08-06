package Vetores_Array;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] posicao = new int[5];
        for (int i = 0; i < posicao.length; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            posicao[i] = entrada.nextInt();
        }
        System.out.println("Números digitados: ");
         for (int num : posicao){
            System.out.println(num);
         }
        entrada.close();
    }

}
