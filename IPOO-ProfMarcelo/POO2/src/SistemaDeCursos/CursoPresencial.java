package SistemaDeCursos;

public class CursoPresencial extends Curso implements Certificavel{

    public CursoPresencial(String nome, int cargaHoraria) {
        super(nome, cargaHoraria);
    }

    @Override
    double calcularValor() {
        return getCargaHoraria() * 20.00;
    }

    @Override
    public void emitirCertificado(String nomeAluno) {
        System.out.println("Parabéns " + nomeAluno + "! Você Concluiu o Curso Presencial: " + getNome() + "! Sua Carga Horária foi de: " + getCargaHoraria());
    }

}
