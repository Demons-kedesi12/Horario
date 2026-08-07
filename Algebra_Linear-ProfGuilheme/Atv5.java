import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matrizA = new double[3][3];

        System.out.println("=== Bem-vindo(a) ao Registro de Matriz ===");

        System.out.println("Informe os valores da Matriz A:");
        lerMatriz(matrizA, entrada);

        System.out.println("\nMATRIZ A:");
        mostrarMatriz(matrizA);

        System.out.println("======================");
        System.out.println("Soma dos valores da Matriz A:");
        System.out.println(somaTotal(matrizA));

        System.out.println("======================");
        System.out.println("Soma da Primeira Linha:");
        System.out.println(somaLinha(matrizA, 0));

        System.out.println("======================");
        System.out.println("Soma da Segunda Linha:");
        System.out.println(somaLinha(matrizA, 1));

        System.out.println("======================");
        System.out.println("Soma da Terceira Linha:");
        System.out.println(somaLinha(matrizA, 2));

        System.out.println("======================");
        System.out.println("Soma da Primeira Coluna:");
        System.out.println(somaColuna(matrizA, 0));

        System.out.println("======================");
        System.out.println("Soma da Segunda Coluna:");
        System.out.println(somaColuna(matrizA, 1));

        System.out.println("======================");
        System.out.println("Soma da Terceira Coluna:");
        System.out.println(somaColuna(matrizA, 2));

        entrada.close();
    }

    public static void lerMatriz(double[][] matriz, Scanner entrada) {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                matriz[l][c] = entrada.nextDouble();
            }
        }
    }
    public static void mostrarMatriz(double[][] matriz) {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("| " + matriz[l][c] + "\t");
            }
            System.out.println("|");
        }
    }
    public static double somaTotal(double[][] matriz) {
        double soma = 0;
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                soma += matriz[l][c];
            }
        }
        return soma;
    }
    public static double somaLinha(double[][] matriz, int linha) {
        double soma = 0;
        for (int c = 0; c < 3; c++) {
            soma += matriz[linha][c];
        }
        return soma;
    }
    public static double somaColuna(double[][] matriz, int coluna) {
        double soma = 0;
        for (int l = 0; l < 3; l++) {
            soma += matriz[l][coluna];
        }
        return soma;
    }
}