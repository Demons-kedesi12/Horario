package Produtos;

public class ProdutoDigital extends Produto{
    private double tamanhoArquivo;

    public ProdutoDigital(String nome, String marca, int ano, String codigo, String id, double tamanhoArquivo) {
        super(nome, marca, ano, codigo, id);
        setTamanhoArquivo(tamanhoArquivo);
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        if (tamanhoArquivo> 0){
            this.tamanhoArquivo = tamanhoArquivo;
        }else{
            System.out.println("ERRO: Tamanho do Arquivo é inválido!");
        }
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Tamanho do Arquivo: " + tamanhoArquivo);
    }

    public void baixar(){
        System.out.println("..........O Livros está Baixando!.............");
    }

}
