package Estoque;

public class Main {
    public static void main(String[] args) {
        ItemEstoque est1 = new ItemEstoque("Sabão", 3, 200);

        est1.mostrarEstoque();
        System.out.println("---------------------------------------");
        est1.setNome("Sabonete");
        est1.setQtd(4);
        est1.setPreco(300);
        
        est1.mostrarEstoque();

        est1.adicionarQtd(3);
        est1.retirarQtd(7);

        System.out.println("=========================================");
        est1.mostrarEstoque();
    }
    
}
