package structural.Decorator.BT2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TachTu implements Tokenize{
    String s;

    public TachTu(String s) {
        this.s = s;
    }

    @Override
    public List<String> tokenize() {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(s.split(" ")));
        return list;
    }
}
