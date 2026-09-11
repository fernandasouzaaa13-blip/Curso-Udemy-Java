package Switch_;

import java.util.Scanner;

public class Switch_exemplo_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha sua cor favorita: ");
        System.out.println("1- Azul");
        System.out.println("2- Rosa");
        System.out.println("3- Amarelo");
        System.out.println("Digite o número da opção:");
        int opcao = entrada.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Você escolheu a cor Azul.");
                break;
            case 2:
                System.out.println("Você escolheu a cor Rosa.");
                break;
            case 3:
                System.out.println("Você escolheu a cor Amarelo.");
                break;
            default:
                 System.out.println("Opção inválida.");
                break;
        }
        entrada.close();
    }
}
