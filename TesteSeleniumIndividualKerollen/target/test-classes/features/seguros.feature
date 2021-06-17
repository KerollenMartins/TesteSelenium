# language: pt
# encoding: utf-8

  Funcionalidade: Cotacao de seguro de automovel
 
 
  Cenário: Cotacao de Seguro
  Dado que eu tenho acesso ao site
  E preencho o formulario1 
  E clico no botao next
  Então a aba do formulario2 devera ser carregada
  
  Dado que eu estou na aba do formulario2
  E preencho todos os campos necessarios do formulario2
  E clico no botao next1
  Entao a aba do formulario3 devera ser carregada
  
 	Dado que eu estou na aba do formulario3
 	E preencho todos os campos necessarios do formulario3
 	E clico no botao next2
 	Entao a aba da tabela de categorias devera ser carregada
 	
 	Dado que eu estou na aba da tabela tabela de categorias
 	E seleciono a opcao gold
 	E clico no botao next3
	Entao a aba do formlario4 devera ser exibida
	
	Dado que eu estou na aba do formulario4
	E preencho todos os campos necessarios do formulario4
	E clico no botao send
	Entao a mensagem de confirmacao referente ao envio de email devera ser exibida "Sending e-mail success!"
 	