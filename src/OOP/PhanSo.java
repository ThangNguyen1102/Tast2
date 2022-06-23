package OOP;

import java.util.Scanner;

public class PhanSo {
    private int tuSo, mauSo;
    public PhanSo(){
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void xuatPhanSo(){
        System.out.println(this.getTuSo() + "/" + this.getMauSo());
    }

    public void congPhanSo(PhanSo ps){
        PhanSo phanSoTong = new PhanSo();
        phanSoTong.tuSo = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
        phanSoTong.mauSo = this.getMauSo() * ps.getMauSo();
        System.out.println("Tong 2 phan so: " + phanSoTong.tuSo + "/" + phanSoTong.mauSo);
    }

    public void truPhanSo(PhanSo ps){
        PhanSo phanSoHieu = new PhanSo();
        phanSoHieu.tuSo = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
        phanSoHieu.mauSo = this.getMauSo() * ps.getMauSo();
        System.out.println("Hieu 2 phan so: " + phanSoHieu.tuSo + "/" + phanSoHieu.mauSo);
    }

    public void nhanPhanSo(PhanSo ps){
        PhanSo phanSoTich = new PhanSo();
        phanSoTich.tuSo = this.getTuSo() * ps.getTuSo();
        phanSoTich.mauSo = this.getMauSo() * ps.getMauSo();
        System.out.println("Tich 2 phan so: " + phanSoTich.tuSo + "/" + phanSoTich.mauSo);
    }

    public void chiaPhanSo(PhanSo ps){
        PhanSo phanSoThuong = new PhanSo();
        phanSoThuong.tuSo = this.getTuSo() * ps.getMauSo();
        phanSoThuong.mauSo = this.getMauSo() * ps.getTuSo();
        System.out.println("Thuong 2 phan so: " + phanSoThuong.tuSo + "/" + phanSoThuong.mauSo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        System.out.println("Nhap vao 2 phan so: ");
        System.out.println("Tu so phan so 1: ");
        ps1.setTuSo(sc.nextInt());
        System.out.println("Mau so phan so 1: ");
        ps1.setMauSo(sc.nextInt());
        System.out.println("Tu so phan so 2: ");
        ps2.setTuSo(sc.nextInt());
        System.out.println("Mau so phan so 2: ");
        ps2.setMauSo(sc.nextInt());
        ps1.congPhanSo(ps2);
        ps1.truPhanSo(ps2);
        ps1.nhanPhanSo(ps2);
        ps1.chiaPhanSo(ps2);

    }
}
