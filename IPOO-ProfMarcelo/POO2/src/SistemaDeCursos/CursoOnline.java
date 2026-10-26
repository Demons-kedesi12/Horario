package SistemaDeCursos;

public class CursoOnline extends Curso implements Certificavel{

    public CursoOnline(String nome, int cargaHoraria) {
        super(nome, cargaHoraria);
    }

    @Override
    double calcularValor() {
        return (getCargaHoraria() * 15.00) + 50.00;
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("Parabéns " + nomeAluno + "! Você Concluiu o Curso Online: " + getNome() + "! Sua Carga Horária foi de: " + getCargaHoraria());

    }
}
