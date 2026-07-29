package Switch_;

import java.util.Scanner;

public class Switch_exercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma letra do alfabeto: ");
        char alfabeto = entrada.next().toLowerCase().charAt(0);
        switch (alfabeto) {
            case 'a':
                System.out.print("É uma vogal");
                break;
            case 'e':
                System.out.print("É uma vogal");
                break;
            case 'i':
                System.out.print("É uma vogal");
                break;
            case 'o':
                System.out.print("É uma vogal");
                break;
            case 'u':
                System.out.print("É uma vogal");
                break;

            default:
            System.out.print("É uma consoante");
                break;
        }
        entrada.close();
    }

}
/*
*** DICA DO PROFESSOR: BOAS PRÁTICAS
 default:
        if(Character.isletter(alfabeto)){
            System.out.println("É uma consoante.");
        }else{
            System.out.println("Caracterer inválido.Digite uma letra.");
}
    }
*/