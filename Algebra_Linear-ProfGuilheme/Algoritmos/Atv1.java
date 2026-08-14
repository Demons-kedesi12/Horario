import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        // cria o leitor
        Scanner entrada = new Scanner(System.in);
        // cria a matriz 3x3
        double[][] matrizA = new double[3][3];

        // exibe o título
        System.out.println("=== Bem-vindo(a) ao Registro de notas dos alunos ===");

        // chama a função de leitura
        lerNotas(matrizA, entrada);
        // chama a função de exibição
        mostrarNotas(matrizA);

        // fecha o leitor
        entrada.close();
    }

    // lê as notas
    public static void lerNotas(double[][] matriz, Scanner entrada) {
        // percorre as linhas
        for (int l = 0; l < 3; l++) {
            // mostra o aluno atual
            System.out.println("\nInforme as notas do " + (l + 1) + "° aluno:");
            // percorre as colunas
            for (int c = 0; c < 3; c++) {
                // pede a nota
                System.out.print((c + 1) + "° Nota: ");
                // armazena a nota
                matriz[l][c] = entrada.nextDouble();
            }
        }
    }

    // mostra as notas
    public static void mostrarNotas(double[][] matriz) {
        // exibe o título
        System.out.println("\nNotas dos alunos:");

        // percorre as linhas
        for (int l = 0; l < 3; l++) {
            // percorre as colunas
            for (int c = 0; c < 3; c++) {
                // exibe cada nota
                System.out.print("| " + matriz[l][c] + "\t");
            }
            // quebra a linha
            System.out.println("|");
        }
    }
}
