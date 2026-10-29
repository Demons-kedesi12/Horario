package Atv13;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria", 500);

        String[] entrada = new String[]{"100", "600", "-50", "abc"};

        conta.exibirDados();
        System.out.println("===========================");
        for (int i=0;i< entrada.length;i++){
            System.out.println("---------------------");
            System.out.println("Sacar: " + entrada[i]);
            System.out.println("---------------------");


            try{

                double valor = Double.parseDouble(entrada[i]);
                conta.sacar(valor);
                System.out.println("Saque Realizado com Sucesso!");

            }catch (NumberFormatException e){
                System.out.println("ERRO: Entrada inválida. Não foi possível converter para número!");
            }catch (IllegalArgumentException e){
                System.out.println("Erro de validação: " + e.getMessage());
            }catch (SaldoInsuficienteException e){
                System.out.println("Erro de saldo: " + e.getMessage());
            }finally {
                System.out.printf("Saldo Atual: R$ %.2f%n", conta.getSaldo());
            }
        }
        System.out.println("---------------------");
        conta.exibirDados();
    }
}
