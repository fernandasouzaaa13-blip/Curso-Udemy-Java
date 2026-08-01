package Do_While;

import java.util.Scanner;

public class Exercicio9 {
public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String senha;
    do { 
    System.out.print("Digite a senha: ");
        senha=entrada.nextLine();
        if(!senha.equals("1234")){
            System.out.println("Senha incorreta.");
        }

        
    } while (!senha.equals("1234"));
    System.out.println("Senha correta.");
    entrada.close();




}    
}
