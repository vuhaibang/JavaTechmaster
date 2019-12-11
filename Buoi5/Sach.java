package BTVNBuoi5;

class Sach extends TaiLieu {
    protected String tenTacGia;
    protected int soTrang;
    protected final double GIA_IN_SACH = 200;

    public double soTienIn1CuonSach() {
        return soTrang * GIA_IN_SACH;
    }

    public Sach() {
    }

    public Sach(String tenTacGia, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(String maTaiLieu, String tenTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public void hienThiThongTinTaiLieu() {
        System.out.println("Mã tài liệu: " + maTaiLieu);
        System.out.println("Tên tài liệu: " + tenTaiLieu);
        System.out.println("Tên nhà sản xuất: " + tenNhaXuatBan);
        System.out.println("Số bản phát hành: " + soBanPhatHanh);
        System.out.println("Tên tác giả: " + tenTacGia);
        System.out.println("Số trang sách: " + soTrang);
        System.out.println("Giá in 1 cuốn sách: " + soTienIn1CuonSach());


    }


}
