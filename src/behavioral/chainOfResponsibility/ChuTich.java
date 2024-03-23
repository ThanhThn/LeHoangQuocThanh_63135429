package behavioral.chainOfResponsibility;

public class ChuTich extends ChoVayF88{
    public ChuTich(String ten, String chucVu,int hanMucVay) {
        super(hanMucVay, ten, chucVu);
    }

    @Override
    public ChoVayF88 caoCapHon(ChoVayF88 capCao) {
        return null;
    }

    @Override
    public String xuLyVay(int soTienVay) {
        StringBuilder builder = new StringBuilder(chucVu);
        if(soTienVay <= hanMucVay){
            builder.append(" ").append(ten).append(" Duyet so tien vay: ").append(soTienVay);
            return builder.toString();
        }
        builder.append(" Dell cho vay");
        return builder.toString();
    }
}
