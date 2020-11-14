# usa image do node no alpine como base para o nosso container
FROM node:alpine

# executa comando para instalar o json-server
RUN npm i -g json-server

# seta o diretorio da raiz /json-server-app como diretorio de trabalho
WORKDIR /json-server-app/

# expõe a porta 3000, ou seja, deixe a porta "aberta" do container para aplicações externas
EXPOSE 3000

# comando de entrada do container, no caso ele vai executar o json-server em cima do nosso arquivo de dados
CMD json-server --watch --host 0.0.0.0 dados.json

