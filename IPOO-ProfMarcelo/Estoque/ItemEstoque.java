package Estoque;

public class ItemEstoque {
    private String nome;
    private int qtd;
    private double preco;

    public ItemEstoque(String nome,int qtd, double preco){
        this.nome = nome;
        this.qtd = qtd;
        this.preco = preco;
    }

    public void mostrarEstoque(){
 
        System.out.println("Nome do Produto: " + nome + "\nQuantidade: " + qtd + "\nPreço: " + preco);
    }

    public int adicionarQtd (int qtd){
        if(qtd <= 0){
            System.out.println("Valor Inválido!");
        }else{
            this.qtd += qtd;
        }
        return qtd;
    }

    public int retirarQtd(int qtd){
        if(this.qtd < qtd){
            System.out.println("Valor Inválido!");
        }else{
            this.qtd -= qtd;
        }
        return qtd;
    }
     
    public void setNome(String nome){
        if(nome == null){
            System.out.println("Nome inválido!");
        }else{
            this.nome = nome;
        }
    }
    public void setQtd(int qtd){
        if(qtd<0){
            System.out.println("Valor Inválido!");
        }else{
            this.qtd = qtd;
        }
    }
    public void setPreco(double preco){
        if(preco < 0){
            System.out.println("Preço Inválido!");
        }else{
            this.preco = preco;

        }
    }
 
    public String getNome(){
        return nome;
    }
    public int getQtd(){
        return qtd;
    }
    public double getPreco(){
        return preco;
    }
}
