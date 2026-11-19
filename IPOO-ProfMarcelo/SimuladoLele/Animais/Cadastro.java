package Simulado.SimuladoLele.Animais;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cadastro <T extends Animal>{
    private List<T> cadastro = new ArrayList<>();
    private Map<String, T> mapaAnimais = new HashMap<>();

    public void cadastrar(T animal){
        if (mapaAnimais.containsKey(animal.getNome())){
            throw new IllegalArgumentException("ERRO: Nome já existe!");
        }
        cadastro.add(animal);
        mapaAnimais.put(animal.getNome(), animal);
    }

    public T buscarPorNome(String nome){
        return mapaAnimais.get(nome);
    }

    public double mediaIdades(){
        if (cadastro.isEmpty()) {
            return 0.0;
        }
        double soma = 0;
        for (T animal : cadastro) {
            soma += animal.getIdade();
        }
        return soma / cadastro.size();
    }
}
