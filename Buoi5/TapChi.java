package BTVNBuoi5;

class TapChi extends TaiLieu {
    protected int soPhatHanh;
    protected int thangPhatHanh;

    public String mauTrangBia() {
        if (thangPhatHanh < 0 || thangPhatHanh > 12) {
            return "Không xác định";
        } else {
            if (thangPhatHanh < 4) {
                return "màu đỏ";
            } else if (thangPhatHanh < 7) {
                return "màu xanh";
            } else if (thangPhatHanh < 10) {
                return "màu vàng";
            } else {
                return "màu tím";
            }
        }
    }

    public TapChi() {
    }

    public TapChi(int soPhatHanh, int thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(String maTaiLieu, String tenTaiLieu, String tenNhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenTaiLieu, tenNhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void hienThiThongTinTaiLieu() {
        System.out.println("Mã tài liệu: " + maTaiLieu);
        System.out.println("Tên tài liệu: " + tenTaiLieu);
        System.out.println("Tên nhà sản xuất: " + tenNhaXuatBan);
        System.out.println("Số bản phát hành: " + soBanPhatHanh);
        System.out.println("Số phát hành: " + soPhatHanh);
        System.out.println("Tháng phát hành: " + thangPhatHanh);
        System.out.println("Màu trang bìa: " + mauTrangBia());
    }
}

