import java.util.Scanner;
public class bai2 {
    public static void main (String [] args) {

    // Viết chương trình cho phép nhập vào 1 số tự nhiên, đếm số chữ
        //số của số tự nhiên này.

        // giải thật chia lấy nguyên cho  , tạo một biến đếm tăng , mỗi lần chia chia biến
        // đếm sẽ tăng lên 1 đơn vị
        int number;
       do {
           System.out.println("nhập số");
           Scanner phim = new Scanner(System.in);
           number = phim.nextInt();
       } while (number<0);

       int dem = 0;
       while (number>0) {
           number= number/10;
           // mỗi lần chia đếm tăng lên 1
           dem++;
       }
       System.out.println("số các chữ số là : " + dem);
    }
}
