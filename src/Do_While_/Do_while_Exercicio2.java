package Do_While_;

public class Do_while_Exercicio2 {
    public static void main(String[] args) {
        System.out.print("==============================\n");
        System.out.print(" Todos os números pares de 0 até 50\n");
        System.out.print("==============================\n");

        int contador = 0;
        do {
            if (contador % 2 == 0) {
                System.out.println(contador);
            }
            contador++;

        } while (contador <= 50);

    }
}
