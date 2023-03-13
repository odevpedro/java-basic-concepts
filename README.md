# java-basic-concepts

# Configuração de ambiente e projeto Java

## Ambiente

Para configurar o ambiente necessário para desenvolver em Java, você precisará seguir os seguintes passos:

1. Faça download da JDK (Java Development Kit) mais recente no site oficial da Oracle.
2. Instale a JDK.
3. Configure as variáveis de ambiente JAVA_HOME e PATH.

### Windows

#### JDK

1. Acesse o [site Oracle](https://www.oracle.com/java/technologies/javase-jdk13-downloads.html).
2. Baixe o instalador adequado à sua versão do Windows:
   * 32-bit ou 64-bit: de acordo com a arquitetura do seu sistema operacional.
   * jdk-13.0.2_windows-x64_bin.exe (no momento atual)
3. Aceite os termos do armazenamento e instalação de cookies (caso apareça algum aviso de segurança, clique em Executar mesmo assim).
4. Execute o arquivo baixado e siga as instruções do assistente de configuração.
5. Por padrão, a JDK será instalada em `C:\Arquivos de Programas\Java\jdk{versão}`.

#### Configurando a JAVA_HOME e a PATH

Com a JDK instalada, você precisa informar ao sistema onde ela está localizada por meio das variáveis JAVA_HOME e PATH.

##### Variável JAVA_HOME

A variável JAVA_HOME deve apontar para o diretório raiz da JDK. Siga os seguintes passos:

1. Abra o Painel de Controle.
2. Clique em Sistema e Segurança > Sistema > Configurações avançadas do sistema.
3. Na guia Avançado, clique no botão Variáveis de ambiente.
4. Na seção Variáveis do sistema, clique em Novo...
5. Digite `JAVA_HOME` como nome da variável e `C:\Arquivos de Programas\Java\jdk{versão}` como valor da variável. Lembrando que `{versão}` deve ser alterada pela versão da JDK que foi instalada, por exemplo, `C:\Arquivos de Programas\Java\jdk-13.0.2`.
6. Feche tudo clicando em OK.

##### Variável PATH

A variável PATH deve conter o caminho da pasta bin dos executáveis. Isso permite que você possa rodar programas Java sem ter que digitar todo o caminho do diretório. Para configurá-la, siga os seguintes passos:

1. Abra o Painel de Controle.
2. Clique em Sistema e Segurança > Sistema > Configurações avançadas do sistema.
3. Na guia Avançado, clique no botão Variáveis de ambiente.
4. Na seção Variáveis do sistema, selecione a variável PATH e clique em Editar...
5. Vá até o final do campo "Valor da variável" e insira um ponto e vírgula (`;`), caso não exista, e inclua:
   * `%JAVA_HOME%\bin`
6. Clique em OK até sair da janela de configurações.

## Projeto

Para criar o projeto, basta seguir os seguintes passos:

1. Abra o NetBeans IDE.
2. Selecione Arquivo > Novo Projeto.
3. Selecione Java > Aplicativo Java.
4. Clique em próximo.
5. Escolha


# Java - Conceitos introdutórios

Pode-se dizer, a grosso modo, que cada dispositivo eletrônico possuía seu próprio *software*. E esse foi o problema percebido na época: a incompatibilidade existente entre os diversos *hardwares* e *softwares*.  Reconhecendo o crescente consumo popular por computadores pessoais, a Sun Microsystem, em 1991 financiou um projeto de pesquisa corporativa interno chefiado por James Gosling que resultou na linguagem de programação chamada Java.

### História — Surgimento do Java

Sun Microsystem havia percebido a mudança na demanda por *softwares* que estava ocorrendo no início do da década de noventa. E como o seu sistema operacional, *solaris*, era acompanhado com o *hardware* gratuitamente, eles precisavam encontrar outra saída para vender *software* que era a atual demanda do mercado.

O principal objetivo da linguagem consistia na possibilidade da execução de modo multi-plataforma, o slogan WORA resumia bem esse intento.(Write once, run anywhere) → que em português ficaria como escreva uma vez, execute em qualquer lugar. 

A popularização da linguagem também se deve ao potencial lucrativo fornecido pelo início promissor das primeiras páginas web. A sun viu no Java uma possibilidade de dinamizar a interatividade e animações às páginas web.

**Exemplo do uso atual da linguagem:**

- Desenvolver aplicativos corporativos de grande porte.
- Aprimorar a funcionalidade de servidores da web.
- Fornecer aplicativos para dispositivos voltados ao consumo popular.

A ideia para resolver esse problema era escrever um código executável que fosse passível de ser "entendido" por qualquer dispositivo graças à intervenção de uma máquina virtual que executaria em um dispositivo físico. Essa maquina virtual era a intermediação entre o código executável e o dispositivo físico de destino. Isso lidava com o principal problema da época: a necessidade de reescrever o código para cada dispositivo e/ou cada alteração feita nos dispositivos que já existiam. Mas a ideia foi descontinuada porque custaria muito caro desenvolver um *chip* para ser integrado em cada dispositivo eletrônico.

Devido à explosão da web em meados da década de 90 o mesmo problema de incompatibilidade entre sistemas, foi realocado no contexto dos navegadores e sistemas operacionais. Isso porque, naquela época, cada programa estava quase que atrelado necessariamente a uma plataforma e isso tornava as coisas difíceis no aspecto de portabilidade.

Plataforma Java

- Portável — Fácil de tê-la em diferentes sistemas operacionais e arquitetura
- Fácil — Desenvolvimento
- Segura — Pensada em segurança
- Onipresente — Só fica atrás do Javascript em onipresença

Em seu surgimento a linguagem Java chamou se destacou pelas seguintes características:

- Programação Orientada a Objetos
- A presença de bibliotecas
- Rodar em vários sistemas operacionais.

## Plataformas básicas do Java

**Java Standard Edition** → Contém os recursos necessários para desenvolver aplicativos de desktop e servidor. Antes da versão SE 8, a linguagem suportava três paradigmas da — programação procedural, programação orientada a objetos e programação genérica. O Java SE 8 acrescenta a programação funcional

**Java Enterprise Edition** → É adequado para desenvolver aplicativos em rede distribuída e em grande escala e também aplicativos baseados na web, antigamente os programas em java eram desenvolvidos de modo a terem sua funcionalidade de forma independente, sem a necessidade de comunicação com outros computadores. Essa versão do java é voltada para o contexto da interconexão dos computadores

**Java Micro Edition** → É voltado para o desenvolvimento de aplicativos para dispositivos embarcados com recursos limitados, como smartwatches, MP3 players, decodificadores de TV (set-top boxes), medidores inteligentes (para monitorar o uso de energia elétrica) e muitos outros.

JVM ⇒ Java Virtual Machine

JRE ⇒ Java Runtime Enviroment → apenas executa os programas java 

JVM ⇒ Java Virtual Machine → interpreta os bytecodes gerados

JDK ⇒ Java Development Kit →Compilador, JVM, Bibliotecas

JDK  JRE + Ferramentas De Desenvolvimento | JDK ⇒ JRE + JVM + Bibliotecas

## Fases de Execução Java

Ambiente de desenvolvimento Java

- Editar
- Compilar
- Carregar
- Verificar
- Executar

### Edição

A primeira fase é a edição do arquivo.java que é feita através de qualquer editor. É amplamente recomendado que os desenvolvedores utilizem uma IDE(Ambientes de desenvolvimento integrado) por fornecer depuração e indicações de erros. As IDE's mais usadas para o desenvolvimento em Java

### Compilação

O compilador Java converte o código-fonte Java em bytecodes que representam as tarefas a serem executadas na fase de execução. 

*Lembrando a compilação nada mais é que converter os programas de linguagem de alto nível em linguagem de máquina.* 

Inicialmente o aprofundamento a respeito do funcionamento dos bytecodes podem tornar a aprendizagem confusa, mas para termos uma ideia minimamente prática de como as coisas funcionam devemos considerar que: "As mesmas instruções em bytecodes podem ser executadas em qualquer plataforma contendo uma JVM que entende a versão do Java onde os bytecodes foram compilados" E por plataformas podemos entender dispositivos.

Exemplo: "javac Welcome.java" | javac → compilador java

Java arquivojava.java | executa o java. As IDEs chamam de "run"

### Carregamento

Na Fase 3, a JVM armazena o programa na memória para executá-lo — isso é conhecido como carregamento.

![Java%20-%20Conceitos%20introduto%CC%81rios%20b21426f870364776b596bfc4e4f954b1/Untitled.png](Java%20-%20Conceitos%20introduto%CC%81rios%20b21426f870364776b596bfc4e4f954b1/Untitled.png)

### Verificação

Na Fase 4, enquanto as classes são carregadas, o verificador de bytecode examina seus bytecodes para assegurar que eles são válidos e não violam restrições de segurança do Java. O Java impõe uma forte segurança para certificar-se de que os programas Java que chegam pela rede não danificam os arquivos ou o sistema (como vírus e worms de computador).

![Java%20-%20Conceitos%20introduto%CC%81rios%20b21426f870364776b596bfc4e4f954b1/Untitled%201.png](Java%20-%20Conceitos%20introduto%CC%81rios%20b21426f870364776b596bfc4e4f954b1/Untitled%201.png)

### Execução

As JVMs atuais executam bytecodes utilizando uma combinação de interpretação e a chamada compilação *just in time* ( JIT) traduz os bytecodes para a linguagem de máquina do computador subjacente, portanto, os programas Java realmente passam por duas fases de compilação: uma em que o código-fonte é traduzido em bytecodes (para a portabilidade entre JVMs em diferentes plataformas de computador) e outra em que, durante a execução, os bytecodes são traduzidos em linguagem de máquina para o computador real onde o programa é executado.

![Java%20-%20Conceitos%20introduto%CC%81rios%20b21426f870364776b596bfc4e4f954b1/Untitled%202.png](Java%20-%20Conceitos%20introduto%CC%81rios%20b21426f870364776b596bfc4e4f954b1/Untitled%202.png)

**Plataforma Java é maior que a linguagem java.**

Existem várias linguagens baseadas nessa estrutura e muitas vezes aproveitam a funcionalidade da JVM. O código que criamos é "encapsulado" de modo que seja portável e posteriormente lido e interpretado pela JVM

Código > executável > bytecode > JVM > sistema operacional

## Unidades do java

**Estrutura básica de um programa java:**

- Um par de chaves denota um bloco de código, O bloco de código serve para agrupar sentenças de código.
- Java é uma linguagem de sentenças de códigos terminadas em ponto e virgula.
- Temos a presença de blocos de código representados pelas chaves.
- O main é a "porta de entrada" para seu código, do mesmo modo que um apartamento só tem uma porta de entrada.
- Inicialmente é interessante imaginarmos as classes como arquivos e os pacotes como pastas.

Code:

```java
package fundamentos;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
	}
}

```

## Orientação a objetos

Diversas abordagens, padrões de projeto, arquiteturas etc utilizam a orientação a objetos como base. Por isso é essencial ter um claro conhecimento dos seus princípios. Ao classificar os componentes que dão estruturas ao java inevitavelmente esbarraremos com os conceitos básicos da orientação a objetos. Desta forma a abordagem que será feita aqui acaba colocando java e OO no mesmo pacote. Entretanto, é importante termos em mente que a orientação a objetos é um paradigma de programação e não uma característica exclusiva do java.

**QUAL O OBJETIVO DA ORIENTAÇÃO A OBJETOS**

O jargão repetido nos cursos e nos livos continua válido e resume bem a finalidade deste paradigma de programação: *“Buscar o baixo acoplamento e a alta coesão entre os objetos.”*

**Acoplamento**: Dependência direta entre um objeto e outro. Quando um objeto muda, o outro mudo por consequência.

**Coesão**: Objeto executando uma única responsabilidade e livres de dependências diretas com outro.

As principais características da orientação a objetos são:

-  Estado comportamento
-  Herança
-  Encapsulamento
-  Abstração Polimorfismo.

C*ada item citado será futuramente abordado.*

### Começamos do início: o que é de fato um objeto?

**Objeto**: É uma estrutura de código cuja função é trazer uma abstração de um objeto ou ideia do mundo real. Do ponto de vista prático essa abstração apenas considerará as características e comportamentos mais relevantes do objeto para um determinado proposito. Neste contexto as características de um objeto são chamadas **atributos** e os seus comportamentos são de **métodos**. Um carro, por exemplo, é um objeto do mundo real e pode ser representado abstratamente, considerando apenas as suas principais características e comportamentos. Da mesma forma que os componentes de um carro precisam trocar mensagens para dar suporte ao funcionamento adequado do veículo: os objetos acabam trocando informações entre si.

*Isolamos componentes de código que executam uma particularidade funcional dentro do nosso projeto. Então esse pequeno bloco de solução, apesar de poder trocar informações com os outros blocos, não altera o funcionamento de outro objeto pré-existente.*

**Classe**: É o nome dado para a estrutura de informação que armazena o mapeamento dessa abstração do mundo real. É na classe que modelamos ou mapeamos o nosso objeto e através dela o instanciamos(alocamos o objeto na memória do computador). Ou seja, toda essa representação e modelagem é efetuada na classe. É importante termos claro em mente a diferença entre classe e objetos. As classes são equivalentes à planta de uma casa.  Os objetos são seriam a efetivação de uma casa construída tomando os moldes da planta.

![Untitled](Java%20-%20Conceitos%20introduto%CC%81rios%20b21426f870364776b596bfc4e4f954b1/Untitled%203.png)

## Versionamento da jdk e do gerenciador de pacotes.

```java
sudo update-alternatives --config java
//Procurando todas as versões do java no terminal
```

![Untitled](Java%20-%20Conceitos%20introduto%CC%81rios%20b21426f870364776b596bfc4e4f954b1/Untitled%204.png)

Conversando com os motoristas do uber eu rec
