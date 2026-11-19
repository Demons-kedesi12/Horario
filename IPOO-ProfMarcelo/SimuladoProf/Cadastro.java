package Simulado.SimuladoProf;

import java.util.ArrayList;
import java.util.List;

public class Cadastro<T>{
    List<T> cadastro = new ArrayList<>();

    public List<T> getElementos() {
        return cadastro;
    }

    public void adicionar(T x){
        if (x == null){
            throw new IllegalArgumentException("ERRO: Valor de Cadastro Inválido!");
        }else{
            this.cadastro.add(x);
        }
    }
}
