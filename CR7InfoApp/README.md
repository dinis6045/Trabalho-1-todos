# Assignment X – CR7InfoApp

Course: Mobile Computing  
Student(s): Dinis Lino  
Date: 15 de Março 2025  
Repository URL: https://github.com/dinis6045/Trabalho-1-todos/tree/main/CR7InfoApp

---

# CR7InfoApp

CR7InfoApp é uma aplicação Android simples desenvolvida utilizando **Kotlin** e **Android Studio**.

O objetivo deste projeto é demonstrar conceitos básicos de desenvolvimento Android através de uma pequena aplicação que apresenta informação sobre o jogador de futebol **Cristiano Ronaldo**.

O projeto foca-se em:

- fundamentos de programação em Kotlin  
- utilização de Activities  
- criação de layouts com XML  
- navegação entre ecrãs  
- interação com o utilizador  

---

# 1. Introdução

Este trabalho tem como objetivo introduzir o desenvolvimento de aplicações móveis Android utilizando Kotlin.

O principal objetivo do projeto foi criar uma pequena aplicação capaz de apresentar informações sobre Cristiano Ronaldo através de uma interface simples com navegação entre diferentes ecrãs.

Através deste projeto foi possível aplicar conceitos fundamentais do Android, tais como:

- Activities  
- Layouts  
- Intents  
- Tratamento de eventos  
- Design da interface do utilizador  

A aplicação demonstra como uma interface móvel básica pode ser construída e como os utilizadores podem navegar entre diferentes ecrãs.

---

# 2. Visão Geral do Sistema

CR7InfoApp é composta por dois ecrãs principais.

Principais funcionalidades da aplicação:

- um ecrã principal que apresenta a aplicação  
- navegação para um ecrã de detalhe  
- apresentação de informações sobre o jogador  
- interface simples com botões e texto  
- navegação de retorno  

## Exemplo de Caso de Utilização

1. O utilizador inicia a aplicação  
2. O ecrã principal aparece  
3. O utilizador pressiona o botão **Details**  
4. A aplicação abre o ecrã de detalhes  
5. O utilizador lê informações adicionais  
6. O utilizador regressa ao ecrã principal  

---

# 3. Arquitetura e Design

A aplicação segue a estrutura padrão de um projeto Android no **Android Studio**.

## Estrutura do Projeto

```
CR7InfoApp
│
├── app
│   ├── java
│   │   └── org.example.cr7infoapp
│   │        ├── MainActivity.kt
│   │        └── DetailActivity.kt
│   │
│   ├── res
│   │   ├── layout
│   │   │    ├── activity_main.xml
│   │   │    └── activity_detail.xml
│   │   │
│   │   ├── drawable
│   │   │    └── imagens e ícones
│   │   │
│   │   └── values
│   │        ├── strings.xml
│   │        ├── colors.xml
│   │        └── themes.xml
│   │
│   └── AndroidManifest.xml
│
└── build.gradle
```

## Visão Geral da Arquitetura

A aplicação utiliza uma **arquitetura baseada em Activities**.

### MainActivity.kt

Responsável por:

- carregar o ecrã principal  
- gerir a interação do utilizador  
- abrir o segundo ecrã  

### DetailActivity.kt

Responsável por:

- apresentar informação adicional  
- permitir que o utilizador regresse ao ecrã anterior  

A navegação entre ecrãs é realizada utilizando **Android Intents**.

Exemplo:

```kotlin
val intent = Intent(this, DetailActivity::class.java)
startActivity(intent)
```

---

# 4. Implementação

A aplicação foi implementada utilizando:

- Kotlin  
- Android Studio  
- Android SDK  
- layouts em XML  

Principais funcionalidades implementadas:

- eventos de clique em botões  
- navegação entre Activities  
- configuração de layouts  
- elementos de interface como TextView e Button  

Exemplo de código utilizado:

```kotlin
val detailsButton = findViewById<Button>(R.id.btnDetails)

detailsButton.setOnClickListener {
    val intent = Intent(this, DetailActivity::class.java)
    startActivity(intent)
}
```

---

# 5. Testes e Validação

A aplicação foi testada utilizando o **Android Emulator** do Android Studio.

Testes realizados:

- verificação do arranque da aplicação  
- verificação da apresentação do layout  
- navegação entre activities  
- validação da interação com botões  

A aplicação executou corretamente durante todos os testes realizados.

---

# 6. Instruções de Utilização

Para executar o projeto:

1. Clonar o repositório

```
git clone https://github.com/dinis6045/CR7-Info-App
```

2. Abrir o projeto no **Android Studio**

3. Aguardar a sincronização do **Gradle**

4. Executar a aplicação utilizando:

- Android Emulator  
ou  
- dispositivo Android físico  

### Requisitos

- Android Studio  
- Android SDK  
- suporte para Kotlin  
- Android Emulator ou dispositivo Android  

---

# Screenshots

![Main Screen](main_screen.png)

![Detail Screen](detail_screen.png)

---

# Autonomous Software Engineering Sections

## 7. Estratégia de Prompts

Ferramentas de Inteligência Artificial foram utilizadas para auxiliar em:

- compreensão de funcionalidades do Android Studio  
- depuração de código Kotlin  
- estruturação da documentação  
- explicação de conceitos Android  

---

## 8. Workflow com Agentes Autónomos

Ferramentas de IA foram utilizadas em várias fases do desenvolvimento:

- planeamento do projeto  
- apoio na escrita de código Kotlin  
- depuração de erros  
- organização da documentação  

---

## 9. Verificação de Artefactos Gerados por IA

Todas as sugestões geradas por IA foram verificadas antes de serem utilizadas.

Métodos de verificação:

- revisão manual do código  
- execução da aplicação  
- testes no emulador  

---

## 10. Contribuição Humana vs IA

### Contribuições Humanas

- criação do projeto Android  
- implementação das Activities  
- design dos layouts  
- testes da aplicação  

### Contribuições da IA

- apoio na depuração  
- explicação de conceitos Android  
- ajuda na estruturação da documentação  

---

## 11. Uso Ético e Responsável

Ferramentas de IA foram utilizadas apenas como **ferramentas de apoio**.

Todos os resultados gerados foram revistos antes de serem incluídos no projeto final.

---

# Development Process

## 12. Controlo de Versões e Histórico de Commits

O controlo de versões foi realizado utilizando **Git** e **GitHub**.

Foram realizados vários commits durante o desenvolvimento para registar a evolução do projeto.

---

## 13. Dificuldades e Lições Aprendidas

Principais desafios encontrados:

- compreender a estrutura de projetos Android  
- trabalhar com Activities  
- gerir navegação entre ecrãs  
- resolver erros em Kotlin  

Este trabalho permitiu adquirir experiência prática no desenvolvimento Android.

---

## 14. Melhorias Futuras

Possíveis melhorias incluem:

- adicionar mais informações sobre o jogador  
- melhorar o design da interface  
- adicionar conteúdos multimédia  
- implementar novos ecrãs  
- melhorar a experiência do utilizador  

---

## 15. Declaração de Uso de IA (Obrigatório)

Ferramentas de IA utilizadas:

- ChatGPT

A IA foi utilizada para apoio na depuração, explicação de conceitos de programação e estruturação da documentação.

Todo o conteúdo final foi revisto e validado pelo estudante.

* Debugging assistance
* Programming explanations
* Documentation structure

All generated outputs were reviewed and validated before being included in the final project.
