package BTVNBuoi4;

class Teacher extends Person {
    protected String lopDay;
    protected double gioDay;
    protected static double luongMotGio = 200000;

    public void thongTin() {
        super.thongTin();
        System.out.println("Dạy lớp: " + lopDay);
        System.out.println("Số giờ dạy: " + gioDay);
        System.out.println("lương dạy 1 giờ " + luongMotGio);
    }

    public void tinhLuong() {
        System.out.println("Tổng lương: " + gioDay * luongMotGio);
    }

    public Teacher(String lopDay, double gioDay) {
        this.lopDay = lopDay;
        this.gioDay = gioDay;
    }

    public Teacher(String hoTen, String gioiTinh, int age, String diaChi, String lopDay, double gioDay) {
        super(hoTen, gioiTinh, age, diaChi);
        this.lopDay = lopDay;
        this.gioDay = gioDay;
    }

    public Teacher() {
    }
}
