package BTVNBuoi5;

class Bao extends TaiLieu {
    protected int ngayPhatHanh;

    public Bao() {
    }

    public Bao(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(String maTaiLieu, String tenTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void hienThiThongTinTaiLieu() {
        System.out.println("Mã tài liệu: " + maTaiLieu);
        System.out.println("Tên tài liệu: " + tenTaiLieu);
        System.out.println("Tên nhà sản xuất: " + tenNhaXuatBan);
        System.out.println("Số bản phát hành: " + soBanPhatHanh);
        System.out.println("Ngày phát hành: " + ngayPhatHanh);
    }

}
