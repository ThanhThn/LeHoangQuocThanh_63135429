package behavioral.chainOfResponsibility.BT3;

public class MainBT3 {
    public static void main(String[] args) {
        Electricity B1 = new MucDien(1_806,"Bậc 1", 0,50);
        Electricity B2 = new MucDien(1_866,"Bậc 2",51, 100);
        Electricity B3 = new MucDien(2_167, "Bậc 3",101, 200);
        Electricity B4 = new MucDien(2_729, "Bậc 4" ,201, 300);
        Electricity B5 = new MucDien(3_050, "Bậc 5",301,400);
        Electricity B6 = new MucDienCaoNhat(3_151, "Bậc 6", 401, Integer.MAX_VALUE);
        B1.mucDienCaoHon(B2).mucDienCaoHon(B3).mucDienCaoHon(B4).mucDienCaoHon(B5).mucDienCaoHon(B6);
        System.out.printf(B1.tienDienCuaBac(65));
    }
}
