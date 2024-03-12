package structural.composite;

public abstract class AbstractFile {
    String ten, ngayTao, duongDan;
    protected String stringTab = "\t";


    public AbstractFile(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.duongDan = ten;
    }

    public abstract String getStringTreeFolder();
    public abstract void addItem(AbstractFile file);
    public abstract void removeItem(AbstractFile file);
    public String getPath(){
        return duongDan;
    }
}
