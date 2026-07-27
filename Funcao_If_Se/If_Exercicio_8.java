package Funcao_If_Se;

import java.util.Scanner;

public class If_Exercicio_8 {
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        System.out.print(" Digite a primeira nota :");
        double nota1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();
        double media =( nota1+nota2)/2;
        if(media>=7.0){
            System.out.println("Aprovado " + media);
        }else if (media>=5){
            System.out.println(" Recuperação " + media);
        }else {
            System.out.println("Reprovado" + media);
        }
        entrada.close();

    }
}
