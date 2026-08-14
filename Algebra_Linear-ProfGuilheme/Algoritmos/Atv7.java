import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        // cria o leitor
        Scanner entrada = new Scanner(System.in);

        // exibe a msg inicial
        System.out.println("Olá! Seja Bem Vindo(a)!");
        // chama a função
        int tamanho = pergunta(entrada);

        // cria a matriz
        double[][] matriz = new double[tamanho][tamanho];

        // monta a identidade
        identidade(matriz, tamanho);

        // mostra a matriz
        mostrarMatriz(matriz, tamanho);

        // fecha o leitor
        entrada.close();
    }

    // pergunta o tamanho
    public static int pergunta(Scanner entrada) {
        // pede o tamanho
        System.out.println("Informe o Tamanho da Matriz Identidade:");
        // mostra o campo
        System.out.print("Tamanho N: ");

        // lê o tamanho
        int tamanho = entrada.nextInt();

        // retorna o tamanho
        return tamanho;
    }

    // cria a matriz identidade
    public static void identidade(double[][] matriz, int tamanho) {

        // percorre as linhas
        for (int l = 0; l < tamanho; l++) {
            // percorre as colunas
            for (int c = 0; c < tamanho; c++) {

                // verifica a diagonal
                if (l == c) {
                    // coloca 1 na diagonal
                    matriz[l][c] = 1;
                } else {
                    // coloca 0 fora dela
                    matriz[l][c] = 0;
                }
            }
        }
    }

    // mostra a matriz
    public static void mostrarMatriz(double[][] matriz, int tamanho) {

        // mostra o título
        System.out.println("\nMatriz Identidade:");

        // percorre as linhas
        for (int l = 0; l < tamanho; l++) {
            // percorre as colunas
            for (int c = 0; c < tamanho; c++) {
                // exibe o valor
                System.out.print(matriz[l][c] + "\t");
            }

            // quebra a linha
            System.out.println();
        }
    }
}
