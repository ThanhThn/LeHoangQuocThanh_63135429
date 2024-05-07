package behavioral.Observer.BT1;

import java.util.ArrayList;
import java.util.List;

public class Client<T> implements MyStreamListener<List<MonHoc>>{
    MyStream stream;

    public Client(MyStream stream) {
        this.stream = stream;
        stream.addListener(this);
    }
    @Override
    public void listen(List<MonHoc> monHocs) {
        for (MonHoc monHoc : monHocs) {
            System.out.println(monHoc.toString());
        }
    }
}
