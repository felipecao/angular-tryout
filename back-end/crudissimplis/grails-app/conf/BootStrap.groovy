import crudissimplis.Pessoa

class BootStrap {

    def init = { servletContext ->
        new Pessoa(nome: "Felipe", endereco: "Laranjeiras").save()
        new Pessoa(nome: "Ellison", endereco: "Campo Grande").save()
    }

    def destroy = {
    }
}
