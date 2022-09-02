import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class bai8 {
    //Viết chương trình cho phép nhập vào một chuỗi, in ra chuỗi theo thứ tự ngược lại
    //(VD: nhập vào Cybersoft, in ra tfosrebyC)
    public static void main (String [] args) {
        Scanner phim = new Scanner(System.in);
        System.out.println("nhâp  giá trị của chuỗi");
        String n = phim.nextLine();

        for(int i = n.length()-1; i>=0; i--) {
            System.out.println(n.charAt(i));
        }
    }
}
