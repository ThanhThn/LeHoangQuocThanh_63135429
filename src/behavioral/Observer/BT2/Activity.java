package behavioral.Observer.BT2;

public class Activity implements IActivity{
    Button button;
    int count = 0;
    public Activity(Button button) {
        this.button = button;
        button.addActivity(this);
    }

    @Override
    public void onClick() {
        count++;
        System.out.println("Bạn đã click lần thứ "+count);
    }
}
