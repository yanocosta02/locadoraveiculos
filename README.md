# Projeto: Sistema de Locadora de Veículos

## Disciplina: Design de Software

## Faculdade: Universidade Federal do Paraná (UFPR)

## Professora: Silvia Regina Virgilio

## Descrição

Este sistema automatiza o processo de aluguel de automóveis e bicicletas, permitindo a pesquisa de itens disponíveis, controle de aluguéis e devoluções, cálculo de multas, e a opção de contratar seguros para automóveis. A interface foi construída utilizando `JFrame` para permitir uma interação amigável e intuitiva com o usuário.

### Funcionalidades Principais

- **Cadastro e Pesquisa de Itens:** O sistema armazena informações sobre os itens (automóveis e bicicletas), como cor, categoria, marca, modelo, combustível, ano de fabricação, placa e preço por dia. Permite a pesquisa dos itens por categoria, marca/modelo e preço.
  
- **Aluguel e Devolução:** O sistema controla os aluguéis e devoluções de itens, registrando o usuário associado ao item e verificando a disponibilidade. O sistema também calcula as multas por atraso na devolução.

- **Seguro para Automóveis:** Para os veículos automotores, é possível contratar um seguro, com informações sobre a seguradora e o valor cobrado.

- **Controle de Pagamentos:** O sistema controla os pagamentos efetuados pelos usuários e as multas associadas aos atrasos.

## Tecnologias Utilizadas

- **Java**: Linguagem principal para a implementação.
- **JFrame**: Biblioteca gráfica para a construção da interface.
- **Orientação a Objetos**: Aplicação dos princípios da OOP para garantir organização e reutilização do código.

## Estrutura do Projeto

O projeto é dividido em três partes principais:

### Parte I - Diagramas

- **Diagrama de Casos de Uso**: Descrição das funcionalidades do sistema e as interações com o usuário e o sistema.
- **Diagrama de Classes (Visão Conceitual)**: Apresenta as classes do sistema com seus atributos e métodos principais.
- **Diagrama de Sequências**: Para cada caso de uso, mostrando a interação entre os objetos durante a execução do processo.

### Parte II - Projeto

- **Diagrama de Classes (Visão de Projeto)**: Refere-se à estrutura do código com a definição dos atributos, métodos, tipos de retorno, parâmetros, e a relação de visibilidade entre as classes.
- **Diagrama de Sequências**: Demonstrando a aplicação dos padrões GRASP, controladores, e separação da camada de interface e do domínio.

### Parte III - Implementação

A implementação é realizada em Java, com a interface gráfica utilizando `JFrame`. O sistema mantém todos os dados em memória durante a execução, sem persistência em banco de dados. O código foi estruturado para garantir a manutenção de boa organização, com foco na separação de responsabilidades e princípios de OOP.

## Funcionalidades Implementadas

1. **Cadastro de Itens**: Cadastro de veículos (automóveis e bicicletas) com suas propriedades (cor, categoria, preço, etc).
2. **Pesquisa de Itens**: Permite que o usuário busque por itens com base em critérios como categoria, marca, modelo e preço.
3. **Aluguel e Devolução**: O sistema permite o aluguel de itens e o processo de devolução, com cálculo de multas em caso de atraso.
4. **Seguro para Automóveis**: Sistema de contratação de seguro para automóveis com dados sobre a seguradora e o valor do seguro.
5. **Controle de Pagamentos**: Controle sobre o pagamento de aluguéis e multas.

## Como Executar

### Pré-requisitos

1. JDK 11 ou superior instalado.
2. IDE de sua escolha (como IntelliJ IDEA, Eclipse ou NetBeans).
3. Bibliotecas gráficas (JFrame) já integradas ao seu projeto Java.

### Passos para Execução

1. Clone o repositório ou baixe o código-fonte.
2. Abra o projeto em sua IDE preferida.
3. Compile e execute a classe principal que inicializa a interface gráfica.
4. Utilize o menu da interface para navegar pelas funcionalidades do sistema.

### Exemplo de Uso

Ao iniciar o sistema, a interface gráfica permitirá que o usuário:
- **Cadastre novos itens** (automóveis e bicicletas).
- **Pesquise itens disponíveis**.
- **Alugue ou devolva itens**.
- **Contrate um seguro para automóveis**.
- **Efetue o pagamento do aluguel e multas**.
- 
## Considerações Finais

Este projeto tem como objetivo fornecer uma solução eficiente para locadoras de veículos, com uma interface gráfica simples e intuitiva. A utilização de orientação a objetos garante um sistema modular, fácil de manter e expandir no futuro. A parte de implementação foi realizada em Java, utilizando boas práticas de programação e separação de responsabilidades.
