package structural.Decorator.BT2;

import java.util.List;

public class MainBT2 {
    public static void main(String[] args) {
        String s = "Sinh viên và giáo viên được nghỉ lễ 5 ngày, đi chơi thôi!";
        Tokenize t = new TachTu(s);
        System.out.println(t.tokenize());
        t = new RemoveStopword(t);
        System.out.println(t.tokenize());
        t = new RemovePunctuation(t);
        System.out.println(t.tokenize());
    }
}
