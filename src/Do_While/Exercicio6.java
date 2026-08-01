package Do_While;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int soma = 0;
        int media;
        int contador = 0;
        do {
            System.out.print("Digite um número: ");
            numero = entrada.nextInt();
            if (numero != -1) {
                soma += numero;
                contador++;
            }

        } while (numero != -1);
        media = soma / contador;
        System.out.print("A média entre os números digitados é :" + media);
        entrada.close();
    }

}
