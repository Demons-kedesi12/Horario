package Atv15;

public class Livro extends MaterialBiblioteca implements Emprestavel{
    private boolean emprestado = false;

    public Livro(String codigo, String titulo, boolean emprestado) {
        super(codigo, titulo);
        this.emprestado = emprestado;
    }

    @Override
    public void emprestar() {
        if (emprestado == true){
            throw new IllegalStateException("O livro já está emprestado!");
        }
        emprestado = true;

        System.out.println("O Livro foi Emprestado!");
    }

    @Override
    public void devolver() {
        if (emprestado == false){
            throw new IllegalStateException("O livro já foi devolvido!");
        }
        emprestado = false;

        System.out.println("O Livro foi Devolvido!");
    }

    @Override
    void exibirSituacao() {
        if (emprestado == true){
            System.out.println("Situação: Emprestado!");
        }else{
            System.out.println("Situação: Disponível!");
        }
    }
}
