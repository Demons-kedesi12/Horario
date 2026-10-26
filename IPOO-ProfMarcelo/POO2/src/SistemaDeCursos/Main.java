package SistemaDeCursos;

public class Main {
    public static void main(String[] args) {
        CursoOnline online = new CursoOnline("IA",30);
        CursoPresencial presencial = new CursoPresencial("Ciência da Computação",35040);

        System.out.println("==== Curso Online ====");
        online.exibirDados();
        System.out.println();
        System.out.println("Calculando aprovação.........");
        System.out.println("!!!!!!!!!!!!!!!!!!");
        System.out.printf("O Valor do Investimento: R$ %.2f\n", online.calcularValor());
        online.emitirCertificado("Marcelo");
        System.out.println("!!!!!!!!!!!!!!!!!!");

        System.out.println("------------------------------------------------------");

        System.out.println("==== Curso Presencial ====");
        presencial.exibirDados();
        System.out.println();
        System.out.println("Calculando aprovação.........");
        System.out.println("!!!!!!!!!!!!!!!!!!");
        System.out.printf("O Valor do Investimento: R$ %.2f\n", presencial.calcularValor());
        presencial.emitirCertificado("Maria");
        System.out.println("!!!!!!!!!!!!!!!!!!");
    }
}
