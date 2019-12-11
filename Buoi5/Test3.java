package BTVNBuoi5;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        Sach sach1 = new Sach("11120401", "Tiếu ngạo giang hồ", "NXB trẻ thơ", 15000, "Kim Dung", 100);
        TapChi tc1 = new TapChi("11120402", "muong14 ver 1", "NXB trẻ thơ", 15000, 11, 11);
        TapChi tc2 = new TapChi("11120403", "muong14 ver 2", "NXB trẻ thơ", 15000, 12, 12);
        Bao bao1 = new Bao("11120404", "muong14 ver 3", "NXB trẻ thơ", 15000, 12);
        Bao bao2 = new Bao("11120405", "muong14 ver 4", "NXB trẻ thơ", 15000, 13);
        ArrayList<TaiLieu> arr = new ArrayList<TaiLieu>();
        arr.add(sach1);
        arr.add(tc1);
        arr.add(tc2);
        arr.add(bao1);
        arr.add(bao2);
        for (TaiLieu tl : arr) {
            tl.hienThiThongTinTaiLieu();
        }

        String taiLieuCanTim = "Tiếu ngạo giang hồ";
        for (TaiLieu tl : arr) {
            if (tl.tenTaiLieu == taiLieuCanTim) {
                tl.hienThiThongTinTaiLieu();
            }
        }
    }
}