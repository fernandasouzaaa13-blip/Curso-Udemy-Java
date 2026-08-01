// Exibir na tela todos os números ímpares compreendidos de 1 e 99
package For;

public class Exercicio1 {
    public static void main(String[] args) {

        for (int contador = 1; contador < 100; contador += 2) {
            System.out.println(contador);

        }
        System.out.println("---------------------------");
        for (int i = 0; i <= 99; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
