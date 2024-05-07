package behavioral.Observer.BT6;

public class Dashboard implements PlayerDataListener{
    PlayerData player;

    public Dashboard(PlayerData player) {
        this.player = player;
        player.setDashboard(this);
    }

    @Override
    public void listen(PlayerData data) {
        System.out.println("Grade:" + data.getGrade() + "\tCoutdown: " +data.getCountDown() + "\tTime: "+ data.getThoiGian()   );
    }
}
