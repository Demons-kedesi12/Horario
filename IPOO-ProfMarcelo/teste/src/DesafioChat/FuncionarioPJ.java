package DesafioChat;

public class FuncionarioPJ extends Funcionario{
    private int qutdProjetos;

    public FuncionarioPJ(String matricula, String nome, double valorBase, int qutdProjetos) {
        super(matricula, nome, valorBase);
        this.qutdProjetos = qutdProjetos;
    }

    public int getQutdProjetos() {
        return qutdProjetos;
    }

    @Override
    public double calcularRemuneracao() {
        return getValorBase() + 500;
    }

    @Override
    public void iniciarAtividade() {
        super.iniciarAtividade();
        System.out.println("PJ iniciou a atividade!");
    }

    @Override
    public void encerrarAtividade() {
        super.encerrarAtividade();
        System.out.println("PJ encerrou a atividade!");
    }
}
