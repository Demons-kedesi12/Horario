import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // declara a quantidade de linhas
        int l = lerTamanho(entrada);

        // declara a quantidade de colunas
        int c = lerTamanhoColunas(entrada);

        // verifica se a matriz é quadrada
        if (l == c) {
            int[][] matriz = new int[l][c];

            // chama o procedimento para preencher
            preencherMatriz(matriz, entrada);
            // verifica se a matriz é diagonal
            boolean diagonal = verificarDiagonal(matriz);
            // mostra a matriz na tela
            mostrarMatriz(matriz);
            // mostra o resultado da verificação
            mostrarResultado(diagonal);
        } else {
            // informa que a matriz não é quadrada
            System.out.println("Sua Matriz não é Quadrada");
        }
        entrada.close();
    }
    // função que lê a quantidade de linhas
    public static int lerTamanho(Scanner entrada) {
        // mostra o título
        System.out.println("==== Seja Bem-vindo(a) ao Verificador de Matrizes Diagonais ====");

        // pede a quantidade de linhas
        System.out.print("Informe a Linha da Matriz A: ");

        // retorna o valor informado
        return entrada.nextInt();
    }
    // função que lê a quantidade de colunas
    public static int lerTamanhoColunas(Scanner entrada) {
        // pede a quantidade de colunas
        System.out.print("Informe a Coluna da Matriz A: ");

        // retorna o valor informado
        return entrada.nextInt();
    }
    // procedimento que preenche a matriz
    public static void preencherMatriz(int[][] matriz, Scanner entrada) {
        // mostra a mensagem
        System.out.println(" === Informe os Valores da Matriz ===");

        // percorre as linhas
        for (int i = 0; i < matriz.length; i++) {

            // percorre as colunas
            for (int j = 0; j < matriz[i].length; j++) {

                // recebe o valor da matriz
                matriz[i][j] = entrada.nextInt();
            }
        }
    }
    // função que verifica se a matriz é diagonal
    public static boolean verificarDiagonal(int[][] matriz) {
        // começa considerando a matriz diagonal
        boolean diagonal = true;

        // percorre as linhas
        for (int i = 0; i < matriz.length; i++) {
            // percorre as colunas
            for (int j = 0; j < matriz[i].length; j++) {
                // verifica os valores fora da diagonal
                if (i != j && matriz[i][j] != 0) {
                    // informa que não é diagonal
                    diagonal = false;
                }
            }
        }
        // retorna o resultado
        return diagonal;
    }
    // procedimento que mostra a matriz
    public static void mostrarMatriz(int[][] matriz) {
        // mostra o título da matriz
        System.out.println("\nMatriz: ");

        // percorre as linhas
        for (int i = 0; i < matriz.length; i++) {

            // percorre as colunas
            for (int j = 0; j < matriz[i].length; j++) {
                // mostra cada elemento
                System.out.print("|" + matriz[i][j] + "\t");
            }
            // pula para a próxima linha
            System.out.println();
        }
    }
    // procedimento que mostra o resultado
    public static void mostrarResultado(boolean diagonal) {

        // verifica o resultado
        if (diagonal) {
            // informa que é diagonal
            System.out.println("A matriz é diagonal.");

        } else {
            // informa que não é diagonal
            System.out.println("A matriz não é diagonal.");
        }
    }
}
