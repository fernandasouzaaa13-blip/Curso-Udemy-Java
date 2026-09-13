package concatenizacao;

import java.util.Locale;

public class ex3 {

	public static void main(String[] args) {
		String funcionaria ="Mariana";
		String setor="Tecnologia da Informação";
		double salario = 4500.50;
		System.out.printf("A funcioária %s trabalha no setor de %s e recebe R$ %.2f doláres%n", funcionaria,setor,salario);
		Locale.setDefault(Locale.US);
	}

}
