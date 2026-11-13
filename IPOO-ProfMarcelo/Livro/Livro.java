package Livro;

public class Livro {
    private String titulo;
    private SituacaoLivro situacao;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.situacao = SituacaoLivro.DISPONIVEL;
    }

    public boolean emprestar(){
        if (situacao == SituacaoLivro.DISPONIVEL){
            System.out.println("O livro está DISPONÍVEL! ---> Emprestando...");
            situacao = SituacaoLivro.EMPRESTADO;

            return true;
        }else{
            System.out.println("O livro NÃO está DISPONÍVEL! ---> FALHA...");

            return false;
        }
    }
    public boolean devolver(){
        if (situacao == SituacaoLivro.EMPRESTADO){
            System.out.println("O livro está EMPRESTADO! ---> Devolvendo...");
            situacao = SituacaoLivro.DISPONIVEL;

            return true;
        }else{
            System.out.println("O livro NÃO foi EMPRESTADO! ---> FALHA...");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Situação: " + situacao;
    }
}
