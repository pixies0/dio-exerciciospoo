# Calculadora de Áreas de Figuras Geométricas

Sistema para cálculo de áreas de diferentes figuras geométricas.

## 📌 Conceitos Aplicados

- **Interfaces**: Contrato `FiguraGeometrica`
- **Polimorfismo**: Cálculo específico por figura
- **Encapsulamento**: Proteção dos atributos
- **Validação**: Garantia de valores positivos

## 🏗️ Estrutura do Código

### Classes Principais

| Classe/Interface       | Descrição                                  |
|------------------------|--------------------------------------------|
| `FiguraGeometrica`     | Interface com `calcularArea()`             |
| `Quadrado`             | Cálculo de área (lado × lado)              |
| `Retangulo`            | Cálculo de área (base × altura)            |
| `Circulo`              | Cálculo de área (π × raio²)                |
| `Main`                | Demonstração do sistema                    |

## 💡 Exemplo de Saída

```
Quadrado (lado = 5.0): Área = 25.00
Retangulo (base = 4.0, altura = 6.0): Área = 24.00
Circulo (raio = 3.0): Área = 28.27
```


## 🛠️ Melhorias Futuras

- Adicionar mais figuras (triângulo, trapézio)
- Implementar cálculo de perímetro