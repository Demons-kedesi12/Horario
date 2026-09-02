# Justificativas — Parte 1 (Depuração)

Preencha uma seção para cada um dos 11 métodos da classe `Locadora`. Para cada um,
diga se ele tinha um bug ou não, e então explique o que estava
errado e por que a sua correção resolve o problema (ou explique por que
decidiu que o método já estava correto).
Se for fazer em dupla, cada aluno coloca aqui nesse arquivo quais respondeu.

## 1. contarCarrosDisponiveis

**Tinha bug? Não**

**Explicação:**
    Não, pois como há no total 4 objetos da classe carro, e posteriormente, o carro do índice 1 é considerado indisponível com false, então deve-se ter apenas 3 carros disponíveis.

## 2. calcularReceitaTotalFrota

**Tinha bug? Sim**

**Explicação:** Sim, pois o problema encontrado foi na lógica de que int i antes atribuia 1, assim, para concertar a lógica, deve-se colocar que int i atribui 0.

       double total = 0;
        for (int i = 0; i < carros.length; i++) {
            total += carros[i].getValorDiaria();
        }
        return total;
    }

## 3. calcularMediaIdadeClientes

**Tinha bug? Sim**

**Explicação:** Sim, pois houve uma falha na lógica da falta de construção de uma condicional If que verifica se clientes estão zerados ou não.

    if (clientes.length > 0){
        for (int i = 0; i < clientes.length; i++) {
            soma += clientes[i].getIdade();
        }
        return soma / clientes.length;
    }else{
        return 0;
    }

## 4. buscarClienteMaisVelho

**Tinha bug? Não**

**Explicação:** A lógica se encontra verdadeira, em que o cliente mais velho da locadora é Marcos.

## 5. buscarCarroPorPlaca

**Tinha bug? Sim**

**Explicação:** Sim, pois houve uma falta de aplicação de lógica após o cálculo de encontrar a placa, tendo em vista que ele analisa se a variável encontrado é nula ou não, e responde de acordo.

    public String buscarCarroPorPlaca(Carro[] carros, String placa) {
        Carro encontrado = null;
        for (int i = 0; i < carros.length; i++) {
            if (carros[i].getPlaca().equals(placa)) {
                encontrado = carros[i];
            }
        }
        if (encontrado != null){
            return encontrado.getModelo() + " - R$" + encontrado.getValorDiaria() + "/dia";

        }else{
            return "ERRO: Placa Não Encontrada!";
        }
    }

## 6. calcularMultaAtraso

**Tinha bug? Sim**

**Explicação:** Sim, pois na estrutura de repetição for, houve erros na lógica, assim a estrutura consertada a seguir:

        double multaPorDia = 40;
        double total = 0;
        for (int i = 0; i < diasAtraso; i++) {
            total += multaPorDia;
        }
        return total;
    }

## 7. processarLocacaoCompleta

**Tinha bug? Sim**

**Explicação:** Sim, pois na função private double aplicarDescontosEEncargos, encontra-se dois problemas, o problema é que na lógica da condicional, não havia o else, fazendo assim o return ter problema, além disso, o enunciado diz expressamente que deve ser cliente.isApto() && dias >= 7), mas antes estava OU(||). Assim, abaixo está o concerto.

    private double aplicarDescontosEEncargos(double valorBruto, Cliente cliente, int dias) {
        if (cliente.isApto() && dias >= 7) {
            return valorBruto * 0.85;
        }else{
            return valorBruto;
        }
    }

## 8. calcularDiariaComCategoria

**Tinha bug? Não**

**Explicação:** Não havia bugs, pois toda a lógica foi efetivada, sendo essa, atribuir o valor da categoria, e depois retornar o valor da categoria * dias.

## 9. gerarResumoFrota

**Tinha bug?**

**Explicação:**

## 10. calcularDescontoEscalonado

**Tinha bug?**

**Explicação:**

## 11. clienteElegivelDescontoFidelidade

**Tinha bug?**

**Explicação:**
