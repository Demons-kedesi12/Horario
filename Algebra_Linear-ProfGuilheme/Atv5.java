import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        // cria o leitor
        Scanner entrada = new Scanner(System.in);
        // cria a matriz a
        double[][] matrizA = new double[3][3];

        // exibe o título
        System.out.println("=== Bem-vindo(a) ao Registro de Matriz ===");

        // pede os valores da a
        System.out.println("Informe os valores da Matriz A:");
        // lê a matriz a
        lerMatriz(matrizA, entrada);

        // mostra o nome da a
        System.out.println("\nMATRIZ A:");
        // exibe a matriz a
        mostrarMatriz(matrizA);

        // separa o resultado
        System.out.println("======================");
        // mostra o título
        System.out.println("Soma dos valores da Matriz A:");
        // mostra a soma total
        System.out.println(somaTotal(matrizA));

        // separa o resultado
        System.out.println("======================");
        // mostra o título
        System.out.println("Soma da Primeira Linha:");
        // mostra a soma da linha
        System.out.println(somaLinha(matrizA, 0));

        // separa o resultado
        System.out.println("======================");
        // mostra o título
        System.out.println("Soma da Segunda Linha:");
        // mostra a soma da linha
        System.out.println(somaLinha(matrizA, 1));

        // separa o resultado
        System.out.println("======================");
        // mostra o título
        System.out.println("Soma da Terceira Linha:");
        // mostra a soma da linha
        System.out.println(somaLinha(matrizA, 2));

        // separa o resultado
        System.out.println("======================");
        // mostra o título
        System.out.println("Soma da Primeira Coluna:");
        // mostra a soma da coluna
        System.out.println(somaColuna(matrizA, 0));

        // separa o resultado
        System.out.println("======================");
        // mostra o título
        System.out.println("Soma da Segunda Coluna:");
        // mostra a soma da coluna
        System.out.println(somaColuna(matrizA, 1));

        // separa o resultado
        System.out.println("======================");
        // mostra o título
        System.out.println("Soma da Terceira Coluna:");
        // mostra a soma da coluna
        System.out.println(somaColuna(matrizA, 2));

        // fecha o leitor
        entrada.close();
    }

    // lê os valores
    public static void lerMatriz(double[][] matriz, Scanner entrada) {
        // percorre as linhas
        for (int l = 0; l < 3; l++) {
            // percorre as colunas
            for (int c = 0; c < 3; c++) {
                // armazena o valor
                matriz[l][c] = entrada.nextDouble();
            }
        }
    }

    // mostra a matriz
    public static void mostrarMatriz(double[][] matriz) {
        // percorre as linhas
        for (int l = 0; l < 3; l++) {
            // percorre as colunas
            for (int c = 0; c < 3; c++) {
                // exibe o valor
                System.out.print("| " + matriz[l][c] + "\t");
            }
            // quebra a linha
            System.out.println("|");
        }
    }

    // soma todos os valores
    public static double somaTotal(double[][] matriz) {
        // inicia a soma
        double soma = 0;
        // percorre as linhas
        for (int l = 0; l < 3; l++) {
            // percorre as colunas
            for (int c = 0; c < 3; c++) {
                // soma o valor
                soma += matriz[l][c];
            }
        }
        // retorna a soma
        return soma;
    }

    // soma uma linha
    public static double somaLinha(double[][] matriz, int linha) {
        // inicia a soma
        double soma = 0;
        // percorre as colunas
        for (int c = 0; c < 3; c++) {
            // soma o valor
            soma += matriz[linha][c];
        }
        // retorna a soma
        return soma;
    }

    // soma uma coluna
    public static double somaColuna(double[][] matriz, int coluna) {
        // inicia a soma
        double soma = 0;
        // percorre as linhas
        for (int l = 0; l < 3; l++) {
            // soma o valor
            soma += matriz[l][coluna];
        }
        // retorna a soma
        return soma;
    }
}