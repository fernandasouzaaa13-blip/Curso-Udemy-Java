package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		int numero, horas;
		double valorHora, salario;
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		System.out.println("Digite a horas trabalhadas: ");
		horas = entrada.nextInt();
		System.out.println("Digite o valor da hora: ");
		valorHora = entrada.nextDouble();

		salario = valorHora * horas;

		System.out.println("Número = " + numero);
		System.out.printf("Salário = U$ %.2f%n", salario);

		entrada.close();

	}

}
