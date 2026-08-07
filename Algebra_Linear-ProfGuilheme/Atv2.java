import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        // cria o leitor
        Scanner entrada = new Scanner(System.in);

        // cria a matriz a
        double[][] matrizA = new double[3][3];
        // cria a matriz b
        double[][] matrizB = new double[3][3];
        // cria a matriz c
        double[][] matrizC = new double[3][3];

        // exibe o título
        System.out.println("=== Bem-vindo(a) ao Registro de Matrizes ===");

        // pede os valores da a
        System.out.println("Informe os valores da Matriz A:");
        // lê a matriz a
        lerMatriz(matrizA, entrada);

        // pede os valores da b
        System.out.println("\nInforme os valores da Matriz B:");
        // lê a matriz b
        lerMatriz(matrizB, entrada);

        // exibe o título
        System.out.println("\nAs Matrizes são:");

        // mostra o nome da a
        System.out.println("MATRIZ A:");
        // exibe a matriz a
        mostrarMatriz(matrizA);

        // mostra o nome da b
        System.out.println("\nMATRIZ B:");
        // exibe a matriz b
        mostrarMatriz(matrizB);

        // soma as matrizes
        somarMatrizes(matrizA, matrizB, matrizC);

        // mostra o resultado
        System.out.println("\nA soma das Matrizes A e B é:");
        // mostra o nome da c
        System.out.println("MATRIZ C:");
        // exibe a matriz c
        mostrarMatriz(matrizC);

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

    // soma as matrizes
    public static void somarMatrizes(double[][] matrizA, double[][] matrizB, double[][] matrizC) {
        // percorre as linhas
        for (int l = 0; l < 3; l++) {
            // percorre as colunas
            for (int c = 0; c < 3; c++) {
                // soma os valores
                matrizC[l][c] = matrizA[l][c] + matrizB[l][c];
            }
        }
    }
}