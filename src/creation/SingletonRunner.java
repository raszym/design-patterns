package creation;

import creation.singleton.SingletonServer;

public class SingletonRunner {
    public void run() {
        SingletonServer singletonServer = SingletonServer.getInstance();
        singletonServer.response();
        SingletonServer singletonServer1 = SingletonServer.getInstance();

        System.out.println(singletonServer == singletonServer1);
    }
}
