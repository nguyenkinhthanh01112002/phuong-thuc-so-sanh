
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KINHTHANH
 */
public class QuanLiSinhVien {
    private ArrayList<SinhVien> students;
    public QuanLiSinhVien()
    {
        this.students = new ArrayList<SinhVien>();
    }
    public QuanLiSinhVien(ArrayList<SinhVien> students)
    {
        this.students = students;
    }
    public void nhapSinhVien(Scanner sc)
    {
        System.out.print("nhap vao ten cua sinh vien: ");
        String ten = sc.nextLine();
        System.out.print("nhap vao tuoi cua sinh vien: ");
        int tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("nhap vao ma so sinh vien: ");
        String mssv = sc.nextLine();
        System.out.print("nhap vao gioi tinh cua sinh vien: ");
        String gioiTinh = sc.nextLine();
        System.out.print("nhap vao diem cua sinh vien: ");
        double diem = sc.nextDouble();
        SinhVien sinhVien = new SinhVien(ten, tuoi, mssv, gioiTinh, diem);
        //kiem tra co ton tai ma so sinh vien trung hay la khong
        /*boolean check = false;
        do
        {
            for(int i=0;i<students.size();i++)
          {
              if(this.students.get(i).getMssv().equals(mssv)==true)
              {
                  System.out.println("ma so sinh vien da ton tai!!!");
                  System.out.println("........ban vui long nhap lai........");
                  check = true;
                  break;
              }
          }  
        }
        while(check==true);*/
        this.students.add(sinhVien);
    }
    public void timSinhVien(String mssv)
    {
        for(SinhVien o:students)
        {
            if(o.getMssv().equals(mssv)==true)
            {
                System.out.println(""+o.toString());
            }
        }
    }
    public void xoaSinhVien(String mssv)
    {
       for(SinhVien o:students)
        {
            if(o.getMssv().equals(mssv)==true)
            {
                students.remove(o);
                break;
            }
        } 
        for(SinhVien o:students)
        {
            System.out.println(""+o.toString());
        }
    }
   /* public void sapXepSinhVienTheoDiem()
    {
      Collections.sort(students, new Comparator<SinhVien>() {
          @Override
          public int compare(SinhVien o1, SinhVien o2) {
              return (int)(o1.getDiem()-o2.getDiem());
          }
      });
    }*/
    public void sapXepSinhVienTheoDiem()
    {
        Collections.sort(students, (o1, o2) -> (int)(o1.getDiem()-o2.getDiem()));
    }
    public void sapXepSinhVienTheoTen()
    {
       Collections.sort(students, (o1, o2) -> o1.getTen().compareTo(o2.getTen()));
    }
    public void hienThiSinhVien()
    {
        for(SinhVien o:students)
        {
            System.out.println(""+o.toString());
        }
    }
              
}
