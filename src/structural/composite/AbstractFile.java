package structural.composite;

public abstract class AbstractFile {
    String ten, ngayTao, duongDan, stringTab = "";


    public AbstractFile(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.duongDan = ten;
    }

    public String getStringTab() {
        return stringTab;
    }

    public void setStringTab(String stringTab) {
        this.stringTab = stringTab;
    }

    public abstract String getStringTreeFolder();
    public abstract void addItem(AbstractFile file);
    public abstract void removeItem(AbstractFile file);
    public String getPath(){
        return duongDan;
    }
}
