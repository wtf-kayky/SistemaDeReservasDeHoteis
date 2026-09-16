# 🏨 Sistema de Reserva em Java

Projeto desenvolvido em **Java** com o objetivo de praticar conceitos de **Programação Orientada a Objetos (POO)**, gerenciamento de estados e tratamento de exceções.

## 📌 Sobre o projeto

O sistema simula um sistema simples de reservas de hotel.

É possível cadastrar um hóspede, criar diferentes tipos de quartos, realizar uma reserva, calcular o valor da hospedagem, cancelar uma reserva e reativá-la.

O projeto também possui validações para impedir operações inválidas, utilizando `throw` e `try/catch`.

## 🧠 Conceitos praticados

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Herança
* Abstração
* Polimorfismo
* Construtores
* Getters e Setters
* Associação entre objetos
* Controle de estado dos objetos
* `throw`
* `try/catch`
* Tratamento de `RuntimeException`
* Sobrescrita de métodos (`@Override`)

## 🏗️ Estrutura do projeto

```text
SistemaDeReserva/
│
├── Quarto.java
├── QuartoSimples.java
├── QuartoDeLuxo.java
├── Hospede.java
├── Reserva.java
└── Porteiro.java
```

### `Quarto`

Classe abstrata responsável pelas características e comportamentos comuns dos quartos.

Controla informações como:

* Número do quarto
* Preço por noite
* Estado de ocupação
* Reserva e cancelamento
* Cálculo do valor da hospedagem

### `QuartoSimples`

Representa um quarto simples e implementa seu próprio cálculo de valor.

### `QuartoDeLuxo`

Representa um quarto de luxo e possui uma taxa de serviço adicional.

### `Hospede`

Representa o hóspede responsável pela reserva, contendo informações como nome e idade.

### `Reserva`

Responsável por controlar uma reserva e suas informações.

Possui funcionalidades para:

* Criar uma reserva
* Calcular o valor da reserva
* Cancelar uma reserva
* Reativar uma reserva
* Verificar se a reserva está ativa

### `Porteiro`

Classe utilizada como ponto de entrada do programa (`main`) para realizar os testes do sistema e tratar exceções através de `try/catch`.

## 🔄 Funcionamento

O fluxo principal do sistema é:

```text
Hóspede
   ↓
Escolhe um quarto
   ↓
Cria uma Reserva
   ↓
Verifica disponibilidade
   ↓
Quarto é reservado
   ↓
Calcula o valor da hospedagem
   ↓
Pode cancelar a reserva
   ↓
Quarto fica disponível novamente
   ↓
Reserva pode ser reativada
```

## ⚠️ Tratamento de erros

O sistema possui validações para situações como:

* Quantidade de noites menor ou igual a zero
* Tentativa de reservar um quarto já ocupado
* Tentativa de cancelar uma reserva já cancelada
* Tentativa de reativar uma reserva que já está ativa
* Tentativa de reativar uma reserva enquanto o quarto está ocupado

Os erros são lançados nas classes responsáveis pela regra de negócio e tratados no ponto de execução através de `try/catch`.

## 💡 Objetivo

Este projeto faz parte da minha prática de **Java e Programação Orientada a Objetos**, buscando desenvolver minha capacidade de transformar regras de negócio em código e melhorar minha lógica de programação.

## 🛠️ Tecnologias

* **Java**
* **IntelliJ IDEA** (IDE utilizada durante o desenvolvimento)
* **Git**
* **GitHub**

## 🚀 Próximos passos

Algumas melhorias que podem ser adicionadas futuramente:

* Sistema de check-in e check-out
* Histórico de reservas
* Diferentes tipos de serviços do hotel
* Sistema de pagamento
* Identificação única para reservas
* Exceções personalizadas
* Interface de usuário
* Persistência de dados

---

📚 **Projeto desenvolvido para fins de estudo e prática de Java/POO.**
