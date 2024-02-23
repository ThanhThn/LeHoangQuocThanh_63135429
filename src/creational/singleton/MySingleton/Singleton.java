package creational.singleton.MySingleton;

public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null)
            instance = new Singleton();
        return instance;
    }
    int count = 0;
    public void inCount(){
        System.out.println(++count);
    }
}
