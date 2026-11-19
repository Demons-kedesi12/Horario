package Simulado.SimuladoProf;

public class Cachorro extends Animal {

    public Cachorro(String nome, Porte porte) {
        super(nome, porte);
    }

    @Override
    public void emitir() {
        System.out.println("Au au!");
    }
}
