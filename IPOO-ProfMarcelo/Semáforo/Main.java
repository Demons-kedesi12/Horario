package Semáforo;

public class Main {
    public static void main(String[] args) {
        CorSemaforo cor = CorSemaforo.VERMELHO;

        switch (cor){
            case VERDE:
                System.out.println("Siga!");
                break;
            case AMARELO:
                System.out.println("Atenção!");
                break;
            case VERMELHO:
                System.out.println("PARE!");
        }
    }
}
