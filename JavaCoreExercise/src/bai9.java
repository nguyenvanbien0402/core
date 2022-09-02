import java.util.Scanner;

public class bai9 {
    public static void main(String [] args) {
      //  Viết chương trình cho phép nhập vào một số tự nhiên và in ra các ước số của số
        //        tự nhiên đó.

        Scanner phim = new Scanner(System.in);
        System.out.println("nhập số tự nhiên đó");
        int number = phim.nextInt();

        for(int i=1; i<number; i++) {
            if(number % i==0) {
                System.out.println("ước số của số tự nhiên đó là :" + i);
            }
        }
    }
}
