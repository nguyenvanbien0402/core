import java.util.Scanner;
public class bai5 {

    //Một quán karaoke tính tiền khách hàng theo công thức:
    //● Mỗi giờ hát trong 3 giờ đầu tiên có giá: 30.000 VNĐ/giờ
    //● Mỗi giờ tiếp theo có đơn giá bằng 30% đơn giá của 3 giờ đầu tiên
    //● Giá mỗi chai nước là 10.000 VNĐ
    //● Thời gian mở cửa: 9:00 - 24:00 (không qua đêm)
    //● Nếu vào cửa từ lúc 9:00 - 17:00, giảm 20% trên tổng hóa đơn
    //Viết chương trình nhập vào giờ bắt đầu, giờ kết thúc của một (nhóm) khách hàng
    //vào phòng hát, in ra tổng chi phí phải trả cho khách hàng

    public static void main (String [] args) {
        Scanner phim = new Scanner(System.in);
        System.out.println("nhập giờ bắt đầu");
        int begin = phim.nextInt();
        System.out.println("nhập giờ kết thúc");
        int end = phim.nextInt();
        int time = end - begin;
        double bill=0;
        if(time<=3&&begin>=9&&begin<17) {
         bill = (time * 30.000) - (time*30.000*0.2);

        }
        else  if(time>3&&begin>=9&&begin<17) {
          double  bill1 = (90.000+((time-3)*0.3*90.000)) ;
            double down = bill*0.2;
            bill =   bill1 - down;
        }
        else if(time<=3&&begin>17&&begin<24) {
            bill = time*30.000;
        }
        else if(time>3&&begin>=17&&begin<=24) {
        bill = (time -3)*90.000*0.2 + 90.000;
        }

        System.out.println("tổng bill là :" + bill);
    }
}
