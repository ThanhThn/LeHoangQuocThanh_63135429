package behavioral.Observer.BT2;

public class MainBT2 {
    public static void main(String[] args) {
        Button button1 = new Button();
        Activity activity1 = new Activity(button1);
        button1.callActivity();
        button1.callActivity();
    }
}
