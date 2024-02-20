package behavioral.strategy.dick;

public class VitDonald extends Duck{
    public void display(){
        System.out.println("Tôi là vịt Donald");
        performFly();
        performQuack();
    }
}
