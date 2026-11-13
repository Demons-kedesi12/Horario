package Livro;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("O Medo");

        System.out.println("Retorno: " + l1.emprestar() + " | " + l1);
        System.out.println();
        System.out.println("Retorno: " + l1.emprestar() + " | " + l1);
        System.out.println();
        System.out.println("Retorno: " + l1.devolver() + " | " + l1);

    }
}
