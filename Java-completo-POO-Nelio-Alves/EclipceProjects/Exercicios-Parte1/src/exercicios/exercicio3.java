package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner (System.in);
		double pi = 3.14159;
		System.out.println("Digite o valor do raio:");
		double raio = entrada.nextDouble();

	    double area = pi*raio*raio;

	    System.out.printf("O valor da área é : %.4f%n", area);

	entrada.close();
		
		

	}

}
