package Revisao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número entre 1 e 10:");
        numero = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            if(numero==i){
                continue;
            }
            System.out.println(i);

        }
        entrada.close();

    }
}
