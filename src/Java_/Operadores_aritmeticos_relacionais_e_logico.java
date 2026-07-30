package Java_; // Define o pacote onde esta classe está localizada.
// O package serve para organizar as classes do projeto.
// Pense nele como uma pasta que agrupa arquivos relacionados.

public class Operadores_aritmeticos_relacionais_e_logico {
    // Declara a classe.
    // Toda classe em Java é como um "molde" que reúne variáveis e métodos.
    // Neste exemplo, a classe foi criada para demonstrar os operadores
    // aritméticos, relacionais e lógicos.

    // Método principal (main).
    // É o primeiro método executado quando o programa inicia.
    // O Java sempre procura este método para começar a execução.
    public static void main(String[] args) {

        // Chama o método que demonstra os operadores aritméticos.
        // Quando um método é chamado, o programa "entra" nele,
        // executa tudo e depois retorna para cá.
        mostrarOperadoresAritmeticos();

        // Apenas imprime uma linha para separar os resultados.
        // Isso deixa a saída mais organizada.
        System.out.println("===================");

        // Chama o método que demonstra
        // os operadores relacionais.
        mostrarOperadoesRelacionais();

        // Outra linha separadora.
        System.out.println("===================");

        // Chama o método responsável
        // pelos operadores lógicos.
        mostrarOperadoresLogicos();
    }

    // ============================================================
    // OPERADORES ARITMÉTICOS
    // ============================================================

    // Este método demonstra operações matemáticas básicas.
    public static void mostrarOperadoresAritmeticos() {

        // int armazena números inteiros.
        // Como são variáveis locais, só existem dentro deste método.
        int a = 10;
        int b = 3;

        // + (Soma)
        // Soma dois valores.
        // Exemplo:
        // 10 + 3 = 13
        System.out.println("Soma: " + (a + b));

        // - (Subtração)
        // Diminui um valor do outro.
        // Exemplo:
        // 10 - 3 = 7
        System.out.println("Subtração: " + (a - b));

        // * (Multiplicação)
        // Multiplica dois valores.
        // Exemplo:
        // 10 × 3 = 30
        System.out.println("Multiplicação: " + (a * b));

        // / (Divisão)
        // Divide um número pelo outro.
        // Como "a" e "b" são inteiros,
        // o Java descarta a parte decimal.
        //
        // Exemplo:
        // 10 / 3 = 3
        // e NÃO 3.333...
        System.out.println("Divisão: " + (a / b));

        // % (Módulo)
        // Retorna apenas o resto da divisão.
        //
        // Exemplo:
        // 10 dividido por 3
        // Resultado = 3
        // Resto = 1
        System.out.println("Resto da divisão: " + (a % b));
    }

    // ============================================================
    // OPERADORES RELACIONAIS
    // ============================================================

    // Este método demonstra como comparar valores.
    // Toda comparação retorna um boolean:
    // true (verdadeiro)
    // false (falso)
    public static void mostrarOperadoesRelacionais() {

        // Variáveis que serão comparadas.
        int x = 10;
        int y = 20;

        // == (Igual)
        // Verifica se os dois valores são iguais.
        //
        // 10 == 20
        // Resultado: false
        System.out.println("x é igual a y? " + (x == y));

        // != (Diferente)
        // Verifica se os valores são diferentes.
        //
        // 10 != 20
        // Resultado: true
        System.out.println("x é diferente de y? " + (x != y));

        // > (Maior que)
        // Verifica se o valor da esquerda
        // é maior que o da direita.
        //
        // 10 > 20
        // Resultado: false
        System.out.println("x é maior que y? " + (x > y));

        // < (Menor que)
        // Verifica se o valor da esquerda
        // é menor que o da direita.
        //
        // 10 < 20
        // Resultado: true
        System.out.println("x é menor que y? " + (x < y));

        // >= (Maior ou igual)
        //
        // 10 >= 10
        // Resultado: true
        System.out.println("x é maior ou igual a 10? " + (x >= 10));

        // <= (Menor ou igual)
        //
        // 20 <= 15
        // Resultado: false
        System.out.println("y é menor ou igual a 15? " + (y <= 15));
    }

    // ============================================================
    // OPERADORES LÓGICOS
    // ============================================================

    // Este método demonstra como combinar condições.
    // Os operadores lógicos trabalham com valores booleanos.
    public static void mostrarOperadoresLogicos() {

        // Variável inteira.
        // Representa a idade da pessoa.
        int idade = 18;

        // Variável booleana.
        // true = possui carteira.
        // false = não possui carteira.
        boolean temCarteira = true;

        // && (E / AND)
        // Todas as condições precisam ser verdadeiras.
        //
        // idade >= 18 -> true
        // temCarteira -> true
        //
        // true && true
        // Resultado: true
        boolean podeDirigir = (idade >= 18) && temCarteira;

        // || (OU / OR)
        // Basta UMA condição ser verdadeira.
        //
        // true || false
        // Resultado: true
        boolean podeViajarSozinho = (idade >= 18) || temCarteira;

        // ! (NÃO / NOT)
        // Inverte o valor booleano.
        //
        // true -> false
        // false -> true
        boolean naoTemCarteira = !temCarteira;

        // Exibe o resultado das comparações.
        System.out.println("Pode dirigir? " + podeDirigir);

        System.out.println("Pode viajar sozinho? " + podeViajarSozinho);

        System.out.println("Não tem carteira? " + naoTemCarteira);
    }
}