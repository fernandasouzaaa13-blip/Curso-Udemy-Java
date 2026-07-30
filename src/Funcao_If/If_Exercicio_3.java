package Funcao_If;

import java.util.Scanner;

public class If_Exercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();
        if (numero1 > numero2) {
            System.out.print("O MAIOR número é: "+numero1);
        } else if (numero2 > numero1) {
            System.out.print("O MAIOR número é: "+numero2);
        } else {
            System.out.println("Os dois números são IGUAIS.");

        }
        entrada.close();
    }
}
