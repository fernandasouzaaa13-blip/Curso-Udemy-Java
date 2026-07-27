//Verificar se o número é par ou impar
//(4  % 2==0)->par (0)
//(7  % 2==0)-impar (1)
package Funcao_If_Se;

import java.util.Scanner;

public class If_Exercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é PAR");
        } else {
            System.out.println("O número é IMPAR");
        }

        entrada.close();

    }
}
