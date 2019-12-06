package BTVNBuoi4;

public class Person {
    protected String hoTen;
    protected String gioiTinh;
    protected int age;
    protected String diaChi;

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        if (gioiTinh == "Nam" || gioiTinh == "Nữ") {
            this.gioiTinh = gioiTinh;
        } else {
            System.out.println("Chỉ được nhập Nam hoặc Nữ");
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuổi nhập sai");
        }
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public int getAge() {
        return age;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public Person() {
    }

    public Person(String hoTen, String gioiTinh, int age, String diaChi) {
        this.hoTen = hoTen;
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuổi nhập sai");
        } ;
        this.diaChi = diaChi;
        if (gioiTinh == "Nam" || gioiTinh == "Nữ") {
            this.gioiTinh = gioiTinh;
        } else {
            System.out.println("Chỉ được nhập Nam hoặc Nữ");
        }
    }

    public void thongTin() {
        System.out.println("Họ và tên: " + hoTen + "; Giới tính: " + gioiTinh +
                "; Tuổi: " + age + "; Địa chỉ: " + diaChi);
    }
}
