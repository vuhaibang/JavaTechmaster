package BTVNBuoi5;

public class HinhVuong implements TuGiac {
    private double canh;

    @Override
    public double tinhDienTich() {
        double dienTich = canh * canh;
        System.out.println("Dien tich: " + dienTich);
        return dienTich;
    }

    @Override
    public double tinhChuVi() {
        double chuVi = canh + canh;
        System.out.println("Chu vi: " + chuVi);
        return chuVi;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Do dai canh: " + canh);
    }

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }
}
