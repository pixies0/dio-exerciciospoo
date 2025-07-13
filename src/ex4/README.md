# Sistema de Ingressos de Cinema

## Descrição

Implementação de um sistema de ingressos para cinema com diferentes tipos (normal, meia-entrada e família), utilizando herança e polimorfismo em Java.

## Funcionalidades

* Classe base Ingresso com valor base, filme e tipo de áudio*
* MeiaEntrada calcula 50% do valor base*
* IngressoFamilia aplica desconto progressivo*
* Método polimórfico getValorReal() em cada subclasse*
* Validações automáticas nos cálculos

## Como usar

```
IngressoFamilia familia = new IngressoFamilia(30.0, "Matrix", false, 4);
System.out.println(familia.getValorReal()); // Calcula com desconto
```