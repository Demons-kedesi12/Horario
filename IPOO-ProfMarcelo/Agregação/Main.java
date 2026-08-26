
public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("Devas","Historia");
        Professor p2= new Professor("Amanda","Literatura");

        Escola escola = new Escola("PGD","Londrina","Particular",p1);

        System.out.println(" ==== Bem vindo(a) aos Dados da SEMED ==== ");
        escola.apresentarDado();
        System.out.println();
        System.out.println("MUDANÇA DE PROFESSOR!!");
        escola.trocaProf(p2);
        escola.apresentarDado();


    }
}