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
