package For;

// ============================================================
// Define o pacote ao qual esta classe pertence.
// Pacotes são usados para organizar o código em grupos lógicos,
// 			ajudando na manutenção e evitando conflitos de nomes entre classes.
// ============================================================

// ============================================================
// Importa a classe Arrays da biblioteca java.util.
// A classe Arrays fornece métodos utilitários para manipulação de arrays,
// 			como conversão para listas, ordenação, busca binária, preenchimento, etc.
// ============================================================
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// ============================================================
// Declara a classe pública chamada Exemplo02.
// Em Java, toda aplicação precisa ter pelo menos uma classe.
// A palavra-chave 'public' indica que essa classe pode ser acessada
// 			por qualquer outra classe de qualquer pacote.
// ============================================================
public class Exemplo02 {

    // ============================================================
    // Declara o método main, que é o ponto de entrada de um programa Java.
    // A assinatura "public static void main(String[] args)" é obrigatória
    // para que o programa possa ser executado diretamente pela JVM.
    // - public: acesso de qualquer parte do código.
    // - static: pode ser executado sem precisar instanciar a classe.
    // - void: não retorna valor.
    // - String[] args: permite receber argumentos de linha de comando.
    // ============================================================
    public static void main(String[] args) {

        // ============================================================
        // EXEMPLO 1 - Iterando sobre lista e parando quando encontrar "C"
        // ============================================================

        // Cria uma lista imutável contendo as letras "A", "B", "C", "D" e "E".
        // O método Arrays.asList() converte um array fixo em uma lista do tipo List.
        List<String> lista = Arrays.asList("A", "B", "C", "D", "E");

        // Inicia um loop for-each para percorrer todos os elementos da lista.
        // A variável 'item' assumirá o valor de cada elemento da lista, um de cada vez.
        for (String item : lista) {

            // Exibe no console o valor atual da variável 'item'.
            System.out.println(item);

            // Verifica se o valor atual de 'item' é igual à string "C".
            // O método equals() compara o conteúdo de strings (não a referência de
            // memória).
            if (item.equals("C")) {

                // Se o valor for "C", o comando break interrompe imediatamente o loop,
                // fazendo com que o programa siga para a próxima instrução após o laço.
                break;

            }
        }

        // Imprime uma linha em branco no console para separar visualmente os exemplos.
        System.out.println();

        // ============================================================
        // EXEMPLO 2 - Iterando sobre uma lista de frutas
        // ============================================================

        // Aqui vamos criar e percorrer uma lista de elementos do tipo String,
        // representando frutas. Esse exemplo demonstra como o loop for
        // é usado para iterar sobre cada elemento sem precisar de índices numéricos.
        // É uma forma mais simples e legível do que o for tradicional, ideal
        // quando não precisamos modificar os elementos nem saber sua posição.
        // ============================================================

        // ====================================================================
        // Cria uma lista do tipo List<String> chamada "frutas".
        // O método Arrays.asList(...) recebe um conjunto de elementos como
        // argumentos e os converte internamente em uma lista fixa (imutável
        // quanto ao tamanho, ou seja, não podemos adicionar nem remover itens).
        // Os elementos fornecidos são "maçã", "banana" e "laranja".
        // Internamente, Arrays.asList cria uma lista respaldada por um array
        // (chamado "backing array"), onde qualquer alteração nos elementos
        // reflete no array original.
        // Como estamos usando o tipo genérico <String>, garantimos que todos
        // os elementos da lista são Strings, impedindo a inserção de outros tipos.
        // ====================================================================
        List<String> frutas = Arrays.asList("maçã", "banana", "laranja");

        // ====================================================================
        // Inicia um laço de repetição do tipo "for-each".
        // A sintaxe "for (Tipo nomeVariavel : colecao)" significa:
        // - Para cada elemento presente na coleção "frutas",
        // - Armazene-o temporariamente na variável "fruta".
        // Aqui, "fruta" é uma variável local do tipo String que
        // recebe o valor de cada elemento da lista, um de cada vez,
        // na ordem em que aparecem.
        // O for-each é implementado internamente pelo Java utilizando
        // um Iterator, que percorre os elementos sequencialmente
        // sem necessidade de acessar índices manualmente.
        // ====================================================================
        for (String fruta : frutas) {

            // ====================================================================
            // Imprime no console o valor atual da variável "fruta".
            // Como "fruta" é do tipo String, o método println() chama
            // internamente o método toString() dessa String (embora para
            // Strings ele apenas retorne o próprio conteúdo).
            // A cada iteração, será exibido o nome de uma fruta na tela.
            // Exemplo de saída:
            // maçã
            // banana
            // laranja
            // ====================================================================
            System.out.println(fruta);

        }

        // ====================================================================
        // Imprime uma linha em branco no console.
        // O println() sem argumentos imprime apenas uma quebra de linha.
        // Isso é útil aqui para separar visualmente a saída desse exemplo
        // dos exemplos seguintes, melhorando a legibilidade no console.
        // ====================================================================
        System.out.println();

        // ============================================================
        // EXEMPLO 3 - Iterando de 1 até um número digitado pelo usuário
        // ============================================================

        // Cria um objeto Scanner chamado 'entrada' para ler dados digitados pelo
        // usuário.
        Scanner entrada = new Scanner(System.in);

        // Solicita que o usuário digite um número e exibe a mensagem no console.
        System.out.print("Digite um número: ");

        // Lê o próximo valor inteiro digitado pelo usuário e armazena na
        // variável 'numeroDigitado'.
        int numeroDigitado = entrada.nextInt();

        // Inicia um loop for que começa no valor 1 e vai até 'numeroDigitado'
        // (inclusive).
        // A variável 'i' é o contador do laço, incrementado de 1 em 1.
        for (int i = 1; i <= numeroDigitado; i++) {

            // Exibe no console o valor atual de 'i'.
            System.out.println(i);

        }

        // Imprime uma linha em branco no console para separar os exemplos.
        System.out.println();

        // ============================================================
        // EXEMPLO 4 - Verificando se números são pares ou ímpares
        // ============================================================

        // ====================================================================
        // Cria uma lista imutável chamada "numeros" que contém os
        // valores inteiros de 1 a 10, em ordem crescente.
        // O método Arrays.asList(...) cria internamente um array fixo e retorna
        // uma "view" desse array no formato de List<Integer>.
        // Por ser uma lista "fixa", não é possível adicionar ou remover elementos,
        // mas é possível alterar valores existentes se necessário (neste caso,
        // não vamos alterar nada).
        // O uso de <Integer> indica que estamos lidando com um tipo genérico
        // que aceita apenas objetos Integer, o que é a
        // versão "wrapper" do tipo primitivo int.
        // O autoboxing do Java converte automaticamente os
        // números literais (1, 2, 3...) em objetos Integer.
        // ====================================================================
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // ====================================================================
        // Inicia um loop for-each para percorrer cada elemento da lista "numeros".
        // A sintaxe "for (tipo variavel : lista)" significa que para cada elemento
        // presente na lista, o valor será atribuído à variável "numero".
        // Aqui, "numero" é do tipo int (primitivo), então o Java realiza
        // "unboxing" automaticamente, convertendo o Integer da lista em int.
        // Internamente, o for-each usa um objeto Iterator para acessar os elementos,
        // mas essa complexidade é escondida do programador,
        // deixando o código mais limpo.
        // ====================================================================
        for (int numero : numeros) {

            // ====================================================================
            // Verifica se o valor atual de "numero" é par.
            // O operador "%" é o operador de módulo, que retorna o resto da divisão
            // inteira entre dois números.
            // Quando "numero % 2" retorna 0, significa que o número é
            // múltiplo de 2 e, portanto, par.
            // Esse teste é uma forma clássica de identificar
            // números pares em programação.
            // ====================================================================
            if (numero % 2 == 0) {

                // ====================================================================
                // Se o número for par, imprime no console uma mensagem indicando isso.
                // O operador "+" está sendo usado aqui para concatenar (juntar)
                // a variável "numero" com a string " é par".
                // No momento da execução, o número é convertido para String
                // automaticamente através do método toString() interno do
                // tipo Integer.
                // Exemplo de saída: "2 é par"
                // ====================================================================
                System.out.println(numero + " é par");

            } else {

                // ====================================================================
                // Caso contrário (se o número não for par), significa que ele é ímpar.
                // A execução cai neste bloco else, imprimindo a mensagem correspondente.
                // Aqui também ocorre a concatenação e conversão do
                // número para String antes da exibição.
                // Exemplo de saída: "3 é ímpar"
                // ====================================================================
                System.out.println(numero + " é ímpar");

            }
        }

        // Fecha o objeto Scanner para liberar recursos e
        // evitar vazamentos de memória.
        entrada.close();

    }
}
