import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] matrizA = new double[3][3];
        double[][] matrizB = new double[3][3];
        double[][] matrizC = new double[3][3];

        System.out.println("=== Bem-vindo(a) ao Registro de Matrizes ===");

        System.out.println("Informe os valores da Matriz A:");
        lerMatriz(matrizA, entrada);

        System.out.println("\nInforme os valores da Matriz B:");
        lerMatriz(matrizB, entrada);

        System.out.println("\nAs Matrizes são:");

        System.out.println("MATRIZ A:");
        mostrarMatriz(matrizA);

        System.out.println("\nMATRIZ B:");
        mostrarMatriz(matrizB);

        subtrairMatrizes(matrizA, matrizB, matrizC);

        System.out.println("\nA Subtração das Matrizes A e B é:");
        System.out.println("MATRIZ C:");
        mostrarMatriz(matrizC);

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

    public static void subtrairMatrizes(double[][] matrizA, double[][] matrizB, double[][] matrizC) {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                matrizC[l][c] = matrizA[l][c] - matrizB[l][c];
            }
        }
    }
}