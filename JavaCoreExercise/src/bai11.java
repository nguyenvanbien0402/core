import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.util.Scanner;
public class bai11 {





    public static void main(String [] args) {
        //13. Viết chương trình cho phép nhập vào số phần tử và từng phần tử của một mảng.
        //Tính:
        //a) Tính giá trị trung bình
        //b) Tìm phần tử lớn nhất, nhỏ nhất
        //c) Tìm phần tử âm lớn nhất, nhỏ nhất trong mảng
        //d) Tìm phần tử dương lớn nhất, nhỏ nhất trong mảng
        //e) In ra các phần tử chẵn, lẻ
        //f) Thêm một phần tử theo index
        //g) Xóa một phần tử theo index


        // tinh trung binh

            Scanner phim = new Scanner(System.in);
            System.out.println("nhâp sô phàn tử của màng");
            int n = phim.nextInt();
            int [] arr = new int [n];
            System.out.println("nhập giá trị từng phần tử của mảng");
            for (int i = 0; i<arr.length; i++) {
                arr[i] = phim.nextInt();
            }

        // tính điểm trung bình
            double tong =0;
            double tb=0;
            for (int i = 0; i< arr.length; i++) {
                tong = tong + arr[i];
                tb = tong / (arr.length);

            } System.out.println("diem trung binh là :" + tb);


            // tính giá trị lớn nhất
            int  max = arr[0];;
            for(int i = 1; i<arr.length; i++) {
                if(arr[i]>max) {
                    max= arr[i];
                }

            } System.out.println("giá trị lớn nhất là : "  + max);


            // tính giá trị nhỏ nhất
        int min = arr[0];
        for(int i = 1; i<arr.length; i++) {
            if(arr[i]<min) {
                 min= arr[i];
            }
        } System.out.println("giá trị nhỏ nhất là :" + min);

        // in ra các phần tử chẵn lẻ trong mảng

        for (int i= 0; i < arr.length; i++)
        { if (arr[i] %2 > 0) {
                 System.out.println("giá trị lẻ là :" + arr[i]);
        } if (arr[i]%2==0)  {
                 System.out.println("giá trị chẵn là : " + arr[i]);
        }
        }
       }
    }

