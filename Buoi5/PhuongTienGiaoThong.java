package BTVNBuoi5;

public abstract class PhuongTienGiaoThong {
    protected String hang;
    protected double tocDo;
    protected String mau;

    public abstract void phanh();

    public abstract void chay();

    public double tinhQuangDuong(double hour) {
        return tocDo * hour;
    }

    public PhuongTienGiaoThong() {
    }

    public PhuongTienGiaoThong(String hang, double tocDo, String mau) {
        this.hang = hang;
        this.tocDo = tocDo;
        this.mau = mau;
    }
}
