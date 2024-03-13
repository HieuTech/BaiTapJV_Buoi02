import java.util.Scanner;


public class KiemTraChiaHet3And5 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuong trình chia hết cho 3 và 5");

        int number;

        do {
            System.out.println("Nhập 1 số bất kì");
            number = scanner.nextInt();
            boolean kiemTraChiaHet3 = number % 3 == 0;
            boolean kiemTraChiaHet5 = number % 5 == 0;
            if (kiemTraChiaHet3 && kiemTraChiaHet5){
                System.out.println("Số chia hết cho 3 và 5");
            } else if ( kiemTraChiaHet3 && !kiemTraChiaHet5){
                System.out.println("Số chia hết cho 3, ko chia hết cho 5");
            }else if ( !kiemTraChiaHet3 && kiemTraChiaHet5){
                System.out.println("Số chia hết cho 3, ko chia hết cho 5");
            }else{
                System.out.println("Số không chia hết cho 3 và ko chia hết cho 5");
            }


        }while(number != 100);



    }
}
