package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    List<AbstractFile> files = new ArrayList<AbstractFile>();

    public Folder(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder(getStringTab() + ten + "\n");
        for(AbstractFile file:files){
            file.setStringTab(getStringTab() + "\t");
            builder.append(file.getStringTreeFolder());
        }
        return builder.toString();
    }


    @Override
    public void addItem(AbstractFile file) {
        files.add(file);
        file.duongDan = this.duongDan + "\\" + file.duongDan;
    }

    @Override
    public void removeItem(AbstractFile file) {
        files.remove(file);
    }
}
