package While_;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha ="";
        System.out.print("Digite a senha:");
        senha = entrada.nextLine();
        while (!senha.equals("1234")) {
            System.out.println("Senha incorreta");

            System.out.print("Digite a senha:");
            senha = entrada.nextLine();

        }
        System.out.println("Senha correta");
        entrada.close();
    }

}
