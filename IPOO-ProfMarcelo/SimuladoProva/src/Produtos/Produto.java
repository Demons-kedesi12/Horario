package Produtos;

public class Produto {
    private String nome;
    private String marca;
    private int ano;
    private CodigoProduto codigoProduto;

    public Produto(String nome, String marca, int ano, String codigo, String id) {
        setAno(ano);
        setMarca(marca);
        setNome(nome);
        this.codigoProduto = new CodigoProduto(codigo,id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome!=null && !nome.trim().isEmpty()){
            this.nome = nome;
        }else{
            System.out.println("ERRO: Nome do produto está inválido!");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca!=null && !marca.trim().isEmpty()){
            this.marca = marca;
        }else{
            System.out.println("ERRO: Marca está inválida!");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano>0){
            this.ano = ano;
        }else{
            System.out.println("ERRO: Ano está inválido!");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", codigoProduto=" + codigoProduto +
                '}';
    }

    public void exibirMensagem(String mensagem){
        System.out.println(mensagem);
    }
    public void exibirMensagem(){
        System.out.println("Olá! Este é seu produto! ");
    }
    public void apresentarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Código do Produto: " + codigoProduto);
    }
}
