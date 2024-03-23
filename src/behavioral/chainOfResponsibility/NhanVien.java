package behavioral.chainOfResponsibility;

public class NhanVien extends ChoVayF88{
    ChoVayF88 capCaoHon;
    public NhanVien(String ten, String chucVu,
                    int hanMucVay) {
        super(hanMucVay, ten, chucVu);
    }

    @Override
    public ChoVayF88 caoCapHon(ChoVayF88 capCao) {
        this.capCaoHon = capCao;
        return capCao;
    }

    @Override
    public String xuLyVay(int soTienVay) {
        if(soTienVay <= hanMucVay){
            StringBuilder builder = new StringBuilder(chucVu);
            builder.append(" ").append(ten).append(" Duyet so tien vay: ").append(soTienVay);
            return builder.toString();
        }
        return capCaoHon.xuLyVay(soTienVay);
    }
}
