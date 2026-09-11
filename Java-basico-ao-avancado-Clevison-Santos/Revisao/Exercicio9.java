package Revisao;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = entrada.nextLine().toLowerCase();
        for (int i=0; i < palavra.length(); i++){
            if(!(
                    palavra.charAt(i) == 'a' || 
                    palavra.charAt(i) == 'e' || 
                    palavra.charAt(i) == 'i' || 
                    palavra.charAt(i) == 'o' ||
                    palavra.charAt(i) == 'u'
                )){
               continue; 
            }
            System.out.println(palavra.charAt(i));
        }
        entrada.close();
    }
}
