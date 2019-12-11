package BTVNBuoi5;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat();
        hcn1.setChieuDai(3);
        hcn1.setChieuRong(4);
        hcn1.tinhChuVi();
        hcn1.tinhDienTich();
        hcn1.kiemTraHinhVuong();
        HinhVuong hv1 = new HinhVuong(5);
        HinhVuong hv2 = new HinhVuong(6);
        hv1.tinhDienTich();
        hv2.tinhDienTich();
        ArrayList<TuGiac> tg = new ArrayList<TuGiac>();
        tg.add(hcn1);
        tg.add(hv1);
        tg.add(hv2);
        double result = 0;
        for (TuGiac i: tg){
            if (i.tinhDienTich() > result){result = i.tinhDienTich();}
        }
        System.out.print(result);
    }
}
