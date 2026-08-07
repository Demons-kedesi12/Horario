import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lA = 0;
        int cA = 0;
        int lB = 0;
        int cB = 0;

        System.out.println("==== Seja Bem vindo(a) ao Multiplicador de Matrizes ====");
        System.out.println("Informe a Linha da Matriz A");
        lA = entrada.nextInt();
        System.out.println("Informe a Coluna da Matriz A");
        cA = entrada.nextInt();
        System.out.println("----------------------------------");
        System.out.println("Informe a Linha da Matriz B");
        lB = entrada.nextInt();
        System.out.println("Informe a Coluna da Matriz B");
        cB = entrada.nextInt();

        if (cA == lB) {
            double[][] matrizA = new double[lA][cA];
            double[][] matrizB = new double[lB][cB];
            double[][] matrizC = new double[lA][cB];

            System.out.println("================================");
            System.out.println("Informe os Valores da Matriz A:");
            for (int l = 0; l < lA; l++) {
                for (int c = 0; c < cA; c++) {
                    matrizA[l][c] = entrada.nextDouble();
                }
            }

            System.out.println("================================");
            System.out.println("Informe os Valores da Matriz B:");
            for (int l = 0; l < lB; l++) {
                for (int c = 0; c < cB; c++) {
                    matrizB[l][c] = entrada.nextDouble();
                }
            }

            System.out.println("================================");
            System.out.println("As Matrizes são: ");
            System.out.println("MATRIZ A:");
            for (int l = 0; l < lA; l++) {
                for (int c = 0; c < cA; c++) {
                    System.out.print("|" + matrizA[l][c] + "\t");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("MATRIZ B:");
            for (int l = 0; l < lB; l++) {
                for (int c = 0; c < cB; c++) {
                    System.out.print("|" + matrizB[l][c] + "\t");
                }
                System.out.println();
            }
            System.out.println();
            for (int i = 0; i < lA; i++) {
                for (int j = 0; j < cB; j++) {
                    for (int k = 0; k < lB; k++) {
                        matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }
            System.out.println("================================");
            System.out.println("A Multiplicação das Matrizes A e B é: ");
            System.out.println("MATRIZ C:");
            for (int l = 0; l < lA; l++) {
                for (int c = 0; c < cB; c++) {
                    System.out.print("|" + matrizC[l][c] + "\t");
                }
                System.out.println();
            }

        } else {
            System.out.println(
                    "O valor da Coluna da Matriz A e a Linha da Matriz B não são iguais.\n!!!Falha na Multiplicação!!!");
        }
    }
}
