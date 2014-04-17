package crudissimplis

import grails.rest.*

@Resource(uri='/pessoas', formats=['json'])
class Pessoa {

    String nome
    String endereco

    static constraints = {
        nome(blank: false)
        endereco(blank: false)
    }
}
