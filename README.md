# AtividadeDryKissSOLID
 
# 🧠 Lista de Exercícios – Princípios SOLID, DRY e KISS

Este repositório contém a resolução da lista de exercícios da disciplina **Design e Arquitetura de Software** do curso de Engenharia de Software. O objetivo foi aplicar na prática os princípios de **boa engenharia de software**, incluindo **SOLID**, **DRY** e **KISS**.

---

## ✅ Tecnologias Utilizadas

- Java (versão 8+)
- Paradigmas de POO (Programação Orientada a Objetos)

---

## 📚 Exercícios Resolvidos

### 1. (DRY) - Refatoração de Cálculo de Desconto

**Problema**: Métodos distintos repetem a mesma lógica, variando apenas a taxa de desconto.

**Solução**: Refatorei a classe para usar um único método que recebe o valor percentual como parâmetro. Isso elimina duplicação e segue o princípio **DRY** (Don't Repeat Yourself).

```java
public double calcularDesconto(double preco, double percentual) {
    return preco - (preco * percentual);
}
