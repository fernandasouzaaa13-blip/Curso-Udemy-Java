package For;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite palavras separadas por vírgulas: ");
        String linhaDigitada = entrada.nextLine();
        List<String> palavras = Arrays.asList(linhaDigitada.split(","));
        for (String palavra : palavras){
            palavra =palavra.trim();
            if(palavra.length()>4){
                System.out.println(palavra);
            }
        }
        entrada.close();
    }
}