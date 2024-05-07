package behavioral.Observer.BT2;

public class Button {

    IActivity activity;

    public void addActivity(IActivity activity){
        this.activity = activity;
    }
    public void callActivity(){
        activity.onClick();
    }
}
