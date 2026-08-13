package Livro;
public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("Manual de Assassinato Para Boas Garotas", "Holly Jackson" , 448, 2022 );
        Livro l2 = new Livro("The Tea Dragon Society", "K. O'Neill", 144, 2025);
 
        l1.apresentarLivros();
        System.out.println("==================================");
        l2.apresentarLivros();
        System.out.println();

        l1.setTitulo("Batata");
        l1.setAutor("Maria");
        l1.setPaginas(-1);
        System.out.println("==================================");
        l1.apresentarLivros();


    }
 }
 