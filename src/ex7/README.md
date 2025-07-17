# Sistema de Envio de Mensagens de Marketing

Implementação de um sistema para envio de mensagens de marketing através de diferentes canais de comunicação.

## 📌 Conceitos Aplicados

- **Interfaces**: Definição de contratos comuns
- **Polimorfismo**: Tratamento uniforme de diferentes serviços
- **Expressões Lambda**: Implementação concisa de serviços

## 🏗️ Estrutura do Código

### Classes Principais

| Classe/Interface       | Descrição                                  |
|------------------------|--------------------------------------------|
| `ServicoMensagem`      | Interface com método `enviarMensagem()`    |
| `ServicoEmail`         | Implementação para envio por e-mail        |
| `ServicoSMS`          | Implementação para envio por SMS           |
| `ServicoRedesSociais` | Implementação para redes sociais           |
| `ServicoWhatsApp`     | Implementação para WhatsApp                |
| `Main`                | Classe principal com exemplos de uso       |

## 💡 Exemplo de Saída

```
Enviando mensagem por E-mail: Promoção de verão!
Enviando mensagem por SMS: Promoção de verão!
Enviando mensagem por Redes Sociais: Promoção de verão!
Enviando mensagem por WhatsApp: Promoção de verão!
```


## 🛠️ Melhorias Futuras

- Adicionar sistema de prioridade
- Implementar fila de mensagens
- Adicionar confirmação de entrega