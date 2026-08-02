// Gerar números aleatórios até encontrar o número 10 
package Revisao;

import java.util.Random;

public class Exercicio8 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int numero;
        while (true) {
            numero = aleatorio.nextInt(20);
            System.out.println("Número gerado: " + numero);
            if (numero == 10) {
                System.out.println("Número 10 encontrado.  Encerrando...");
                break;
            }
        }
    }

}
