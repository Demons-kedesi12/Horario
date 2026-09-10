package Produtos;

public class ProdutoFisico extends Produto {
    private int qtdEstoque;

    public ProdutoFisico(String nome, String marca, int ano, String codigo, String id, int qtdEstoque) {
        super(nome, marca, ano, codigo, id);
        setQtdEstoque(qtdEstoque);
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        if (qtdEstoque > 0) {
            this.qtdEstoque = qtdEstoque;

        }else{
            System.out.println("ERRO: A quantidade de estoque está inválida");
        }
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Quantidade no Estoque: " + qtdEstoque);
    }
    public void vender(){
        System.out.println("..............O produto está sendo vendido!................");
    }

}
