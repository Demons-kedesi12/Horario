package Clientes;
import Produtos.Produto;

public class Cliente {
        private String nome;
        private String cpf;

    public Cliente(String nome, String cpf) {
        setCpf(cpf);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome!=null && !nome.trim().isEmpty()){
            this.nome = nome;
        }else{
            System.out.println("ERRO: Nome do cliente está inválido!");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf!=null && !cpf.trim().isEmpty()){
            this.cpf = cpf;
        }else{
            System.out.println("ERRO: CPF do cliente está inválido!");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
    public void realizarCompra(Produto produto){

        System.out.println("!!!COMPRA REALIZADA!!!");
        System.out.println("O Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println(produto);

    }
}
