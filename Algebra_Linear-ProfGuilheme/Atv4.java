import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lA, cA, lB, cB;

        System.out.println("==== Seja Bem-vindo(a) ao Multiplicador de Matrizes ====");
        System.out.print("Informe a Linha da Matriz A: ");
        lA = entrada.nextInt();
        System.out.print("Informe a Coluna da Matriz A: ");
        cA = entrada.nextInt();

        System.out.println("----------------------------------");
        System.out.print("Informe a Linha da Matriz B: ");
        lB = entrada.nextInt();
        System.out.print("Informe a Coluna da Matriz B: ");
        cB = entrada.nextInt();

        if (cA == lB) {

            double[][] matrizA = new double[lA][cA];
            double[][] matrizB = new double[lB][cB];
            double[][] matrizC = new double[lA][cB];

            System.out.println("\n================================");
            System.out.println("Informe os valores da Matriz A:");
            lerMatriz(matrizA, entrada);

            System.out.println("\n================================");
            System.out.println("Informe os valores da Matriz B:");
            lerMatriz(matrizB, entrada);

            System.out.println("\n================================");
            System.out.println("MATRIZ A:");
            mostrarMatriz(matrizA);

            System.out.println("\nMATRIZ B:");
            mostrarMatriz(matrizB);

            multiplicarMatrizes(matrizA, matrizB, matrizC);

            System.out.println("\n================================");
            System.out.println("A Multiplicação das Matrizes A e B é:");
            System.out.println("MATRIZ C:");
            mostrarMatriz(matrizC);

        } else {
            System.out.println("O valor da coluna da Matriz A e da linha da Matriz B não são iguais.");
            System.out.println("!!! Falha na Multiplicação !!!");
        }

        entrada.close();
    }
    public static void lerMatriz(double[][] matriz, Scanner entrada) {
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                matriz[l][c] = entrada.nextDouble();
            }
        }
    }
    public static void mostrarMatriz(double[][] matriz) {
        for (int l = 0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print("| " + matriz[l][c] + "\t");
            }
            System.out.println("|");
        }
    }
    public static void multiplicarMatrizes(double[][] matrizA, double[][] matrizB, double[][] matrizC) {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[0].length; j++) {
                for (int k = 0; k < matrizB.length; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
    }
}