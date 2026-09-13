package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num1 = entrada.nextDouble();
		System.out.println("Digite o segundo número:");
		double num2 = entrada.nextDouble();
		
		double soma = (num1 + num2);
		
		System.out.printf("A Soma é: %.2f%n",soma);
		
		entrada.close();
		

	}

}
