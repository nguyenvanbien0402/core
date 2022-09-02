import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class bai4 {
    public static void main (String [] args) {
//Viết chương trình cho phép nhập vào 2 string, so sánh xem 2
//string đó có bằng nhau hay không trong hai trường hợp:
//○ Phân biệt hoa thường
//○ Không phân biệt hoa thường


        // ta sử dụng equal để so sánh chữ hoa và thương
        // equalsIgnoreCase
        List<String> list = new ArrayList<>();
        Scanner phim = new Scanner(System.in);
        System.out.println("nhập chuỗi 1 ");
        list.add(phim.nextLine());
        System.out.println("nhập chuỗi 2 ");
        list.add(phim.nextLine());
    if(list.get(0).equals(list.get(1))) {
        System.out.println("hai chuỗi giống nhau");
    }
    else  {
        System.out.println("hai chuỗi khác nhau");
    }

    if(list.get(0).equalsIgnoreCase(list.get(1))) {
        System.out.println("hai chuỗi giống nhau ko kể viết hoa");
    } else  {
        System.out.println("hai chuỗi khác nhau");
    }
    }
}
