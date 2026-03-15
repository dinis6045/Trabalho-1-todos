# Assignment 1 – Hello Mobile World

Course: Mobile Computing  
Student(s): Dinis Lino  
Date: 15 March 2026  
Repository URL: https://github.com/dinis6045/Trabalho-1-todos/tree/main/HelloWorld

---

## 1. Introdução

Este trabalho introduz os fundamentos de Kotlin e do desenvolvimento Android.  
O objetivo é familiarizar os estudantes com o ambiente de desenvolvimento Android e com a linguagem de programação Kotlin.

Nesta tarefa foi criada a primeira aplicação Android chamada **Hello Mobile World** utilizando o Android Studio. O projeto demonstra como as aplicações Android são estruturadas e como as Activities, layouts e recursos interagem numa aplicação móvel.

O trabalho também pretende ajudar os estudantes a compreender o fluxo de desenvolvimento, incluindo compilar, executar e depurar aplicações Android.

---

## 2. Visão Geral do Sistema

A aplicação HelloWorld é uma aplicação móvel Android simples desenvolvida utilizando Kotlin.

Principais funcionalidades:

- Apresentação de texto utilizando **TextView**
- Utilização de recursos Android (**strings.xml**)
- Definição de layout utilizando **XML**
- Apresentação de imagem utilizando **ImageView**
- Componente de calendário utilizando **CalendarView**
- Personalização da interface do utilizador

Caso de utilização:

1. O utilizador inicia a aplicação.
2. A atividade principal é apresentada.
3. A interface mostra texto, uma imagem e um componente de calendário.

---

## 3. Arquitetura e Design

O projeto segue a estrutura padrão de um projeto Android criado no Android Studio.

Componentes principais:

**AndroidManifest.xml**

- Define a configuração da aplicação  
- Declara a atividade principal  
- Especifica metadados da aplicação  

**MainActivity.kt**

- Atividade principal da aplicação  
- Controla o ciclo de vida da aplicação  

**activity_main.xml**

- Define o layout da interface do utilizador  
- Contém elementos de interface como **TextView**, **ImageView** e **CalendarView**

**Pasta res**

- **drawable** → imagens utilizadas na aplicação  
- **layout** → ficheiros XML de layout  
- **mipmap** → ícones da aplicação  
- **values** → strings, temas e cores  

Esta arquitetura separa a lógica da aplicação, os recursos e os componentes da interface.

---

## 4. Implementação

A aplicação foi criada no **Android Studio** utilizando **Kotlin** como linguagem de programação.

Passos implementados:

1. Criação de um novo projeto Android utilizando **Empty Views Activity**
2. Configuração dos parâmetros do projeto
3. Criação da interface do utilizador utilizando layout XML
4. Definição de strings no ficheiro **strings.xml**
5. Implementação dos componentes da interface

Principais componentes utilizados na interface:

- **TextView** – apresenta texto
- **ImageView** – apresenta imagens
- **CalendarView** – mostra um calendário
- **Layout constraints** – controlam o posicionamento dos elementos

A aplicação foi executada num **Android Virtual Device (AVD)**.

---

## 5. Testes e Validação

A aplicação foi testada utilizando o **Android Emulator (Pixel 9 Pro AVD)**.

Testes realizados:

- Inicialização da aplicação
- Renderização da interface
- Carregamento de recursos
- Verificação do layout

A aplicação iniciou corretamente e apresentou todos os elementos esperados na interface.

---

## 6. Instruções de Utilização

Para executar o projeto:

1. Clonar o repositório
2. Abrir o projeto no **Android Studio**
3. Aguardar a sincronização do **Gradle**
4. Selecionar o **Android Virtual Device**
5. Executar a aplicação utilizando o botão **Run**

Requisitos:

- Android Studio  
- Android SDK  
- Android Emulator ou dispositivo Android  

---

# Autonomous Software Engineering Sections

## 7. Estratégia de Prompts

Ferramentas de Inteligência Artificial foram utilizadas para auxiliar na estruturação da documentação e na explicação de conceitos relacionados com desenvolvimento Android.

Os prompts focaram-se em:

- Estruturar o README de acordo com os requisitos do trabalho
- Explicar componentes do Android
- Organizar a documentação do projeto

---

## 8. Workflow com Agentes Autónomos

Ferramentas de IA auxiliaram em várias etapas do desenvolvimento:

- Escrita da documentação
- Explicação de código
- Apoio na resolução de erros

No entanto, o código da aplicação e a configuração do projeto foram desenvolvidos principalmente de forma manual.

---

## 9. Verificação de Artefactos Gerados por IA

Todas as sugestões geradas por IA foram revistas manualmente.

Métodos de verificação utilizados:

- Execução da aplicação Android
- Verificação da configuração do projeto
- Revisão das explicações geradas

---

## 10. Contribuição Humana vs IA

Contribuições humanas:

- Criação da aplicação
- Configuração do Android Studio
- Design da interface
- Testes

Contribuições da IA:

- Apoio na documentação
- Esclarecimento de conceitos
- Estruturação do README

---

## 11. Uso Ético e Responsável

Ferramentas de IA foram utilizadas de forma responsável apenas como apoio.

Todo o conteúdo gerado foi revisto e validado para garantir a correção e compreensão da implementação do projeto.

---

# Development Process

## 12. Controlo de Versões e Histórico de Commits

O projeto foi gerido utilizando **Git** e **GitHub**.

Foram realizados commits durante o desenvolvimento para registar alterações e manter controlo de versões.

---

## 13. Dificuldades e Lições Aprendidas

Principais desafios encontrados:

- Compreender a estrutura de projetos do Android Studio
- Trabalhar com layouts XML
- Configurar Android Virtual Devices

Este trabalho ajudou a desenvolver competências fundamentais no desenvolvimento Android.

---

## 14. Melhorias Futuras

Possíveis melhorias incluem:

- Melhorar o design da interface
- Adicionar botões interativos
- Implementar funcionalidades adicionais do Android

---

## 15. Declaração de Uso de IA (Obrigatório)

Ferramentas de IA utilizadas:

- ChatGPT

A IA foi utilizada para auxiliar na escrita da documentação e na explicação de conceitos.  
Todo o trabalho foi revisto e validado pelo estudante.
