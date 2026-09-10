package Loja;
import Clientes.Cliente;

public class Loja {
    private String nome;
    private String cidade;
    private Cliente cliente;

    public Loja(String nome, String cidade, Cliente cliente) {
        setCidade(cidade);
        setNome(nome);
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome!=null && !nome.trim().isEmpty()){
            this.nome = nome;
        }else{
            System.out.println("ERRO: Nome da Loja está inválido!");
        }    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade!=null && !cidade.trim().isEmpty()){
            this.cidade = cidade;
        }else{
            System.out.println("ERRO: Nome da Cidade está inválido!");
        }
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", cliente=" + cliente +
                '}';
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
