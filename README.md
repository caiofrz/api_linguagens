
# api_linguagens

Projeto de API REST de linguagens de programação construída em Java com direcionamento da Imersão Java da Alura.


## Stack utilizada

**Back-end:** JAVA 17, Spring, MongoDB e Docker

**Deploy:** Fly.io



## Documentação da API

### Recuperar todas as linguagens

```http
  GET apilinguagens.fly.dev/linguagens
```

### Recuperar uma linguagem

```http
  GET apilinguagens.fly.dev/linguagens/{id}
```
##### Exemplo de retorno
```bash
  {"id":"6435dcc88b5c0e0bb6804768",
  "title":"Java",
  "image":"https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",
  "ranking":1}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

### Cadastrar uma linguagem

```http
  POST apilinguagens.fly.dev/linguagens
```

##### Exemplo de corpo de envio
```bash
  {"title":"Java",
  "image":"https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",
  "ranking":1}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `title`      | `string` | **Obrigatório**. O título da linguagem que você quer cadastrar|
| `image`      | `string` | **Obrigatório**. A url da linguagem que você quer cadastrar. A url pode ser pega através do link nas referências.|
| `ranking`      | `int` | **Obrigatório**. A "posição" no ranking que essa linguagem está.|


### Atualizar e deletar uma linguagem
#### No método PUT o corpo de envio deve ser idêntico ao de cadastro supracitado 
```http
  PUT apilinguagens.fly.dev/linguagens/{id}
```
 #### E para deletar uma linguagem use:

```http
  DELETE apilinguagens.fly.dev/linguagens/{id}
```
| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/caiofrz/api_linguagens.git
```

Entre no diretório do projeto

```bash
  cd api_linguagens
```
Agora basta dar start na aplicação. O seu navegador deve abrir uma aba com a aplicação rodando.

Caso isso não aconteça a app estará rodando na porta *8080* da sua máquina. Acesse o navegador e digite: http://localhost:8080 e pronto.



## Referência

 - [Links](https://awesomeopensource.com/project/elangosundar/awesome-README-templates) utilizado para capturar as imagens


## Feedback

Se você tiver algum feedback, por favor não deixe de dá-lo. 

Me contate através do [github](https://github.com/caiofrz) 
ou [LinkedIn](https://www.linkedin.com/in/caio-ferraz-almeida/) 

## Apêndice

Juntando este projeto com o meu repositório [working_API](https://github.com/caiofrz/working_API), você conseguirá obter stickers para mandar para os amigos devs no whatsapp.
