package behavioral.strategy.dick;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    void performQuack(){
        System.out.println(quackBehavior.quack());
    }
    void performFly(){
        System.out.println(flyBehavior.fly());
    }
    void swin(){
        System.out.println("Vịt nào cũng bơi");
    }
    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

}
