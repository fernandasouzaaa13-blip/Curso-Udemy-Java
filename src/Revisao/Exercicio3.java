package Revisao;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        while(true){
            System.out.print("Digite um número: ");
            numero = entrada.nextInt();
            if(numero ==-1){
                System.out.println("Programa encerrado");
                break;
            }
           System.out.println("O número digitado foi: "+numero);
        }
        entrada.close();





    }
}
