# Justificativas — Parte 1 (Depuração)

Preencha uma seção para cada um dos 11 métodos da classe `Locadora`. Para cada um,
diga se ele tinha um bug ou não, e então explique o que estava
errado e por que a sua correção resolve o problema (ou explique por que
decidiu que o método já estava correto).
Se for fazer em dupla, cada aluno coloca aqui nesse arquivo quais respondeu.

## 1. contarCarrosDisponiveis

**Tinha bug? Não**

**Explicação:**

## 2. calcularReceitaTotalFrota

**Tinha bug? Sim**

**Explicação: int i =0**

       double total = 0;
        for (int i = 0; i < carros.length; i++) {
            total += carros[i].getValorDiaria();
        }
        return total;
    }

## 3. calcularMediaIdadeClientes

**Tinha bug? Sim**

**Explicação: Faltou uma Condicional If que vê se clientes tá zerada**

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

**Explicação:**

## 5. buscarCarroPorPlaca

**Tinha bug? Sim**

**Explicação:**

    if (encontrado != null){
        return encontrado.getModelo() + " - R$" + encontrado.getValorDiaria() + "/dia";
    }else{
        return "ERRO: Placa Não Encontrada!";
    }

## 6. calcularMultaAtraso

**Tinha bug? Sim**

**Explicação:**

        double multaPorDia = 40;
        double total = 0;
        for (int i = 0; i < diasAtraso; i++) {
            total += multaPorDia;
        }
        return total;
    }

## 7. processarLocacaoCompleta

**Tinha bug?**

**Explicação:**

## 8. calcularDiariaComCategoria

**Tinha bug?**

**Explicação:**

## 9. gerarResumoFrota

**Tinha bug?**

**Explicação:**

## 10. calcularDescontoEscalonado

**Tinha bug?**

**Explicação:**

## 11. clienteElegivelDescontoFidelidade

**Tinha bug?**

**Explicação:**
