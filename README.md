# Fundamentos de Java

Este projeto contém exemplos básicos de código Java que demonstram várias operações de data e hora usando o pacote `java.time`. Os exemplos incluem análise de datas, formatação de datas e realização de aritmética de datas.

## Tecnologias Utilizadas

- **Java**: A principal linguagem de programação usada no projeto.
- **Maven**: Uma ferramenta de automação de build usada para gerenciar dependências do projeto e construir o projeto.

## Estrutura do Projeto

O projeto está organizado nos seguintes diretórios e arquivos:

- `.gitignore`: Especifica arquivos e diretórios a serem ignorados pelo Git.
- `src/main/java/org/main/DateOperationsMain.java`: Contém exemplos de operações de data e hora.
- `src/main/java/org/main/DateCalendarFormatTextMain.java`: Contém exemplos de formatação de data e hora.
- `src/main/java/org/main/DateCalendarMain.java`: Contém exemplos adicionais de operações de data e hora.
- `src/main/java/org/fundamental/ContaBancaria.java`: Contém a classe base para contas bancárias.
- `src/main/java/org/fundamental/ContaCorrente.java`: Contém a classe derivada para contas correntes.
- `src/main/java/org/fundamental/Main.java`: Contém o ponto de entrada principal para testar as classes de conta bancária.
- `README.md`: Fornece uma visão geral do projeto.

## Arquivos

### `.gitignore`

Este arquivo especifica arquivos e diretórios que devem ser ignorados pelo Git. Inclui:

- `/target/`: O diretório de destino do Maven.
- `.idea/`: O diretório de configuração do projeto do IntelliJ IDEA.

### `DateOperationsMain.java`

Este arquivo demonstra várias operações de data e hora, como análise de datas, extração de componentes de data e hora e realização de aritmética de datas. Principais operações incluem:

- Análise de strings de data e hora no formato ISO 8601.
- Extração de componentes de dia, mês, ano, hora e minuto.
- Realização de aritmética de datas (adição e subtração de dias).
- Cálculo de durações entre datas.

### `DateCalendarFormatTextMain.java`

Este arquivo demonstra a formatação de datas e horas usando diferentes padrões de `DateTimeFormatter`. Principais operações incluem:

- Análise de strings de data e hora no formato ISO 8601.
- Formatação de datas e horas usando padrões personalizados.
- Uso de formatos de data e hora predefinidos do ISO.

### `DateCalendarMain.java`

Este arquivo contém exemplos adicionais de operações de data e hora, incluindo a análise de formatos de data personalizados e o trabalho com `ZonedDateTime`. Principais operações incluem:

- Análise de formatos de data personalizados.
- Conversão entre diferentes representações de data e hora.
- Trabalho com `ZonedDateTime` e fusos horários.

### `ContaBancaria.java`

Este arquivo contém a classe base `ContaBancaria`, que representa uma conta bancária genérica. Principais operações incluem:

- Depósito de valores.
- Saque de valores com verificação de saldo.

### `ContaCorrente.java`

Este arquivo contém a classe derivada `ContaCorrente`, que estende `ContaBancaria` e adiciona suporte a cheque especial. Principais operações incluem:

- Saque de valores permitindo saldo negativo até o limite do cheque especial.

### `Main.java`

Este arquivo contém o ponto de entrada principal para testar as classes de conta bancária. Demonstra a criação de instâncias de `ContaBancaria` e `ContaCorrente` e a realização de operações de saque.

## Como Executar

1. **Clone o repositório**:
    ```sh
    git clone https://github.com/renansistemas/java-fundamentals.git
    cd java-fundamentals
    ```

2. **Construa o projeto usando Maven**:
    ```sh
    mvn clean install
    ```

3. **Execute os exemplos**:
   - Para executar `DateOperationsMain`:
       ```sh
       mvn exec:java -Dexec.mainClass="org.main.DateOperationsMain"
       ```
   - Para executar `DateCalendarFormatTextMain`:
       ```sh
       mvn exec:java -Dexec.mainClass="org.main.DateCalendarFormatTextMain"
       ```
   - Para executar `DateCalendarMain`:
       ```sh
       mvn exec:java -Dexec.mainClass="org.main.DateCalendarMain"
       ```
   - Para executar `Main`:
       ```sh
       mvn exec:java -Dexec.mainClass="org.fundamental.Main"
       ```

## Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

Autor: Renan