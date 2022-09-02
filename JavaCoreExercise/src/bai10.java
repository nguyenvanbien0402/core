import java.util.Scanner;
public class bai10 {
    public static boolean snt(int h) {
     int dem = 0;
        for(int i =1; i<=h; i++) {
            if(h%i==0) {
              dem++;
            }
        } if (dem==2) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String [] args) {


        Scanner phim = new Scanner(System.in);
        //0. Viết chương trình cho phép nhập vào số tự nhiên n, in ra tổng các số nguyên tố
        //từ 1 đến n,

        System.out.println("nhập số cần kiểm tra");
        int n = phim.nextInt();
        int dem=0;
        for(int i=1; i<=n; i++) {

            if(snt(i))
            System.out.println("số nguyên tố trong n là :"  + i);
        }
    }
}
