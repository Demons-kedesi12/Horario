import java.util.Scanner;

public class Atv2 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double somaAluno=0, mAluno=0, somaBimestre=0;
       double[][] matrizA = new double[3][3];
       double[][] matrizB = new double[3][3];
       double[][] matrizC = new double[3][3];

       System.out.println(" === Bem vindo(a) ao Registro de Matrizes ===");

       System.out.println("Informe os Valores da Matriz A:");
       for (int l=0; l<3; l++){
           for (int c=0; c<3; c++){
               matrizA[l][c] = entrada.nextDouble();
           }
       }
       System.out.println();
       System.out.println("Informe os Valores da Matriz B:");
       for (int l=0; l<3; l++){
           for (int c=0; c<3; c++){
               matrizB[l][c] = entrada.nextDouble();
           }
       }
       System.out.println();
       System.out.println("As Matrizes são: ");
       System.out.println("MATRIZ A:");
       for (int l=0; l<3;l++){
           for (int c=0; c<3;c++){
               System.out.print( "|" + matrizA[l][c] + "\t");
           }
           System.out.println();
       }
       System.out.println();
       System.out.println("MATRIZ B:");
       for (int l=0; l<3;l++){
           for (int c=0; c<3;c++){
               System.out.print( "|" + matrizB[l][c] + "\t");
           }
           System.out.println();
       }
        System.out.println();

       for (int l=0; l<3;l++){
           for (int c=0; c<3;c++){
            matrizC[l][c] = matrizA[l][c] + matrizB[l][c];
           }
           System.out.println();
       }
       
       System.out.println("A Soma das Matrizes A e B é: ");
       System.out.println("MATRIZ C:");
       for (int l=0; l<3;l++){
           for (int c=0; c<3;c++){
               System.out.print( "|" + matrizC[l][c] + "\t");
           }
           System.out.println();
       }
   }
}
