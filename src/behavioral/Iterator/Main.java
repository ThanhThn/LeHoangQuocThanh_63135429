package behavioral.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void duyetTapHop(Iterator<MonHoc> iterator) {
        while (iterator.hasNext()) {
            MonHoc monHoc = iterator.next();
            System.out.println(monHoc.toString()) ;
        }
    }

    public static void main(String[] args) {
        List<MonHoc> monHocs = new ArrayList<MonHoc>(Arrays.asList(
                new MonHoc("Thể dục", 1),
                new MonHoc("Lập trình thiết bị di động", 4),
                new MonHoc("Thiết kế Web", 3)));
        duyetTapHop(monHocs.listIterator());
    }
}
