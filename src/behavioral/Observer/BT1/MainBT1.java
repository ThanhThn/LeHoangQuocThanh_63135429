package behavioral.Observer.BT1;

import java.util.List;

public class MainBT1
{
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        Client client = new Client<>(stream);
        DataAccess dataAccess = new DataAccess(stream);
        System.out.println("Lần 1");
        dataAccess.them(new MonHoc("Lập trình thiết bị di động", 3, "SOT334"));
        System.out.println("Lần 2");
        dataAccess.them(new MonHoc("Trí tuệ nhân tạo", 3, "SOT234"));
        System.out.println("Lần 3");
        dataAccess.xoa("SOT334");
    }
}
