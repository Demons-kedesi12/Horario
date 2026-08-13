package Livro;
public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
 
    public Livro(String titulo, String autor, int paginas, int ano ){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public void apresentarLivros(){
 
        System.out.println("Nome do Livro: " + titulo + "\nAutor: " + autor + "\nQuantidade de Páginas: " + paginas);
    }
 
    public void setTitulo(String titulo){
        if(titulo==null){
            System.out.println("Nome do Título Inválido!");
        }else{
            this.titulo=titulo;
        }
    }
    public void setAutor(String autor){
        if(autor==null){
            System.out.println("Nome do Autor Inválido!");
        }else{
            this.autor=autor;
        }
    }
    public void setPaginas(int paginas){
        if(paginas<0){
            System.out.println("Valor de Páginas Inválido!");
        }else{
            this.paginas=paginas;
        }
    }

    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getPaginas(){
        return paginas;
    }
 }
 