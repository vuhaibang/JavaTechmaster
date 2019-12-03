package BTVN_Buoi3;

public class BankAccount {
    private long soTaiKhoan;
    private String tenChuTaiKhoan;
    private double soTien;

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }

    public double getSoTien() {
        return soTien;
    }

    public BankAccount(long soTaiKhoan, String tenChuTaiKhoan, double soTien) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soTien = soTien;
    }

    public BankAccount() {
    }

    private final double LAISUAT = 0.05;

    public BankAccount(long soTaiKhoan, String tenChuTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.soTien = 50000;
    }

    public void thongTin() {
        System.out.println("Tên chủ tài khoản là: " + tenChuTaiKhoan + "; Số tài khoản: " + soTaiKhoan +
                "; Số tiền trong tài khoản: " + soTien + "; mức lãi suất là: " + LAISUAT);
    }

    public void napTien(double soTienNap) {
        this.soTien += soTienNap;
    }

    public void rutTien(double soTienRut) {
        if (this.soTien >= soTienRut) {
            this.soTien -= soTienRut;
        } else {
            System.out.println("Không đủ tiền trong tài khoản");
        }
    }

    public void daoHan() {
        this.soTien = (this.soTien * (1 + LAISUAT));
    }
}
