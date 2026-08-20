package Empresa;

public class Estagiario extends Funcionario {
    private String instituicaoEnsino;

    public Estagiario(String nome, int matricula, double salarioBase, String instituicaoEnsino) {
        super(nome, matricula, salarioBase);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        if (instituicaoEnsino == null){
            System.out.println("!! A Instituição de Ensino não pode ser Nula !!");
        }else{
            this.instituicaoEnsino = instituicaoEnsino;
        }
    }


    public void realizarTreinamento(){
        System.out.println("--> O ESTAGIÁRIO ESTÁ REALIZANDO O TREINAMENTO\n");
    }
    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
    }
}
