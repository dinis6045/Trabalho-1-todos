# Assignment 1 – HelloWorld Optional (Aplicação de Informação do Sistema)

Course: Mobile Computing  
Student(s): Dinis Lino  
Date: 15 March 2026  
Repository URL: https://github.com/dinis6045/Trabalho-1-todos/tree/main/helloworldOptional

---

## 1. Introdução

Este projeto corresponde à versão opcional da aplicação HelloWorld desenvolvida no âmbito da unidade curricular de Computação Móvel.

O objetivo da aplicação é apresentar informação sobre o dispositivo Android onde a aplicação está a ser executada, utilizando propriedades do sistema disponibilizadas pela plataforma Android.

A aplicação foi desenvolvida em **Kotlin** utilizando **Android Studio**.

---

## 2. Visão Geral do Sistema

A aplicação apresenta no ecrã várias informações do sistema Android.

Entre os dados apresentados encontram-se:

- Fabricante do dispositivo
- Modelo do dispositivo
- Marca
- Tipo de build
- Utilizador do sistema
- Versão do Android
- SDK utilizado
- Informações adicionais da build

Quando a aplicação é executada, estas informações são automaticamente recolhidas do sistema e apresentadas no ecrã através de um **TextView**.

---

## 3. Arquitetura e Design

A aplicação segue a estrutura padrão de um projeto Android.

Principais componentes:

### AndroidManifest.xml
Define a configuração da aplicação e a atividade principal.

### MainActivity.kt
Responsável por recolher a informação do sistema Android e apresentá-la no ecrã.

### activity_main.xml
Layout da interface onde a informação é apresentada.

### Recursos
- **layout** → definição da interface
- **values** → strings e configurações da aplicação

A recolha da informação do sistema é feita através da classe:


android.os.Build


---

## 4. Implementação

A implementação foi realizada utilizando:

- Kotlin
- Android Studio
- Android SDK

Passos principais da implementação:

1. Criação do projeto Android
2. Criação de um layout simples com um **TextView**
3. Utilização da classe `Build` para recolher informações do sistema
4. Apresentação dessas informações no ecrã

Exemplos de propriedades utilizadas:

- `Build.MANUFACTURER`
- `Build.MODEL`
- `Build.BRAND`
- `Build.VERSION.RELEASE`
- `Build.VERSION.SDK_INT`

---

## 5. Testes e Validação

A aplicação foi testada utilizando o **Android Emulator**.

Foram verificados os seguintes aspetos:

- Execução correta da aplicação
- Recolha das propriedades do sistema
- Apresentação correta da informação no ecrã

Os testes confirmaram que a aplicação apresenta corretamente os dados do dispositivo.

---

## 6. Instruções de Utilização

Para executar a aplicação:

1. Clonar o repositório
2. Abrir o projeto no **Android Studio**
3. Aguardar pela sincronização do **Gradle**
4. Iniciar o **Android Emulator**
5. Executar a aplicação

Requisitos:

- Android Studio
- Android SDK
- Emulador Android ou dispositivo físico

---

# Secções de Engenharia de Software Autónoma

## 7. Estratégia de Prompts

Ferramentas de IA foram utilizadas para auxiliar na organização da documentação e explicação de conceitos relacionados com Android.

Os prompts foram utilizados principalmente para estruturar o relatório e clarificar conceitos técnicos.

---

## 8. Workflow com Ferramentas de IA

As ferramentas de IA foram utilizadas para:

- apoio na documentação
- explicação de APIs do Android
- apoio na resolução de problemas

A implementação da aplicação foi realizada manualmente.

---

## 9. Verificação de Artefactos Gerados por IA

Todo o conteúdo gerado com apoio de IA foi revisto manualmente.

A verificação incluiu:

- revisão do código
- execução da aplicação
- validação dos resultados apresentados

---

## 10. Contribuição Humana vs IA

Contribuição humana:

- desenvolvimento da aplicação
- implementação do código
- testes e validação

Contribuição da IA:

- apoio na estruturação da documentação
- explicação de conceitos técnicos

---

## 11. Uso Ético e Responsável

Ferramentas de IA foram utilizadas apenas como suporte ao desenvolvimento.

Todo o conteúdo produzido foi revisto e validado antes da entrega.

---

# Processo de Desenvolvimento

## 12. Controlo de Versões e Histórico de Commits

O projeto foi gerido utilizando **Git** e **GitHub**.

Os commits registam a evolução do projeto ao longo do desenvolvimento.

---

## 13. Dificuldades e Lições Aprendidas

Principais desafios:

- compreender como aceder às propriedades do sistema Android
- trabalhar com APIs da plataforma
- apresentar a informação de forma clara no interface

Este projeto permitiu consolidar conhecimentos básicos de desenvolvimento Android.

---

## 14. Melhorias Futuras

Possíveis melhorias incluem:

- apresentar mais propriedades do dispositivo
- melhorar o design da interface
- organizar a informação em secções

---

## 15. Declaração de Uso de IA (Obrigatório)

Ferramentas de IA utilizadas:

- ChatGPT

A IA foi utilizada para apoio na documentação e explicação de conceitos.  
Todo o conteúdo foi revisto e validado pelo estudante.
