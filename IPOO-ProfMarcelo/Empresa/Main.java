package Empresa;

public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente("Jett",625223,3252,800);
        Vendedor v = new Vendedor("José",12414,1000, 2400,10);
        Estagiario e = new Estagiario("Mariana",261041201,1200,"UniFil");

        System.out.println(" ======== Empresa da Microsoft ========");
        System.out.println("------------ Funcionários -------------");
        g.realizarReuniao();
        g.mostrarDados();

        System.out.println("-----------------------------");
        v.realizarVenda();
        v.mostrarDados();

        System.out.println("-----------------------------");
        e.realizarTreinamento();
        e.mostrarDados();

        System.out.println();
    }
}
