package BTVNBuoi4;

public class ConVat {
    protected String ten;
    protected String loai;
    protected int tuoi;

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public void setTuoi(int tuoi) {
        if (tuoi > 0) {
            this.tuoi = tuoi;
        } else {
            System.out.println("Khai báo sai tuổi");
        }
    }

    public String getTen() {
        return ten;
    }

    public String getLoai() {
        return loai;
    }

    public int getTuoi() {
        return tuoi;
    }

    public ConVat() {
    }

    public ConVat(String ten, String loai, int tuoi) {
        this.ten = ten;
        this.loai = loai;
        if (tuoi > 0) {
            this.tuoi = tuoi;
        } else {
            System.out.println("Khai báo sai tuổi");
        }
    }

    public void thongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Chủng loài: " + loai);
        System.out.println("Tuổi: " + tuoi);
    }
    public void keu(){
        System.out.println("Tôi đang kêu");
    }
}
