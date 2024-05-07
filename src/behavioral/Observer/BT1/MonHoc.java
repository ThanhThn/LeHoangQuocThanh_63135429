package behavioral.Observer.BT1;

public class MonHoc {
    String ten, id;
    int soTC;

    public MonHoc(String ten, int soTC, String id) {
        this.ten = ten;
        this.soTC = soTC;
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  ten + '\t' + "số tín chỉ: " + soTC;
    }
}
