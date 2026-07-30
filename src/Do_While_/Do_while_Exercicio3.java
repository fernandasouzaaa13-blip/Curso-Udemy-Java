package Do_While_;

import java.util.Scanner;

public class Do_while_Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        do {

            System.out.print("Digite um número ou 0 para SAIR: ");
            numero = entrada.nextInt();

        } while (numero != 0);
        System.out.println("Encerrar programa");
        entrada.close();
    }

}
