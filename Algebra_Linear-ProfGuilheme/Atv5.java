import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matrizA = new double[3][3];
        double somaT=0, somaL =0, somaC=0;

        System.out.println(" === Bem vindo(a) Registro de Matriz ===");

        System.out.println("Informe os Valores da Matriz A:");
        for (int l=0; l<3; l++){
            for (int c=0; c<3; c++){
                matrizA[l][c] = entrada.nextDouble();
            }
        }

        System.out.println();
        System.out.println("MATRIZ A:");
        for (int l=0; l<3;l++){
            for (int c=0; c<3;c++){
                System.out.print( "|" + matrizA[l][c] + "\t");
            }
            System.out.println();
        }

        System.out.println("======================");
        System.out.println("Soma dos Valores da Matriz A: ");
        for (int l=0; l<3; l++){
            for (int c=0; c<3; c++){
                somaT += matrizA[l][c];
            }
        }
        System.out.println(somaT);

        System.out.println("======================");
        System.out.println("Soma da Primeira Linha da Matriz A: ");
        for (int c=0; c<3; c++){
                somaL += matrizA[0][c];
        }
        System.out.println(somaL);
        somaL =0;
        System.out.println("======================");
        System.out.println("Soma da Segunda Linha da Matriz A: ");
        for (int c=0; c<3; c++){
                somaL += matrizA[1][c];
        }
        System.out.println(somaL);
        somaL =0;

        System.out.println("======================");
        System.out.println("Soma da Terceira Linha da Matriz A: ");
        for (int c=0; c<3; c++){
                somaL += matrizA[2][c];
        }
        System.out.println(somaL);
        somaL =0;

        System.out.println("=========================================");
        System.out.println("Soma da Primeira Coluna da Matriz A: ");
            for (int l=0; l<3; l++){
                somaC += matrizA[l][0];
            }
        System.out.println(somaC);
        somaC=0;

        System.out.println("=========================================");
        System.out.println("Soma da Segunda Coluna da Matriz A: ");
            for (int l=0; l<3; l++){
                somaC += matrizA[l][1];
            }
        System.out.println(somaC);
        somaC=0;

        System.out.println("=========================================");
        System.out.println("Soma da Terceira Coluna da Matriz A: ");
            for (int l=0; l<3; l++){
                somaC += matrizA[l][2];
            }
        System.out.println(somaC);
        
    }
}
