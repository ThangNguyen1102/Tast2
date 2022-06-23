import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] soNguyen;
        System.out.println("Nhap vao n:");
        n = sc.nextInt();
        soNguyen = new int[n];
        for (int i = 0; i < n; i++)
        {
            System.out.println("Nhap vao so nguyen:");
            soNguyen[i] = sc.nextInt();
        }
        System.out.println("Mang truoc khi dao nguoc: ");
        for (int i = 0; i < n; i++) System.out.print(soNguyen[i] + " ");
        //dao nguoc mang
        for (int i = 0; i < n/2; i++)
        {
            int temp;
            temp = soNguyen[i];
            soNguyen[i] = soNguyen[n-i-1];
            soNguyen[n-i-1] = temp;
        }
        //mang sau khi dao nguoc
        System.out.println("\nMang sau khi dao nguoc: ");
        for (int i = 0; i < n; i++)
            System.out.print(soNguyen[i] + " ");
    }

}
