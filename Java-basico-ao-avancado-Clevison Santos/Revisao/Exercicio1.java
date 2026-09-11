package Revisao;

public class Exercicio1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("Um multiplo  de 7 encontrado: " + i);
                break;
            }
            System.out.println(i);
        }
    }
}
