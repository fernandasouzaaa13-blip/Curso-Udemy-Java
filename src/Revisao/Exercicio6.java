package Revisao;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String senha;
        String senhaCorreta = "6666";
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite a senha: ");
            senha = entrada.nextLine();
            if (senha.equals(senhaCorreta)) {
                System.out.println("Senha correta, Acesso permitido");
                break;
            } else if (!senha.equals(senhaCorreta) && (3 - i) != 0) {
                System.out.println("Senha incorreta. Tente novamente, Você tem mais " + (3 - i) + " tentativas");
            } else {
                System.out.println("Acesso bloqueado.");
            }
        }
        entrada.close();
    }
}
