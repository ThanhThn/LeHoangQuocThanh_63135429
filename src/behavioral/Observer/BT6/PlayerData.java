package behavioral.Observer.BT6;

public class PlayerData {
    int countDown, grade, thoiGian;
    PlayerDataListener dashboard;

    public PlayerData(int thoiGian, int grade, int countDown) {
        this.thoiGian = thoiGian;
        this.grade = grade;
        this.countDown = countDown;
    }

    void setDashboard(PlayerDataListener dashboard) {
        this.dashboard = dashboard;
    }
    public int getCountDown() {
        return countDown;
    }

    public void setCountDown(int countDown) {
        this.countDown = countDown;
        dashboard.listen(this);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
        dashboard.listen(this);
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        dashboard.listen(this);
    }
}
