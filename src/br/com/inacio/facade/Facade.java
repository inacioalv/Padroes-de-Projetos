package br.com.inacio.facade;

import br.com.inacio.subsistema1.crm.CrmService;
import br.com.inacio.subsistema2.cep.CepApi;

public class Facade {

    public  void migrarCliente(String nome,String cep){
        //Para o metodo gravarCliente ter os quatros
        // parâmetros teremos que utilizar os subsistema

        String cidade = CepApi.getInstacia().recuperarCidade(cep);
        String estado = CepApi.getInstacia().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);
    }
}
