# Exercício 1: Conta Bancária

## Objetivo
Implementar uma conta bancária com suporte a **cheque especial**, seguindo regras específicas para saques, depósitos e cobrança de taxas.

## Funcionalidades

- **Operações Básicas:**
  - Consultar saldo.
  - Depositar dinheiro.
  - Sacar dinheiro.
  - Pagar boletos.

- **Cheque Especial:**
  - Limite definido no cadastro (R$50 para saldo ≤ R$500; 50% do saldo para valores maiores).
  - Taxa de **20%** sobre o valor utilizado quando a conta volta ao positivo.

## Regras de Negócio

1. **Saque/Pagamento:**
   - Bloqueado se ultrapassar `saldo + limite`.
   - Ativa `cheque especial` se saldo ficar negativo.

2. **Depósito:**
   - Cobra taxa de 20% sobre o valor usado do cheque especial (quando aplicável).

3. **Consulta:**
   - Exibe saldo atual e status do cheque especial.

## Como Usar

1. Ao iniciar, informe o **nome do titular** e o **saldo inicial**.
2. No menu interativo, escolha a operação desejada.

## Exemplo de Fluxo

```plaintext
> Digite o nome do titular: João
> Saldo inicial: R$1000

--- Conta Bancária ---
1. Consultar Saldo
2. Depositar Dinheiro
3. Sacar Dinheiro
4. Pagar Boleto
0. Sair

> Escolha: 3
> Valor a sacar: R$1200
Saque realizado. Saldo atual: -R$200 (usando cheque especial).