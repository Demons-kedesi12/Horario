package Estoque;

public class Main {
    public static void main(String[] args) {
        ItemEstoque est1 = new ItemEstoque("Sabão", 3, 200);

        est1.mostrarEstoque();
        System.out.println("---------------------------------------");
        est1.setNome("Sabonete");
        est1.setPreco(400);
        
        est1.mostrarEstoque();

        System.out.println("==========================================");

        System.out.println("\nAdicionando Mais Quantidade...");
        est1.adicionarQtd(0);

        est1.mostrarEstoque();

        System.out.println("==========================================");

        System.out.println("Retirando Quantidade...");
        est1.retirarQtd(2);
        
        System.out.println("\nEstoque Atualizado: ");
        est1.mostrarEstoque();
    }
}
