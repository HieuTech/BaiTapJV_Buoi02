import java.util.Scanner;


public class DoiSoThanhChu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Convert Number To Character Program");

        int number;
        do{
            // user input != 100
            System.out.println("Please fill in 1 number ( Range between 0 - 9)");
            number = scanner.nextInt();
            switch (number){
                case 1 :
                    System.out.println(" Số một ");
                    break;
                case 2 :
                    System.out.println(" Số hai ");
                    break;
                case 3 :
                    System.out.println("Số ba");
                    break;
                case 4 :
                    System.out.println("Số bốn");
                    break;
                default :
                    System.out.println("Số ban nhập ko support");
                    break;
            }

        }while (number != 100);



}}
