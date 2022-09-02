import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class bai6 {
    public static  void main(String [] args) {
        //. Viết chương trình chuyển đổi số từ hệ cơ số 10
        //sang hệ cơ số nhị phân và ngược lại.
        Scanner phim = new Scanner(System.in);
        System.out.println("nhập số");
        int n = phim.nextInt();
        List<Integer > list = new ArrayList<>();
           int du;

        while (n>0) {
            du = n%2;
            n = n/2;
                 if(du>0) {
                     list.add(1);
                 } else {
                     list.add(0);
                 }
        }
        for (int i=list.size()-1; i>=0;i--) {
            System.out.println(list.get(i));
        }
        }
    }

