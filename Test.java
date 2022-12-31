
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KINHTHANH
 */
public class Test 
{
    public static void main(String[] args) {
        QuanLiSinhVien quanLiSinhVien = new QuanLiSinhVien();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Them sinh vien");
            System.out.println("2.Sap xep sinh vien theo diem");
            System.out.println("3.Hien thi sinh vien");
            System.out.println("0. Thoat");
            String button = sc.nextLine();
            switch(button)
            {
                case "1":
                {
                    System.out.print("moi ban nhap so luong sinh vien muon nhap: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for(int i=0;i<n;i++)
                    {
                        quanLiSinhVien.nhapSinhVien(sc);
                         sc.nextLine();
                    }
                   // sc.nextLine();
                   
                    break;
                }
                case "2":
                {
                    quanLiSinhVien.sapXepSinhVienTheoDiem();
                    break;
                }
                case "3":
                {
                    quanLiSinhVien.hienThiSinhVien();
                    break;
                }
                case "0":
                {
                    System.out.println("cam on ban da su dung dich vu");
                    return;
                }
                default:
                {
                    System.out.println("du lieu khong hop le");
                    continue;
                }
            }
        }
        
        
    }
    
}
