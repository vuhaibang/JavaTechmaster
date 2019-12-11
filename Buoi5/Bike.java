package BTVNBuoi5;

class Bike extends PhuongTienGiaoThong {
    @Override
    public void phanh() {
        System.out.println("Bike đã dừng");
    }

    @Override
    public void chay() {
        System.out.println("Bike đang đi");
    }

    public Bike() {
    }

    public Bike(String hang, double tocDo, String mau) {
        super(hang, tocDo, mau);
    }
}
