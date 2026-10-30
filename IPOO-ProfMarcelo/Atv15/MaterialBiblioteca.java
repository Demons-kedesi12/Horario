package Atv15;

public abstract class MaterialBiblioteca {
    private final String codigo;
    private final String titulo;

    public MaterialBiblioteca(String codigo, String titulo) {

        if (codigo == null || codigo.trim().isEmpty()){
            throw new IllegalArgumentException("O código está nulo ou vazio.");
        }

        if (titulo == null || titulo.trim().isEmpty()){
            throw new IllegalArgumentException("O código está nulo ou vazio.");
        }
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }
    public void exibirDados(){
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
    }
    abstract void exibirSituacao();
}
