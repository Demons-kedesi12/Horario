package Atv15;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro("m321","Príncipe Bondoso",false);

        operacaoEmprestar(l1);
        System.out.println("===================");
        operacaoEmprestar(l1);
        System.out.println("===================");
        operacaoDevolver(l1);
        System.out.println("===================");
        operacaoDevolver(l1);

    }

    public static void operacaoEmprestar(Livro l1){
        l1.exibirSituacao();
        l1.exibirDados();
        System.out.println("===================");


        try {
            l1.emprestar();
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }finally {
            l1.exibirSituacao();
            l1.exibirDados();
        }
    }

    public static void operacaoDevolver(Livro l1){
        l1.exibirSituacao();
        l1.exibirDados();
        System.out.println("===================");

        try {
            l1.devolver();
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());

        }finally {
            l1.exibirSituacao();
            l1.exibirDados();
        }
    }
}
