package Revisao;

public class Exercicio7 {
    public static void main(String[] args) {
        int contador = 1;
        int quantidade_multiplos= 0;
        while (true) {
            if (contador % 4 == 0) {
                quantidade_multiplos++;
                if(quantidade_multiplos<=10){
                    System.out.println(contador);
                }else{
                    break;
                }
            }
            contador++;
        }

    }
}
