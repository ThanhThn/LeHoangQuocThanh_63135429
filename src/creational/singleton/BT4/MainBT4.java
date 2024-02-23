package creational.singleton.BT4;

public class MainBT4 {
    public static void main(String[] args) {
        User user1 = new User("Chí");
        User user2 = new User("Nhật");
        User user3 = new User("Mỹ");
        User user4 = new User("Chi");
        User user5 = new User("An");
        User user6 = new User("Phụng");
        user1.binhChon(Cadidate.TRUMP);
        user2.binhChon(Cadidate.TRUMP);
        user3.binhChon(Cadidate.BIDEN);
        user4.binhChon(Cadidate.TRUMP);
        user5.binhChon(Cadidate.TRUMP);
        user6.binhChon(Cadidate.BIDEN);
        user1.binhChon(Cadidate.BIDEN);
        Election.getInstance().InKetQua();

    }
}
