package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:");
		double A = entrada.nextInt();
		System.out.println("Digite o segundo número:");
		double B = entrada.nextInt();
		System.out.println("Digite o terceiro número:");
		double C =entrada.nextInt();	
		System.out.println("Digite o quarto número:");
		double D = entrada.nextInt();

		double diferenca = (A*B - C*D);
		System.out.println("A diferença dos números é: "+ diferenca);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();

	}

}
