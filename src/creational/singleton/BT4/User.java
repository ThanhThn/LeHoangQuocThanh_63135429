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
    private boolean selectedUser = true;
    public void binhChon(Cadidate c){
        if (selectedUser){
            selectedUser = false;
            Election.getInstance().binhChon(c);
        }
    }
}
