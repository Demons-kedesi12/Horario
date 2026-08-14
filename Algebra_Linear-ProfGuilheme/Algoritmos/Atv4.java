import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        // cria o leitor
        Scanner entrada = new Scanner(System.in);
        // cria as dimensões
        int lA, cA, lB, cB;

        // exibe o título
        System.out.println("==== Seja Bem-vindo(a) ao Multiplicador de Matrizes ====");
        // pede a linha da a
        System.out.print("Informe a Linha da Matriz A: ");
        // lê a linha da a
        lA = entrada.nextInt();
        // pede a coluna da a
        System.out.print("Informe a Coluna da Matriz A: ");
        // lê a coluna da a
        cA = entrada.nextInt();

        // separa as matrizes
        System.out.println("----------------------------------");
        // pede a linha da b
        System.out.print("Informe a Linha da Matriz B: ");
        // lê a linha da b
        lB = entrada.nextInt();
        // pede a coluna da b
        System.out.print("Informe a Coluna da Matriz B: ");
        // lê a coluna da b
        cB = entrada.nextInt();

        // verifica se pode multiplicar
        if (cA == lB) {

            // cria a matriz a
            double[][] matrizA = new double[lA][cA];
            // cria a matriz b
            double[][] matrizB = new double[lB][cB];
            // cria a matriz c
            double[][] matrizC = new double[lA][cB];

            // separa a leitura
            System.out.println("\n================================");
            // pede os valores da a
            System.out.println("Informe os valores da Matriz A:");
            // lê a matriz a
            lerMatriz(matrizA, entrada);

            // separa a leitura
            System.out.println("\n================================");
            // pede os valores da b
            System.out.println("Informe os valores da Matriz B:");
            // lê a matriz b
            lerMatriz(matrizB, entrada);

            // separa a exibição
            System.out.println("\n================================");
            // mostra o nome da a
            System.out.println("MATRIZ A:");
            // exibe a matriz a
            mostrarMatriz(matrizA);

            // mostra o nome da b
            System.out.println("\nMATRIZ B:");
            // exibe a matriz b
            mostrarMatriz(matrizB);

            // multiplica as matrizes
            multiplicarMatrizes(matrizA, matrizB, matrizC);

            // separa o resultado
            System.out.println("\n================================");
            // mostra o resultado
            System.out.println("A Multiplicação das Matrizes A e B é:");
            // mostra o nome da c
            System.out.println("MATRIZ C:");
            // exibe a matriz c
            mostrarMatriz(matrizC);

        } else {
            // informa o erro
            System.out.println("O valor da coluna da Matriz A e da linha da Matriz B não são iguais.");
            // informa a falha
            System.out.println("!!! Falha na Multiplicação !!!");
        }

        // fecha o leitor
        entrada.close();
    }

    // lê os valores
    public static void lerMatriz(double[][] matriz, Scanner entrada) {
        // percorre as linhas
        for (int l = 0; l < matriz.length; l++) {
            // percorre as colunas
            for (int c = 0; c < matriz[0].length; c++) {
                // armazena o valor
                matriz[l][c] = entrada.nextDouble();
            }
        }
    }

    // mostra a matriz
    public static void mostrarMatriz(double[][] matriz) {
        // percorre as linhas
        for (int l = 0; l < matriz.length; l++) {
            // percorre as colunas
            for (int c = 0; c < matriz[0].length; c++) {
                // exibe o valor
                System.out.print("| " + matriz[l][c] + "\t");
            }
            // quebra a linha
            System.out.println("|");
        }
    }

    // multiplica as matrizes
    public static void multiplicarMatrizes(double[][] matrizA, double[][] matrizB, double[][] matrizC) {
        // percorre as linhas da a
        for (int i = 0; i < matrizA.length; i++) {
            // percorre as colunas da b
            for (int j = 0; j < matrizB[0].length; j++) {
                // percorre os termos
                for (int k = 0; k < matrizB.length; k++) {
                    // calcula a multiplicação
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
    }
}
