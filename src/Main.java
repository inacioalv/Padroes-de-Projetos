import br.com.inacio.facade.Facade;
import br.com.inacio.singleton.SingletonEager;
import br.com.inacio.singleton.SingletonLazy;
import br.com.inacio.singleton.SingletonLazyHolder;
import br.com.inacio.strategy.*;

public class Main {
    public static void main(String[] args) {

        //Singleton
//        SingletonLazy lazy = SingletonLazy.getInstacia();
//        System.out.println(lazy);
//        lazy = SingletonLazy.getInstacia();
//        System.out.println(lazy);
//
//        SingletonEager eager = SingletonEager.getInstacia();
//        System.out.println(eager);
//        lazy = SingletonLazy.getInstacia();
//        System.out.println(eager);
//
//        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstacia();
//        System.out.println(lazyHolder);
//        lazy = SingletonLazy.getInstacia();
//        System.out.println(lazyHolder);

        //Strategy
//        Comportaneto defensivo = new ComportamentoDefensivo();
//        Comportaneto normal = new ComportamentoNormal();
//        Comportaneto agressivo = new ComportamentoAgressivo();
//
//        Robo  robo = new Robo();
//        robo.setComportaneto(normal);
//        robo.mover();
//        robo.mover();
//        robo.setComportaneto(defensivo);
//        robo.mover();
//        robo.mover();
//        robo.setComportaneto(agressivo);
//        robo.mover();
//        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Inacio","5566500");

    }
}