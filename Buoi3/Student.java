package BTVN_Buoi3;

public class Student {
    private String maHocVien;
    private String lop;
    private double diemToan;

    public void setDiemAnh(double diemAnh) {
        this.diemAnh = diemAnh;
    }

    private double diemVan;
    private double diemAnh;

    public double getDiemAnh() {
        return diemAnh;
    }

    public void setMaHocVien(String maHocVien) {
        this.maHocVien = maHocVien;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public String getMaHocVien() {
        return maHocVien;
    }

    public String getLop() {
        return lop;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void thongTin() {
        System.out.println("Mã học viên: " + maHocVien + "; Lớp: " + lop +
                "; điểm Toán: " + diemToan + "; điểm Văn: " + diemVan);
    }

    public double diemTrungBinh() {
        return ((diemToan + diemVan) * 2 + diemAnh) / 5;
    }

    public void tinhDiemTrungBinh() {
        System.out.println(diemTrungBinh());
    }

    public void xepHang() {
        if (diemTrungBinh() <= 10.0) {
            if (diemTrungBinh() >= 8.0) {
                System.out.println("Rank A");
            } else if (diemTrungBinh() >= 7.0) {
                System.out.println("Rank B");
            } else if (diemTrungBinh() >= 5.5) {
                System.out.println("Rank C");
            } else if (diemTrungBinh() >= 4.0) {
                System.out.println("Rank D");
            } else {
                System.out.println("Rank E");
            }
        } else {
            System.out.println("Fail");
        }
    }
}
