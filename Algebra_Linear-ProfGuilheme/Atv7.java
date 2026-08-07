import java.util.Scanner;

public class Atv7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá! Seja Bem Vindo(a)!");
        int tamanho = pergunta(entrada);

        double[][] matriz = new double[tamanho][tamanho];

        identidade(matriz, tamanho);

        mostrarMatriz(matriz, tamanho);

        entrada.close();
    }

    public static int pergunta(Scanner entrada) {
        System.out.println("Informe o Tamanho da Matriz Identidade:");
        System.out.print("Tamanho N: ");

        int tamanho = entrada.nextInt();

        return tamanho;
    }

    public static void identidade(double[][] matriz, int tamanho) {

        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < tamanho; c++) {

                if (l == c) {
                    matriz[l][c] = 1;
                } else {
                    matriz[l][c] = 0;
                }
            }
        }
    }

    public static void mostrarMatriz(double[][] matriz, int tamanho) {

        System.out.println("\nMatriz Identidade:");

        for (int l = 0; l < tamanho; l++) {
            for (int c = 0; c < tamanho; c++) {
                System.out.print(matriz[l][c] + "\t");
            }

            System.out.println();
        }
    }
}