import java.util.Scanner;

public class TimSoNguyenDuong {


    public static void main(String[] args) {

      int number = 1;
      boolean isValue = false;
      while(true){
          if( (number % 5 ==0) && (number % 7 == 0) && (number % 11 == 0) ){
              System.out.printf("So nguyen duong nho nhat chia het chia 5 7 11: %d ", number);
              isValue = true;
          }
          else{
              number ++;
          }
          if(isValue){
              break;
          }
      }
        
        

       


    }

}
