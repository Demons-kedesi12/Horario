package DesafioChat;

public class FuncionarioCLT extends Funcionario{

    private int qtdDependentes;

    public FuncionarioCLT(String matricula, String nome, double valorBase, int qtdDependentes) {
        super(matricula, nome, valorBase);
        this.qtdDependentes = qtdDependentes;
    }

    public int getQtdDependentes() {
        return qtdDependentes;
    }

    @Override
    public double calcularRemuneracao() {
        return getValorBase() + 300;
    }

    @Override
    public void iniciarAtividade() {
        super.iniciarAtividade();
        System.out.println("CLT iniciou a atividade!");
    }

    @Override
    public void encerrarAtividade() {
        super.encerrarAtividade();
        System.out.println("CLT encerrou a atividade!");
    }
}
