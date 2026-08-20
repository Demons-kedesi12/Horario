package Empresa;

public class Gerente extends Funcionario {
    private double valorBonus;

    public Gerente(String nome, int matricula, double salarioBase, double valorBonus) {
        super(nome, matricula, salarioBase);
        this.valorBonus = valorBonus;
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        if (valorBonus < 0){
            System.out.println("!!O Bônus é Negativo!!");
        }else{
            this.valorBonus = valorBonus;
        }
    }

    public void realizarReuniao(){
        System.out.println("--> O GERENTE ESTÁ REALIZANDO UMA REUNIÃO\n");
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + valorBonus;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Bônus Concedido: " + valorBonus);
    }
}
