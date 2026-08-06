import java.util.Scanner;

public class Atv1 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       double somaAluno=0, mAluno=0, somaBimestre=0;
       double[][] matrizA = new double[3][3];

       System.out.println(" === Bem vindo(a) ao Registro de notas dos alunos ===");

       for (int l=0; l<3; l++){
           System.out.println("\nInforme as notas do " + (1 + l) + "° aluno: ");
           for (int c=0; c<3; c++){
               System.out.print((1+c) + "° Nota: ");
               matrizA[l][c] = entrada.nextDouble();
           }
       }

       for (int l=0; l<3;l++){
           for (int c=0; c<3;c++){
               System.out.print( "|" + matrizA[l][c] + "\t");
           }
           System.out.println();
       }
   }
}
