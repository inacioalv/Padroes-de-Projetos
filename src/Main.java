import br.com.inacio.singleton.SingletonEager;
import br.com.inacio.singleton.SingletonLazy;
import br.com.inacio.singleton.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstacia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstacia();
        System.out.println(eager);
        lazy = SingletonLazy.getInstacia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstacia();
        System.out.println(lazyHolder);
        lazy = SingletonLazy.getInstacia();
        System.out.println(lazyHolder);


    }
}