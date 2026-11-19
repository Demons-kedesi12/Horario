package Simulado.SimuladoLele.Clinica;

import Simulado.SimuladoLele.Excecoes.VacinaDuplicadaException;

public interface Vacinavel {
    void aplicarVacina(String vacina) throws VacinaDuplicadaException;
}
