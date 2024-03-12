package structural.composite;

public class File extends AbstractFile{
    public File(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public String getStringTreeFolder() {
        return ten;
    }

    @Override
    public void addItem(AbstractFile file) {
    }

    @Override
    public void removeItem(AbstractFile file) {

    }
}
