package BTVNBuoi4;

class Dog extends ConVat {
    protected String mauLong;
    protected int soChan;

    public void thongTin() {
        super.thongTin();
        System.out.println("Màu lông: " + mauLong);
        System.out.println("Số chân: " + soChan);
    }

    public void keu() {
        System.out.println("tiếng kêu của loài chó =))");
    }

    public Dog(String mauLong, int soChan) {
        this.mauLong = mauLong;
        this.soChan = soChan;
    }

    public Dog(String ten, int tuoi, String mauLong, int soChan) {
        super(ten, "chó", tuoi);
        this.mauLong = mauLong;
        this.soChan = soChan;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public void setSoChan(int soChan) {
        this.soChan = soChan;
    }

    public String getMauLong() {
        return mauLong;
    }

    public int getSoChan() {
        return soChan;
    }

    public Dog() {
    super.loai = "Chó";
    }
}
