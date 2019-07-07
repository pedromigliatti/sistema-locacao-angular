package br.ufscar.dc.dsw


import grails.rest.*

@Resource(uri='/clientes', readOnly = false, formats = ['json', 'xml'])
class Cliente {
	static constraints={
		nome blank:false
		cpf blank:false
		email blank:false
	}
	
	String nome
	String cpf
	String email
}
