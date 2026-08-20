package Empresa;

public class Vendedor extends Funcionario {
    private double valorVendas;
    private double percentualComissao;

    public Vendedor(String nome, int matricula, double salarioBase, double valorVendas, double percentualComissao) {
        super(nome, matricula, salarioBase);
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        if (valorVendas < 0){
            System.out.println("!! O Valor de Vendas não pode ser Negativo !!");
        }else{
            this.valorVendas = valorVendas;
        }
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        if (percentualComissao < 0 || percentualComissao > 100){
            System.out.println("!! O Percentual de Comissão deve estar entre 0 e 100 !!");
        }else{
            this.percentualComissao = percentualComissao;
        }
    }

    public void realizarVenda(){
        System.out.println("--> O VENDEDOR ESTÁ REALIZANDO UMA VENDA\n");
    }

    @Override
    public double calcularSalario() {
        double comissao=0;
        comissao = valorVendas * percentualComissao / 100;
        return super.calcularSalario() + comissao ;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Valor das Vendas: " + valorVendas );
        System.out.println("Percentual de Comissão: " + percentualComissao);
    }
}
