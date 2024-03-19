package structural.composite.BT4;

public abstract class KHHT {
    String ten, stringTab = "";

    public KHHT(String ten) {
        this.ten = ten;
    }
    public String getStringTab() {
        return stringTab;
    }

    public void setStringTab(String stringTab) {
        this.stringTab = stringTab;
    }

    public abstract void Add(KHHT k);
    public abstract void Remove(KHHT k);
    public abstract int HocPhi();
    public abstract int TinChi();
    public abstract String ThongTin();
}
