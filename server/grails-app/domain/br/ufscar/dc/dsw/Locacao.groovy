package br.ufscar.dc.dsw


import grails.rest.*

@Resource(uri='/locacoes', readOnly = false, formats = ['json', 'xml'])
class Locacao {
	static constraints = {
		data blank: false
		locadora blank: false
		cliente blank: false
	}

	String data
	Locadora locadora
	Cliente cliente
}
