package behavioral.Observer.BT1;

import java.util.ArrayList;
import java.util.List;

public class DataAccess {
    List<MonHoc> dsMonHoc = new ArrayList<MonHoc>();
    MyStream<List<MonHoc>> stream;

    public DataAccess(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void them(MonHoc monHoc){
        dsMonHoc.add(monHoc);
        stream.addEvent(dsMonHoc);
    }
    public void xoa(String id){
        for(MonHoc monHoc : dsMonHoc){
            if(monHoc.getId().equals(id)){
                dsMonHoc.remove(monHoc);
                stream.addEvent(dsMonHoc);
                return;
            }
        }
    }

}
