package br.com.inacio.singleton;

/**
 * Singleton "Lazy Holder"
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 */

public class SingletonLazyHolder {

    private static  class  InstanceHolder{
        public static SingletonLazyHolder instancia =
                new SingletonLazyHolder();
    }


    //Garantir que não possa ter acesso colocando o construtor com private
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstacia(){
        return  InstanceHolder.instancia;
    }
}
