import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matrizA = new double[3][3];
        int[] posicao = new int [4];

        System.out.println("Seja Bem Vindo(a) ao Localizador de Matriz");

        System.out.println("Informe os Valores da Matriz A:");
        for (int l=0; l<3; l++){
            for (int c=0; c<3; c++){
                matrizA[l][c] = entrada.nextDouble();
            }
        }
        double maior= matrizA[0][0], menor=matrizA[0][0];

        System.out.println();
        System.out.println("MATRIZ A:");
        for (int l=0; l<3;l++){
            for (int c=0; c<3;c++){
                System.out.print( "|" + matrizA[l][c] + "\t");
            }
            System.out.println();
        }
        for (int l=0; l<3; l++){
            for (int c=0; c<3; c++){
                if(matrizA[l][c] > maior){
                    maior = matrizA[l][c];
                    posicao[0] = l;
                    posicao[1] = c;

                }
            }
        }
        for (int l=0; l<3; l++){
            for (int c=0; c<3; c++){
                if(matrizA[l][c] < menor){
                    menor = matrizA[l][c];
                    posicao[2] = l;
                    posicao[3] = c;
                }
            }
        }

        System.out.println("O Maior Elemento da Matriz é: " + maior + " E está na posição: [ " + posicao[0] + " , " + posicao[1] + " ] " );
        System.out.println("O Menor Elemento da Matriz é: " + menor + " E está na posição: [ " + posicao[2] + " , " + posicao[3] + " ] " );
    }    
}
