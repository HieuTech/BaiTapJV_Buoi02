import java.util.InputMismatchException;
import java.util.Scanner;

public class TinhTongSoChanChoTruoc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuong trình Tính Tổng sồ chẵn cho trước");

        int initValue = 0;
        try {
            System.out.println("Xin mời nhập giá trị đầu");
            int firstValue = Integer.parseInt(scanner.nextLine());
            System.out.println("Xin mời nhập giá trị cuối");
            int lastValue = Integer.parseInt(scanner.nextLine());
            int lengthValue = lastValue - firstValue;
            while(lastValue <= firstValue){
                System.out.println("Giá trị ko hợp lệ");
            };
            System.out.println("lengthValue" + lengthValue);
            for (int i = 0; i <= lengthValue ; i++) {

                if(firstValue % 2 == 0){
                    initValue  += firstValue;

                }

                firstValue ++;

            }
            System.out.println("result" + initValue);

        }catch (InputMismatchException e){
            System.out.println("Bạn phải nhập số");
        }
    }
}
