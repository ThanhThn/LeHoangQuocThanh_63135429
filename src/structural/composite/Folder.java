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
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten);
        for(AbstractFile file:files)
            builder.append("\n").append(stringTab).append(file.getStringTreeFolder());
        return builder.toString();
    }


    @Override
    public void addItem(AbstractFile file) {
        files.add(file);
        file.duongDan = this.duongDan + "\\" + file.duongDan;
        file.stringTab = this.stringTab + "\t";
    }

    @Override
    public void removeItem(AbstractFile file) {
        files.remove(file);
    }
}
