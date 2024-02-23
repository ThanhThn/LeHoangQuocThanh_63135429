package creational.singleton.BT4;

public class User {
    String ten;

    public User(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void binhChon(Cadidate c){
        Election.getInstance().binhChon(c, this);
    }
}
