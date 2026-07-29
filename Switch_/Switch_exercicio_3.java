//MINHA RESOLUSÃO
package Switch_;

import java.util.Scanner;

public class Switch_exercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ;
        System.out.println("\u001B[32mCalculadora Simples\u001B[0m");
        System.out.println("1-SOMAR");
        System.out.println("2-SUBTRAIR");
        System.out.println("3-MULTIPLICAR");
        System.out.println("4-DIVIDIR");
        System.out.print("Digite um número: ");
        double num1 = entrada.nextDouble();
        System.out.print("Digite segundo número: ");
        double num2 = entrada.nextDouble();
        System.out.print("\u001B[32mDigite a opção desejada:\u001B[0m");
        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("A soma entre os números é: " + (num1 + num2));
                break;
            case 2:
                System.out.println("A subtração entre os números é: " + (num1 - num2));
                break;
            case 3:
                System.out.println("A multiplicação entre os números é: " + (num1 * num2));
                break;
            case 4:
                System.out.println("A divisão entre os números é: " + (num1 / num2));
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        entrada.close();
    }
}
