import java.util.Scanner;
public class bai7 {
    public static void main(String [] args) {
        Scanner phim =new Scanner(System.in);
    //4. Viết chương trình cho phép nhập vào một số tự nhiên và in ra tổng các chữ số
        //của số tự nhiên đó
        System.out.println("nhập vào số tự nhiên ");
        int n = phim.nextInt();
        int tong =0;
        int du;

       do {
           du = n%10;
           n = n/10;
           tong = tong + du;
       }while (n>0);
        System.out.println("tổng là : " +tong );
    }
}
