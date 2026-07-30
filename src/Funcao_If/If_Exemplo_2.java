package Funcao_If; // Define o pacote onde esta classe está localizada.
// O package serve para organizar as classes do projeto.

public class If_Exemplo_2 {
    // Declara a classe.
    // Esta classe demonstra como utilizar
    // as estruturas if, else if e else.

    // Método principal.
    // Todo programa Java começa sua execução por aqui.
    public static void main(String[] args) {

        // double → Armazena números com casas decimais.
        // A variável "nota" recebeu o valor 6.0.
        double nota = 6.0;

        // if → Primeira condição analisada.
        // O Java verifica:
        // A nota é maior ou igual a 7?
        //
        // 6.0 >= 7
        // Resultado: false
        if (nota >= 7) {

            // Este bloco só será executado
            // se a condição acima for verdadeira.
            System.out.println("Aluno Aprovado");

        // else if → Significa "senão, se...".
        // Só será analisado caso o primeiro if seja falso.
        //
        // Agora o Java verifica:
        // A nota é maior ou igual a 5?
        //
        // 6.0 >= 5
        // Resultado: true
        } else if (nota >= 5) {

            // Como a condição foi verdadeira,
            // este bloco será executado.
            System.out.println("Aluno em Recuperação");

        // else → Significa "senão".
        // Não possui condição.
        // É executado apenas quando TODAS
        // as condições anteriores forem falsas.
        } else {

            // Este bloco só será executado
            // quando a nota for menor que 5.
            System.out.println("Reprovado");
        }
    }
}