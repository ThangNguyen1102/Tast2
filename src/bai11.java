import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] soNguyen;
        float average = 0;
        System.out.println("Nhap vao n: ");
        n = sc.nextInt();
        soNguyen = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhap vao so nguyen thu " + i + ": ");
            soNguyen[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            average += soNguyen[i];
        }
        System.out.println("Trung binh cong cac so nguyen la: " + (average/n));
    }
}
