# Assignment 1 – Exercícios Kotlin e Biblioteca Virtual

Course: Mobile Computing  
Student(s): Dinis Lino  
Date: 15 March 2026  
Repository URL: https://github.com/dinis6045/Trabalho-1-todos/tree/main/tp1

---

## 1. Introdução

Este projeto corresponde ao TP1 da disciplina de Computação Móvel.

O objetivo deste trabalho é praticar conceitos fundamentais de programação em Kotlin e programação orientada a objetos. O trabalho inclui três exercícios introdutórios em Kotlin e um exercício maior focado na implementação de um sistema de Biblioteca Virtual.

O trabalho aborda temas como arrays, programação funcional, tratamento de exceções, sequences, classes, objetos, herança, polimorfismo, data classes e companion objects.

---

## 2. Visão Geral do Sistema

Este projeto é composto por quatro partes principais:

1. Exercício 1 – criação e inicialização de arrays com os primeiros 50 quadrados perfeitos utilizando diferentes abordagens em Kotlin.
2. Exercício 2 – desenvolvimento de uma calculadora em consola que suporta operações aritméticas, booleanas e operações de deslocamento de bits.
3. Exercício 3 – modelação da altura de uma bola que salta utilizando sequences em Kotlin.
4. Biblioteca Virtual – implementação de um sistema de gestão de biblioteca utilizando programação orientada a objetos.

O projeto demonstra tanto a utilização procedural como orientada a objetos da linguagem Kotlin.

---

## 3. Arquitetura e Design

O projeto está organizado em vários ficheiros Kotlin e packages, cada um correspondente a um exercício diferente.

Principais partes do design:

- O Exercício 1 utiliza arrays e abordagens funcionais com `map`.
- O Exercício 2 utiliza lógica condicional com `when`, tratamento de exceções e formatação de saída.
- O Exercício 3 utiliza `generateSequence`, filtragem e conversão para listas.
- A Biblioteca Virtual utiliza uma classe base `Book`, subclasses `DigitalBook` e `PhysicalBook`, uma classe gestora `Library` e uma data class `LibraryMember`.

A parte da Biblioteca Virtual segue uma estrutura orientada a objetos com herança e abstração.

---

## 4. Implementação

### Exercício 1

Foi implementado um array de inteiros contendo os primeiros 50 quadrados perfeitos de três formas diferentes:

- utilizando `IntArray`
- utilizando um intervalo com `map()`
- utilizando `Array` com construtor

### Exercício 2

Foi implementada uma calculadora em consola que suporta:

- adição  
- subtração  
- multiplicação  
- divisão  
- operações booleanas AND, OR e NOT  
- deslocamento de bits à esquerda e à direita  

A calculadora utiliza:

- expressões `when`
- tratamento de exceções
- string templates
- formatação de saída

### Exercício 3

Foi implementada uma sequência de alturas de uma bola a saltar utilizando:

- `generateSequence`
- `filter`
- `take`
- conversão para lista

O programa começa a partir de 100 metros, aplica um fator de salto de 60% e imprime os primeiros 15 saltos válidos com altura mínima de 1 metro.

### Biblioteca Virtual

O sistema da Biblioteca Virtual inclui:

- `Book` como classe base
- `DigitalBook` e `PhysicalBook` como subclasses
- `Library` como classe gestora
- `LibraryMember` como data class

O sistema suporta:

- adição de livros
- empréstimo de livros
- devolução de livros
- listagem de livros
- pesquisa por autor

---

## 5. Testes e Validação

O projeto foi testado executando cada exercício de forma independente.

A validação incluiu:

- verificação da correta geração dos arrays no Exercício 1
- teste de todas as operações da calculadora e tratamento de entradas inválidas no Exercício 2
- verificação da sequência de alturas no Exercício 3
- teste da criação de livros, empréstimo, devolução e pesquisa por autor na Biblioteca Virtual

Os resultados obtidos foram comparados com o comportamento esperado descrito no enunciado do trabalho.

---

## 6. Instruções de Utilização

Para executar o projeto:

1. Clonar o repositório  
2. Abrir o projeto no **IntelliJ IDEA** ou **Android Studio**  
3. Executar o ficheiro Kotlin correspondente ao exercício que pretende testar  

Requisitos:

- Kotlin  
- IntelliJ IDEA ou Android Studio  
- JDK instalado e configurado  

---

# Autonomous Software Engineering Sections

## 7. Estratégia de Prompts

Ferramentas de Inteligência Artificial foram utilizadas para auxiliar na estruturação da documentação e no esclarecimento de conceitos da linguagem Kotlin.

Exemplos de utilização incluíram:

- ajuda para organizar o README de acordo com a estrutura pedida no trabalho
- esclarecimento de conceitos de programação orientada a objetos como herança e polimorfismo
- melhoria das descrições das funcionalidades implementadas

---

## 8. Workflow com Agentes Autónomos

Ferramentas de IA contribuíram principalmente para:

- planeamento da documentação
- explicação de sintaxe e conceitos de Kotlin
- organização das secções do relatório

A implementação do código foi realizada maioritariamente de forma manual pelo estudante.

---

## 9. Verificação de Artefactos Gerados por IA

Todos os conteúdos gerados com apoio de IA foram revistos manualmente antes de serem incluídos.

Métodos de verificação incluíram:

- revisão manual do texto e do código
- execução de todos os exercícios
- comparação dos resultados com os requisitos do trabalho
- correção de inconsistências encontradas durante os testes

---

## 10. Contribuição Humana vs IA

Partes desenvolvidas principalmente pelo estudante:

- implementação dos exercícios em Kotlin
- implementação da lógica da Biblioteca Virtual
- testes e execução dos programas

Partes com apoio de IA:

- ajuda na escrita do README
- esclarecimento de conceitos técnicos
- organização da estrutura do relatório

---

## 11. Uso Ético e Responsável

Ferramentas de IA foram utilizadas apenas como ferramentas de apoio para explicação e documentação.

Todo o conteúdo final foi revisto, compreendido e validado pelo estudante. Foi garantido que o trabalho submetido reflete a implementação e compreensão do próprio estudante.

---

# Development Process

## 12. Controlo de Versões e Histórico de Commits

O controlo de versões foi realizado utilizando **Git** e **GitHub**, conforme requerido no trabalho.

O histórico de commits reflete a evolução do projeto ao longo do desenvolvimento, incluindo alterações na implementação e na documentação.

---

## 13. Dificuldades e Lições Aprendidas

Principais dificuldades encontradas:

- escolher as estruturas Kotlin mais adequadas para cada exercício
- tratar exceções e entradas inválidas na calculadora
- compreender a geração de sequences em Kotlin
- desenhar a estrutura orientada a objetos da Biblioteca Virtual

Este trabalho permitiu consolidar os conhecimentos de Kotlin e de programação orientada a objetos.

---

## 14. Melhorias Futuras

Possíveis melhorias incluem:

- adicionar um menu para selecionar os exercícios
- melhorar a calculadora com mais operações
- adicionar persistência em ficheiro para a Biblioteca Virtual
- implementar funcionalidades mais avançadas de pesquisa e gestão de membros

---

## 15. Declaração de Uso de IA (Obrigatório)

Ferramentas de IA utilizadas:

- ChatGPT

A IA foi utilizada para apoio na documentação, esclarecimento de conceitos de Kotlin e organização do relatório. Todo o conteúdo final permanece da responsabilidade do estudante.
