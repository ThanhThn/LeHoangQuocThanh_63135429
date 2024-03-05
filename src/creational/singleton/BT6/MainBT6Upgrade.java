package creational.singleton.BT6;

public class MainBT6Upgrade {
    public static void main(String[] args) {
        UI_Upgrade ui1 = new UI_Upgrade("S1");
        UI_Upgrade ui2 = new UI_Upgrade("S2");
        UI_Upgrade ui3 = new UI_Upgrade("S1");
        ui1.add("SP01", "Cam", 370, 29000);
        ui2.add("SP02", "Bưởi", 250, 30000);
        ui3.add("SP03", "Mít", 150, 7000);
        ui1.display();
    }
}
