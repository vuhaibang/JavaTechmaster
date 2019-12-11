package BTVNBuoi5;

class Car extends PhuongTienGiaoThong {
    private String dongCo;

    public String getDongCo() {
        return dongCo;
    }

    public void setDongCo(String dongCo) {
        this.dongCo = dongCo;
    }

    @Override
    public void phanh() {
        System.out.println("Car đã dừng");
    }

    @Override
    public void chay() {
        System.out.println("Car đang đi");
    }

    public Car() {
    }

    public Car(String dongCo) {
        this.dongCo = dongCo;
    }

    public Car(String hang, double tocDo, String mau, String dongCo) {
        super(hang, tocDo, mau);
        this.dongCo = dongCo;
    }

    public void showInfo() {
        System.out.println("Động cơ:" + dongCo);
        System.out.println("Hãng:" + hang);
        System.out.println("Tốc độ: " + tocDo);
        System.out.println("Màu: " + mau);
    }

}
