package ChamadoDeSuporte;

public class Main {
    public static void main(String[] args) {
        PrioridadeChamado chamado1 = PrioridadeChamado.ALTA;
        PrioridadeChamado chamado2 = PrioridadeChamado.MEDIA;
        PrioridadeChamado chamado3 = PrioridadeChamado.BAIXA;

        System.out.println("Chamado 01: " + chamado1 + " -> Prazo de até: " + chamado1.getPrazoHoras());
        System.out.println("Chamado 02: " + chamado2 + " -> Prazo de até: " + chamado2.getPrazoHoras());
        System.out.println("Chamado 03: " + chamado3 + " -> Prazo de até: " + chamado3.getPrazoHoras());
    }
}
