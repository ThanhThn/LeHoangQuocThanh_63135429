package behavioral.Observer.BT6;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        int countDown = 3;
        int[] thoiGian = {10};
        int grade = 0;
        Timer timer = new Timer();
        PlayerData player = new PlayerData(thoiGian[0], grade, countDown);
        Dashboard dashboard = new Dashboard(player);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                thoiGian[0] = thoiGian[0] - 1;
                player.setThoiGian(thoiGian[0]);
            }
        }, 10);
    }
}
