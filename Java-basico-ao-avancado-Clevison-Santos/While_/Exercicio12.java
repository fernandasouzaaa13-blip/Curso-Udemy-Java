package While_;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();
        if (num1 != num2) {
            if (num1 < num2) {
                while (num1 < num2 - 1) {
                    System.out.println(num1 + 1);
                    num1++;
                }
            }else{
                 while (num2 < num1 - 1) {
                    System.out.println(num2+ 1);
                    num2++;
                 }
            }

        } else {
            System.err.println("Os números são IGUAIS");
        }
        entrada.close();

    }
}
