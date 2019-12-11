package BTVNBuoi5;

public class HinhChuNhat implements TuGiac {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void kiemTraHinhVuong() {
        if (this.chieuDai == this.chieuRong) {
            System.out.println("Hình vuông");
        } else {
            System.out.println("Không phải hình vuông");
        }
    }

    @Override
    public double tinhDienTich() {
        double dienTich = chieuDai * chieuRong;
        System.out.println("Dien tich: " + dienTich);
        return dienTich;
    }

    @Override
    public double tinhChuVi() {
        double chuVi = (chieuDai + chieuRong) * 2;
        System.out.println("Chu vi: " + chuVi);
        return chuVi;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("Chieu dai: " + chieuDai);
        System.out.println("Chieu rong: " + chieuRong);
    }
}
