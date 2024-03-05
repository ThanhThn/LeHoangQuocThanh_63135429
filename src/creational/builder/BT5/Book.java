package creational.builder.BT5;


import creational.builder.BT1.CTHD;
import creational.builder.computer.Computer;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String tuaDe, tacGia;
    int soTrang;
    List<String> chuong;
    private  Book(Builder b){
        this.tuaDe = b.tuaDe;
        this.tacGia = b.tacGia;
        this.chuong = b.chuong;
        this.soTrang = b.soTrang;
    }

    @Override
    public String toString() {
        String str = "Tựa đề: "  + tuaDe + "\nTác giả:" + tacGia + "\nChương:\n";
        for (String c: chuong){
            str = str + c + "\n";
        }
        str += "Số trang: " + soTrang;
        return str;
    }

    public static class Builder{
        String tuaDe, tacGia;
        int soTrang;
        List<String> chuong= new ArrayList<String>();
        public Builder addTuaDe(String tuaDe){
            this.tuaDe = tuaDe;
            return this;
        }
        public Builder addTacGia(String tacGia){
            this.tacGia = tacGia;
            return this;
        }
        public Builder addSoTrang(int soTrang){
            this.soTrang = soTrang;
            return this;
        }
        public Builder addChuong(String chuong){
            this.chuong.add(chuong);
            return this;
        }
        public Book builder(){
            return new Book(this);
        }

    }
}
