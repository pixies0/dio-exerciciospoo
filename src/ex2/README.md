# Exercício 2: Sistema de Controle de Carro

## Objetivo
Implementar um sistema que simula as operações básicas de um carro, com controle de marchas, velocidade e estado do veículo.

## Funcionalidades Implementadas

- **Controle de estado:**
  - Ligar/desligar o carro
  - Verificar estado atual

- **Controle de movimento:**
  - Acelerar (incremento de 1km/h)
  - Diminuir velocidade (decremento de 5km/h)
  - Virar para esquerda/direita

- **Controle de marchas:**
  - 6 marchas + ponto morto (0)
  - Aumentar/diminuir marcha
  - Troca para marcha específica
  - Verificação de compatibilidade entre velocidade e marcha

## Regras de Negócio

1. **Estado inicial:**
   - Carro desligado
   - Marcha: ponto morto (0)
   - Velocidade: 0 km/h

2. **Restrições:**
   - Só pode ligar/desligar quando em ponto morto e velocidade zero
   - Só pode acelerar quando engatado em alguma marcha
   - Marchas devem ser trocadas sequencialmente
   - Velocidade deve estar na faixa correta para cada marcha

3. **Limites de velocidade por marcha:**
   - 1ª: 0-20 km/h
   - 2ª: 21-40 km/h
   - 3ª: 41-60 km/h
   - 4ª: 61-80 km/h
   - 5ª: 81-100 km/h
   - 6ª: 101-120 km/h
