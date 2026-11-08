# Calculadora de Impostos em Java 🧾
 ## Status do Projeto : 🟡 Em desenvolvimento
Sistema simples em linha de comando (CLI) que simula o cálculo de impostos com base no salário mensal e na região do usuário.

## 📋 Descrição

Este projeto permite que o usuário informe:
- Seu nome
- Seu salário mensal
- A região em que mora (Norte, Sul, Leste ou Oeste)

A partir desses dados, o sistema calcula o salário anual e aplica a alíquota de imposto correspondente à região escolhida, exibindo o valor final a ser pago.

## ⚙️ Como funciona

1. O usuário informa seu **nome** e **salário mensal**.
2. O sistema calcula automaticamente o **salário anual** (salário mensal × 12).
3. O usuário escolhe a **região**:
   - Norte
   - Sul
   - Leste
   - Oeste
4. Com base na região, o sistema aplica a alíquota de imposto correspondente.
5. Ao final, é exibido o valor do imposto a ser pago.

## 🚀 Como executar

```bash
# Compile o projeto
javac *.java

# Execute o programa
java Main
