# Hierarquia de Usuários

## Descrição

Sistema de tipos de usuários (Gerente, Vendedor, Atendente) com diferentes permissões e funcionalidades, demonstrando herança e encapsulamento.

## Principais Características

* Classe abstrata Usuario com dados básicos e métodos comuns*
* Gerente: sempre admin, com métodos de relatório*
* Vendedor: controla quantidade de vendas*
* Atendente: gerencia valor em caixa*
* Validação de login para operações sensíveis

## Exemplo

```
Gerente gerente = new Gerente("Ana", "ana@empresa.com", "senha123");
gerente.realizarLogin("ana@empresa.com", "senha123");
gerente.gerarRelatorioFinanceiro();
```