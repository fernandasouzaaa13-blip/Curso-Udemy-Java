// RESOLUÇÃO DO PROFESSOR
package Switch_;

import java.util.Scanner;

public class Switch_exercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.print("Digite a operação (+,-,*,/): ");
        char operador = entrada.next().charAt(0);
        switch (operador) {
            case '+':
                System.out.print("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.print("Resultado: " + (num1 * num2));
                break;
            case '*':
                System.out.print("Resultado: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.print("Resultado: " + (num1 / num2));
                } else {
                    System.out.print("Erro por Divisão por zero");
                }

                break;

            default:
                System.out.print("Operador inválido");
                break;
        }
        entrada.close();
    }
}