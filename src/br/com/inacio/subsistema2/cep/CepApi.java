package br.com.inacio.subsistema2.cep;

import br.com.inacio.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();
    private CepApi() {
        super();
    }
    public static CepApi getInstacia(){
        return  instancia;
    }

    public  String recuperarCidade(String cep){
        return "Camocim";
    }

    public  String recuperarEstado(String cep){
        return "PE";
    }
}
