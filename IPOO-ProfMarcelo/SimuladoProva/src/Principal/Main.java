package Principal;

import Clientes.Cliente;
import Loja.Loja;
import Produtos.Produto;
import Produtos.ProdutoDigital;
import Produtos.ProdutoFisico;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new ProdutoDigital("Sabonete", "Dove",2009,"2334","11412421",331311);
        Produto p2 = new ProdutoFisico("Sabão","Qboa",3000,"345","211241",313);
        ProdutoDigital digital = new ProdutoDigital("Macarrão","Ratatui",3000,"213124","q44124",34.4);
        ProdutoFisico fisico = new ProdutoFisico("Escova","Bombril",2334,"242","3124",34);
        Cliente maria = new Cliente("Maria","119919191");
        Loja loja = new Loja("Lojinha","Londrina",maria);

        System.out.println("Bem Vindo(a) a Loja!");
        System.out.println("========================");
        System.out.println("====Todos os Produtos!====");
        p1.exibirMensagem();
        p1.apresentarDados();
        System.out.println("--------------------------");
        p2.exibirMensagem("Batata");
        p2.apresentarDados();
        System.out.println("========================");

        System.out.println("Produtos Físicos!");
        fisico.apresentarDados();
        fisico.vender();
        System.out.println("--------------------------");

        System.out.println("Produtos Digitais!");
        digital.apresentarDados();
        digital.baixar();

        System.out.println("========================");

        maria.realizarCompra(p2);
        System.out.println("========================");
        System.out.println("Dados das Lojas e seus Clientes");
        System.out.println(loja);

        System.out.println("========================");
        System.out.println("ATENÇÃO! Os dados dos produtos estão mudando!");
        p1.setNome("Margarina");
        p1.setMarca("Manteiguinha");
        p1.setAno(2008);
        System.out.println();
        p2.setNome("Varinha");

        p1.apresentarDados();
        System.out.println("Nome do Produto 2: " + p2.getNome());
    }
}
