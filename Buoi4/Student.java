package BTVNBuoi4;

class Student extends Person {
    protected String maHocSinh;
    protected double diemThi;

    public void thongTin() {
        super.thongTin();
        System.out.println("Mã học sinh: " + maHocSinh + "; điểm thi: " + diemThi);
    }

    public void xepHang() {
        if (diemThi <= 10.0) {
            if (diemThi >= 8.0) {
                System.out.println("Rank A");
            } else if (diemThi >= 7.0) {
                System.out.println("Rank B");
            } else if (diemThi >= 5.5) {
                System.out.println("Rank C");
            } else if (diemThi >= 4.0) {
                System.out.println("Rank D");
            } else if (diemThi >= 0) {
                System.out.println("Rank E");
            }
        } else {
            System.out.println("Fail");
        }
    }

    public Student(String maHocSinh, double diemThi) {
        this.maHocSinh = maHocSinh;
        this.diemThi = diemThi;
    }

    public Student(String hoTen, String gioiTinh, int age, String diaChi, String maHocSinh, double diemThi) {
        super(hoTen, gioiTinh, age, diaChi);
        this.maHocSinh = maHocSinh;
        this.diemThi = diemThi;
    }

    public Student() {
    }

    public String getMaHocSinh() {
        return maHocSinh;
    }

    public double getDiemThi() {
        return diemThi;
    }

    public void setMaHocSinh(String maHocSinh) {
        this.maHocSinh = maHocSinh;
    }

    public void setDiemThi(double diemThi) {
        this.diemThi = diemThi;
    }
}
