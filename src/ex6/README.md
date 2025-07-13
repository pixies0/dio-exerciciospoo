# Relógios Internacionais

## Descrição

Sistema de relógios com suporte a diferentes formatos (Brasil 24h e EUA 12h AM/PM), mostrando polimorfismo e métodos abstratos.

## Destaques

* Classe base Relogio com validações de hora/minuto/segundo*
* RelogioBrasileiro: formato 24 horas*
* RelogioAmericano: conversão automática para 12h*
* Método sincronizar() funciona com qualquer subtipo*
* Formatação específica para cada país

## Uso Básico

```
RelogioAmericano usaClock = new RelogioAmericano(14, 0, 0); // 2:00 PM
System.out.println(usaClock.getHoraCompleta()); // "US Time: 02:00:00 PM"
```