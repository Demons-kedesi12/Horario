import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matrizA = new double[3][3];

        System.out.println("=== Bem-vindo(a) ao Registro de notas dos alunos ===");

        lerNotas(matrizA, entrada);
        mostrarNotas(matrizA);

        entrada.close();
    }
    public static void lerNotas(double[][] matriz, Scanner entrada) {
        for (int l = 0; l < 3; l++) {
            System.out.println("\nInforme as notas do " + (l + 1) + "° aluno:");
            for (int c = 0; c < 3; c++) {
                System.out.print((c + 1) + "° Nota: ");
                matriz[l][c] = entrada.nextDouble();
            }
        }
    }

    public static void mostrarNotas(double[][] matriz) {
        System.out.println("\nNotas dos alunos:");

        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("| " + matriz[l][c] + "\t");
            }
            System.out.println("|");
        }
    }
}