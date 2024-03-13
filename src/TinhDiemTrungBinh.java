import java.util.InputMismatchException;
import java.util.Scanner;

public class TinhDiemTrungBinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuong trình Tinh Diem Trung Binh");

        try {
            String continuos;
           do{

               System.out.println("Xin mời nhập điểm Toán");
               float diemToan = Float.parseFloat(scanner.nextLine());
               while ( (diemToan <= 0 || diemToan >= 10)) {
                   System.out.println("diemToan ko hợp le, nhập lại diemToan");
                   diemToan = Float.parseFloat(scanner.nextLine());
               }

               System.out.println("Xin mời nhập điểm Lý");
               float diemLy = Float.parseFloat(scanner.nextLine());
               while ( (diemLy <= 0 || diemLy >= 10)) {
                   System.out.println("điểm Lý ko hợp le, nhập lại điểm lý");
                   diemLy = scanner.nextFloat();
               }

               System.out.println("Xin mời nhập điểm Hóa");
               float diemHoa = Float.parseFloat(scanner.nextLine());
               while ( (diemHoa <= 0 || diemHoa >= 10)) {
                   System.out.println("diemHoa ko hợp le, nhập lại diemHoa");
                   diemHoa = Float.parseFloat(scanner.nextLine());
               }

               System.out.println("Xin mời nhập điểm Anh");
               float diemAnh = Float.parseFloat(scanner.nextLine());
               while ( (diemAnh <= 0 || diemAnh >= 10)) {
                   System.out.println("diemAnh ko hợp le, nhập lại diemAnh");
                   diemAnh = Float.parseFloat(scanner.nextLine());
                   scanner.nextLine();
               }

               System.out.println("Xin mời nhập điểm Văn");
               float diemVan = Float.parseFloat(scanner.nextLine());
               while ( (diemVan <= 0 || diemVan >= 10)) {
                   System.out.println("diemVan ko hợp le, nhập lại diemVan");
                   diemVan = Float.parseFloat(scanner.nextLine());
               }



               float diemTrungBinh = (diemToan + diemAnh + diemHoa + diemLy + diemVan) / 5;
               if( diemTrungBinh >= 0 && diemTrungBinh <= 5){
                   System.out.println("Xep loai yeu");
               }
               else if( diemTrungBinh >= 5 && diemTrungBinh <= 6.5){
                   System.out.println("Xep loai Trung Binh");
               }
               else if( diemTrungBinh >= 6.5 && diemTrungBinh <= 8){
                   System.out.println("Xep loai Kha");
               }
               else if( diemTrungBinh >= 8 && diemTrungBinh <= 9){
                   System.out.println("Xep loai Gioi");
               }else{
                   System.out.println("Xep loai Xuat Sac");
               }

               System.out.println("Nếu muốn tiếp tục chương trình, type yes,if no type no");

               continuos = scanner.nextLine();

           }while (continuos.equals("yes"));

        } catch (
                InputMismatchException e) {
            System.out.println("Khong hop le. Ban phai nhap mot so.");
        }
    }


}
