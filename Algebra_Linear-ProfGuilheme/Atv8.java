import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int l, c;

        // exibe o título
        System.out.println("==== Seja Bem-vindo(a) ao Verificador de Matrizes Diagonais ====");
        // pede a linha da a
        System.out.print("Informe a Linha da Matriz A: ");
        // lê a linha da a
        l = entrada.nextInt();
        // pede a coluna da a
        System.out.print("Informe a Coluna da Matriz A: ");
        // lê a coluna da a
        c = entrada.nextInt();
    
    
         if(l == c){
            double[][] matriz = new double[l][c];
            System.out.println(" === Informe os Valores da Matriz ===");
            for(int i=0; i<l; i++){
                for(int j=0; j<c; j++){
                    matriz[i][j] = entrada.nextDouble();
                }
            }

            boolean diagonal = true;

            for(int i=0; i<l; i++){
                for(int j=0; j<c; j++){
                    if(i != j && matriz[i][j] !=0){
                        diagonal = false;
                    }
                }
            }
            if (diagonal) {
                System.out.println("A matriz é diagonal.");
            } else {
                System.out.println("A matriz não é diagonal.");
            }

        } else {
            System.out.println("Sua Matriz não é Quadrada");
        }
        entrada.close();
    }
}
