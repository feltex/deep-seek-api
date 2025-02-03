### Deep Seek API - Integração com Java e Spring Boot

Bem-vindo ao Deep Seek API, um tutorial prático para iniciantes que ensina como integrar o Java com a nova IA Deep Seek! 🚀

## 📌 Sobre o Projeto

Este repositório contém um exemplo funcional de como utilizar a API da Deep Seek com Java 21 e Spring Boot 3. Durante o tutorial, você aprenderá a:

✅ Criar um controller para receber parâmetros e submeter prompts à IA da Deep Seek.

✅ Configurar corretamente a API Key.

✅ Fazer chamadas para a API usando Postman.

✅ Explorar conceitos fundamentais sobre a Deep Seek e sua integração com aplicações Java.


## 🎥 Vídeo Tutorial

Assista ao tutorial completo no YouTube: Clique aqui (Adicione o link do vídeo aqui)

🚀 Tecnologias Utilizadas

- Java 21

- Spring Boot 3

- Maven

- Postman

## 📂 Como Executar o Projeto

Clone este repositório:

```shell
git clone https://github.com/feltex/deep-seek-api.git
```

Acesse a pasta do projeto:

cd deep-seek-api

Configure sua API Key da Deep Seek no application.properties:

deepseek.api.key=SUA_CHAVE_AQUI

Compile e execute o projeto com Maven:

mvn spring-boot:run

## 🔥 Testando a API com Postman

Abra o Postman.

Crie uma nova requisição POST para:

http://localhost:8080/?query=Qual o maior paiz do mundo?

No corpo da requisição (JSON), envie algo como:

{
"prompt": "Explique o conceito de Inteligência Artificial"
}

Clique em Send e veja a resposta gerada pela Deep Seek! 🎯

## 📖 Saiba Mais

Para mais detalhes sobre a API da Deep Seek, consulte a documentação oficial. (https://api-docs.deepseek.com/)

Contribuições são bem-vindas! Se tiver dúvidas ou sugestões, abra uma issue ou um pull request. 🤝

