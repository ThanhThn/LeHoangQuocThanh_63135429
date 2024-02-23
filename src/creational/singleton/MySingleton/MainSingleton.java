package creational.singleton.MySingleton;

import creational.singleton.MySingleton.Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        s1.inCount();
        s2.inCount();
        s1.inCount();
    }
}
