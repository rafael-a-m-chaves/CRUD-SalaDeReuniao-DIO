# **Sala de Reunião**
_________________________________________________________
### API Rest para gerenciar reservas de sala de reuniao
### O projeto foi realizado para a conclusão do BootCamp Santander Full Stack ministrado pela DIO

___


A API se baseia no framework Spring com o maven gerenciando dependencias
e utiliza o banco de dados em Memoria H2.


**As dependencias utilizadas neste projeto foram:**

JPA: Usada para persistencia de dados.

STARTER WEB: Usada para auxiliar a construçao de uma aplicação web

LOMBOK: Para servir anotations aomentando a produtividade e legibilidade do codigo

JARKATA VALIDATION: para fazer validaçoes de dados recebidos pelos metodos http

**Versões**

**JAVA 16**

**Maven 4.0.0**

**Spring Boot  2.5.4**

**JPA 2.1**

**H2 Database 1.4.200**

**Jarkata Validation 3.0.0**

**Lombok 1.18.20**

___

**Configuração basicas da API**

A Api esta configurada para rodar localmente pelo endereço 
http://localhost

utilizando a porta 8082

esta Habilitado o Console do Banco de dados podendo ser acessado apartir de: http://localhost:8082/h2-console

informando usuario e senha que estão configurados no arquivo application.properties

---
**Classes da API**

A API está Dividida em 4 pacotes mais a classe de inicialização 

A Base da API é o pacote Model que contem a classe ROOM que é responsavel por persistir toda rega de negocios.

O Pacote Repository contem a Classe RoomRepository que Torna o acesso aos dados mais facil manipulando a classe Model 
ROOM, trazendo funcionalidade como salvar, excluir e metodos para pesquisa.

O Pacote Controller contem a classe RoomController que é respontavel por fazer todo o controle rest de requisições 
feitas para o endereço http://localhost:8082/api/v1/  alem de fazer a instegraçao com API Front End.
Nesta Classe todos os metodos http que a API lida nela estão listados

O Pacote exception contem três Classes para lidar com os erros dos metodos http da classe controler tornando mais 
amigavel caso algum erro aconteça durante as requisições.

---

Ficou Com Alguma duvida ou tem sugestão de melhorias me chame no Linkedin:

https://linkedin.com/in/rafael-chaves-b5a515213/

Meu perfil na Digital Innovation One:

https://web.digitalinnovation.one/users/rafaelaugustochaves?tab=achievements

