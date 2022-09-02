import java.util.Scanner;
public class bai3 {
    public static void main (String [] args) {
        //Viết chương trình cho phép người dùng nhập vào 10 số tự
        //nhiên, và lưu vào 1 mảng. Kiểm tra xem phần tử thứ i và 9-i có
        //giống nhau hay không (i từ 0 đến 9)
        Scanner phim = new Scanner(System.in);
        int [] arr = new int[10];
        System.out.println("nhập giá trị của mảng");

        for (int i = 0; i<arr.length; i++) {
            arr[i] = phim.nextInt();
        }


         if (arr[0]==arr[9]) {
             System.out.println(" 2 giá trị giống nhau");
         } else
         {
             System.out.println("2 giá trị khác nhau");
         }


    }
}
