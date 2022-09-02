import java.util.Scanner;
public class bai1 {

    //●Viết chương trình cho phép nhập vào 3 số tự nhiên, kiểm tra
    //xem 3 số nhập vào được xếp theo thứ tự tăng hay giảm dần
    //hay chưa được sắp xếp

    // giải thuật sử dụng if và else kiểm tra xem số a lớn hn b và c hay không
    // kiểm tra số a nhỏ hn b và c và số b nhỏ hn c hay không
    public static void main(String [] args) {
        System.out.println("nhập số");
        Scanner phim = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<3; i++) {
            arr[i] = phim.nextInt();
        }
        if(arr[0]>arr[1]&&arr[0]>arr[2]&&arr[1]>arr[2]) {
            System.out.println("mảng đã xếp theo chiều giảm dần");
        }
         else  if(arr[0] <arr[1] && arr[0]<arr[2] && arr[1]<arr[2]) {
            System.out.println("mảng đã sắp xếp theo chiều tăng dần") ;
        } else  {
             System.out.println("mảng chưa xếp theo chiều tăng hay giảm");
        }
    }
}
