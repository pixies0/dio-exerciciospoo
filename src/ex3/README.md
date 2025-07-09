# Exercício 3: Sistema de Banho para Petshop

## Objetivo
Controlar uma máquina de banho para pets, gerenciando recursos e operações de limpeza.

## Funcionalidades Implementadas

- **Operações com pets:**
  - Colocar/retirar pet
  - Dar banho
  - Verificar presença de pet

- **Gerenciamento de recursos:**
  - Abastecer água e shampoo
  - Verificar níveis de recursos
  - Limpar a máquina

## Regras de Negócio

1. **Capacidades máximas:**
   - Água: 30 litros
   - Shampoo: 10 litros

2. **Consumos:**
   - Banho: 10L água + 2L shampoo
   - Limpeza: 3L água + 1L shampoo
   - Abastecimento: 2L por operação

3. **Restrições:**
   - Apenas 1 pet por vez
   - Pet retirado sem banho → máquina fica suja
   - Máquina suja precisa ser limpa antes de novo uso
   - Operações bloqueadas sem recursos suficientes
