package Simulado.SimuladoLele.Animais;

import Simulado.SimuladoLele.Clinica.FichaMedica;
import Simulado.SimuladoLele.Clinica.Vacinavel;
import Simulado.SimuladoLele.Excecoes.DadoInvalidoException;
import Simulado.SimuladoLele.Excecoes.VacinaDuplicadaException;

public class Cachorro extends Animal implements Vacinavel {
    private String porte;

    public Cachorro(String nome, int idade, double peso, String porte) throws DadoInvalidoException {
        super(nome, idade, peso);
        this.porte = porte;
    }

    public void setPorte(String porte) throws DadoInvalidoException {
        if (porte == null || porte.trim().isEmpty()) {
            throw new DadoInvalidoException("ERRO: Porte Inválido!");
        }
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    @Override
    public double calcularValorConsulta() {
        if (porte != null && porte.equalsIgnoreCase("pequeno")) {
            return 80.00;
        } else {
            return 120.00;
        }
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Porte: " + porte);
    }

    @Override
    public void aplicarVacina(String vacina) throws VacinaDuplicadaException {
        getFicha().registrarVacina(vacina);
    }
}
