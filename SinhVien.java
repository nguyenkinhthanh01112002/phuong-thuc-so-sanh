/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KINHTHANH
 */
public class SinhVien {
    private String ten;
    private int tuoi;
    private String mssv;
    private String gioiTinh;
    private double diem;

    public SinhVien(String ten, int tuoi, String mssv, String gioiTinh, double diem) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.mssv = mssv;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "{" + "ten=" + ten + ", tuoi=" + tuoi + ", mssv=" + mssv + ", gioiTinh=" + gioiTinh + ", diem=" + diem + '}';
    }
    
    
}
