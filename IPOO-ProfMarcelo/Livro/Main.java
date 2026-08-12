package Livro;
public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Manual de Assassinato Para Boas Garotas", "Holly Jackson" , 448, 2022 );
        Livro l2 = new Livro("The Tea Dragon Society", "K. O'Neill", 144, 2025);
 
        l1.apresentarLivros();
        l2.apresentarLivros();
        System.out.println();

        l1.setTitulo(null);
        l1.setAutor("");
        l1.setPaginas(200);
        System.out.println("==================================");
        l1.apresentarLivros();


    }
 }
 