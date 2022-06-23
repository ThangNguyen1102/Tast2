import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] maSo = new String[5];
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Nhap vao ma so thu " + (i+1));
            maSo[i] = sc.nextLine();
            if(!maSo[i].matches("00[2-5]L\\d{4}"))
            {
                System.out.println("Sai rồi!");
                return;
            }
        }
        System.out.println("Đúng rồi!");
    }
}
