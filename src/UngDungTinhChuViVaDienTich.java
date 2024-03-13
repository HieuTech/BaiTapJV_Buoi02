import java.util.Scanner;

public class UngDungTinhChuViVaDienTich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuong trình Ung Dung Tinh Chu Vi, Dien Tich");



        int choice;
        do {
            System.out.println("1: Hinh Tam Giac");
            System.out.println("2: Hinh Chu Nhat");
            System.out.println("3: Hinh Tron");
             choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 :
                    System.out.println("Lựa chọn hinh tam giác");
                    System.out.println("Nhập giá tri cạnh 1");
                    int canh1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập giá tri cạnh 2");
                    int canh2 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập giá tri cạnh 3");
                    int canh3 = Integer.parseInt(scanner.nextLine());
                    int nuaChuVi = (canh1 + canh2 + canh3) /2;
                    int chuVi = nuaChuVi * 2;
                    int dienTich = (int) Math.sqrt(nuaChuVi * (nuaChuVi - canh1) *(nuaChuVi - canh2) *(nuaChuVi - canh3));
                    System.out.printf("Dien tich %d \n", dienTich);
                    System.out.printf("Chu Vi  %d ", chuVi);
                    break;
                case 2 :
                    System.out.println("Lựa chọn hinh chữ nhật");
                    System.out.println("Nhập giá tri chieuDai");
                    int chieuDai = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhập giá tri chieuRong");
                    int chieuRong = Integer.parseInt(scanner.nextLine());
                    while (chieuRong >= chieuDai){
                        System.out.println("Số nhập ko hợp le");
                        System.out.println("Nhập giá tri chieuDai");
                        chieuDai = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhập giá tri chieuRong");
                        chieuRong = Integer.parseInt(scanner.nextLine());
                    }
                    int chuViHinhChuNhat = (chieuRong + chieuDai) * 2;
                    int dienTichHinhChuNhat = chieuDai * chieuRong;
                    System.out.printf("Dien tich %d \n", dienTichHinhChuNhat);
                    System.out.printf("Chu Vi  %d ", chuViHinhChuNhat);
                    break;
                case 3 :
                    System.out.println("Lựa chọn hinh tròn");
                    System.out.println("Nhập giá tri bán kính");
                    int banKinh = Integer.parseInt(scanner.nextLine());
                    final double PI = 3.14;

                    double chuViHinhTron =  2 * PI * banKinh;
                    double dienTichHinhTron = PI * Math.pow(banKinh, 2);
                    System.out.printf("Dien tich %d ", dienTichHinhTron);
                    System.out.printf("Chu Vi  %d ", chuViHinhTron);
                    break;
                default:
                    System.out.println("Giá trị bạn nhập ko ho tro");

            }
        }while( !(choice >= 1 && choice <= 3));

    }
}
