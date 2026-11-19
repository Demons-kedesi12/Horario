package Simulado.SimuladoLele.Clinica;

import Simulado.SimuladoLele.Excecoes.VacinaDuplicadaException;

import java.util.HashSet;
import java.util.Set;

public class FichaMedica {
    private String numero;
    private Set<String> vacinas = new HashSet<>();

    public FichaMedica(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public Set<String> getVacinas() {
        return vacinas;
    }

    public void registrarVacina(String vacina) throws VacinaDuplicadaException {
        if (vacinas.contains(vacina)){
         throw new VacinaDuplicadaException("ERRO: Vacina Está Duplicada!");
        }
        vacinas.add(vacina);
    }
    public void listarVacinas(){
        if (vacinas.isEmpty()){
            System.out.println("Nenhuma Vacina Registrada!");
        }else{
            for (String x : vacinas){
                System.out.println(x);
            }
        }
    }
}
