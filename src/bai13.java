import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] soNguyen;
        int min = 0;
        System.out.println("Nhap vao n:");
        n = sc.nextInt();
        soNguyen = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhap vao so nguyen:");
            soNguyen[i] = sc.nextInt();
        }
        min = soNguyen[0];
        for (int i = 0; i < n; i++)
        {
            if(soNguyen[i] < min)
                min = soNguyen[i];
        }
        System.out.println("Phan tu co gia tri nho nhat la: " + min);
    }
}
