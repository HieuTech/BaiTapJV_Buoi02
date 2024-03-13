

import java.util.Scanner;

public class ChiSoCanNang {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu cao: m");
        float height = scanner.nextFloat();
        System.out.println("Nhap can nang: kg");
        float weight = scanner.nextFloat();

        double result = weight / (Math.pow(height,2));

        if(result < 18.5){
            System.out.println("Underweight");
        }else if (result >= 18.5 && result <= 25){
            System.out.println("Normal");
        }
        else if (result >= 25 && result <= 30){
            System.out.println("Overweight");
        }else{
            System.out.println("Obese");
        }



        
    }
}