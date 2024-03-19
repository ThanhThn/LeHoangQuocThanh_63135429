package structural.composite;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AbstractFile data = new Folder("Data", "3/1/2023");
        AbstractFile taiLieu = new Folder("TaiLieu", "3/1/2023");
        AbstractFile lapTrinhJava = new Folder("Lap trinh Java", "3/1/2023");
        AbstractFile designPatten = new Folder("Design Patten", "3/1/2023");
        AbstractFile lapTrinhThietBiDiDong = new Folder("LapTrinhThietBiDiDong", "3/1/2023");
        AbstractFile ngonNguLapTrinhC = new File("NgonNguLapTrinhC.pdf", "3/1/2023");
        AbstractFile creationalPattern = new File("CreationalPattern.pptx", "3/1/2023");
        AbstractFile structuralPattern = new File("StructuralPattern.pptx", "3/1/2023");
        data.addItem(taiLieu);
        taiLieu.addItem(lapTrinhJava);
        taiLieu.addItem(designPatten);
        taiLieu.addItem(lapTrinhThietBiDiDong);
        taiLieu.addItem(ngonNguLapTrinhC);
        designPatten.addItem(creationalPattern);
        designPatten.addItem(structuralPattern);
        System.out.println(creationalPattern.getPath());
        System.out.println(designPatten.getStringTreeFolder());
        System.out.println(data.getStringTreeFolder());
    }
}
