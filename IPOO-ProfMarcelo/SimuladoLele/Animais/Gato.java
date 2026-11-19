package Simulado.SimuladoLele.Animais;

import Simulado.SimuladoLele.Clinica.Vacinavel;
import Simulado.SimuladoLele.Excecoes.DadoInvalidoException;
import Simulado.SimuladoLele.Excecoes.VacinaDuplicadaException;

public class Gato extends Animal implements Vacinavel {
    private boolean castrar;

    public Gato(String nome, int idade, double peso, boolean castrar) throws DadoInvalidoException {
        super(nome, idade, peso);
        this.castrar = castrar;
    }

    @Override
    public double calcularValorConsulta() {
        if (castrar){
            return 70;
        }else{
            return 90;
        }
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Castração: " + castrar );
    }

    public boolean isCastrar() {
        return castrar;
    }

    public void setCastrar(boolean castrar) {
        this.castrar = castrar;
    }

    @Override
    public void aplicarVacina(String vacina) throws VacinaDuplicadaException {
        getFicha().registrarVacina(vacina);
    }
}
