# Sistema de Cálculo de Tributos de Produtos

Sistema para cálculo automático de tributos sobre diferentes categorias de produtos.

## 📌 Conceitos Aplicados

- **Interfaces**: Contrato `Tributavel`
- **Classes Abstratas**: Classe base `Produto`
- **Polimorfismo**: Cálculo específico por categoria
- **Herança**: Especialização por tipo de produto

## 🏗️ Estrutura do Código

### Classes Principais

| Classe/Interface       | Descrição                                  |
|------------------------|--------------------------------------------|
| `Tributavel`           | Interface com `calcularTributo()`          |
| `Produto`              | Classe abstrata base                      |
| `ProdutoAlimentacao`   | Produtos de alimentação (1%)               |
| `ProdutoSaude`         | Produtos de saúde (1.5%)                   |
| `ProdutoVestuario`     | Produtos de vestuário (2.5%)               |
| `ProdutoCultura`       | Produtos culturais (4%)                    |
| `Main`                | Demonstração do sistema                    |

## 💡 Exemplo de Saída

```
Alimentacao: Valor = R$100.00 | Tributo = R$1.00
Saude: Valor = R$200.00 | Tributo = R$3.00
Vestuario: Valor = R$150.00 | Tributo = R$3.75
Cultura: Valor = R$80.00 | Tributo = R$3.20

Total de tributos: R$10.95
```


## 🛠️ Melhorias Futuras

- Adicionar sistema de isenções fiscais
- Implementar cálculo de tributos compostos
- Integrar com banco de dados de produtos