import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        // cria o leitor
        Scanner entrada = new Scanner(System.in);
        // cria a matriz a
        double[][] matrizA = new double[3][3];
        // cria o vetor de posição
        int[] posicao = new int [4];

        // exibe o título
        System.out.println("Seja Bem Vindo(a) ao Localizador de Matriz");

        // pede os valores da a
        System.out.println("Informe os Valores da Matriz A:");
        // percorre as linhas
        for (int l=0; l<3; l++){
            // percorre as colunas
            for (int c=0; c<3; c++){
                // armazena o valor
                matrizA[l][c] = entrada.nextDouble();
            }
        }
        // inicia maior e menor
        double maior= matrizA[0][0], menor=matrizA[0][0];

        // pula uma linha
        System.out.println();
        // mostra o nome da a
        System.out.println("MATRIZ A:");
        // percorre as linhas
        for (int l=0; l<3;l++){
            // percorre as colunas
            for (int c=0; c<3;c++){
                // exibe o valor
                System.out.print( "|" + matrizA[l][c] + "\t");
            }
            // quebra a linha
            System.out.println();
        }

        // procura o maior
        for (int l=0; l<3; l++){
            // percorre as colunas
            for (int c=0; c<3; c++){
                // compara com o maior
                if(matrizA[l][c] > maior){
                    // atualiza o maior
                    maior = matrizA[l][c];
                    // guarda a linha
                    posicao[0] = l;
                    // guarda a coluna
                    posicao[1] = c;

                }
            }
        }

        // procura o menor
        for (int l=0; l<3; l++){
            // percorre as colunas
            for (int c=0; c<3; c++){
                // compara com o menor
                if(matrizA[l][c] < menor){
                    // atualiza o menor
                    menor = matrizA[l][c];
                    // guarda a linha
                    posicao[2] = l;
                    // guarda a coluna
                    posicao[3] = c;
                }
            }
        }
        
        // mostra o maior e posição
        System.out.println("O Maior Elemento da Matriz é: " + maior + " E está na posição: [ " + posicao[0] + " , " + posicao[1] + " ] " );
        // mostra o menor e posição
        System.out.println("O Menor Elemento da Matriz é: " + menor + " E está na posição: [ " + posicao[2] + " , " + posicao[3] + " ] " );
        // fecha o leitor
        entrada.close();
    }    
}