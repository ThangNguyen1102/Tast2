import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int[] soNguyen;
        int max = 0;
        System.out.println("Nhap vao n:");
        n = sc.nextInt();
        soNguyen = new int[n];
        for (int i = 0; i < n; i++)
        {
            do {
                System.out.println("Nhap vao so nguyen duong:");
                soNguyen[i] = sc.nextInt();
                if(soNguyen[i] <= 0){
                    System.out.println("moi nhap lai!");
                }
            }while(n <= 0);
        }
        for (int i = 0; i < n; i++)
        {
            if(soNguyen[i] > max)
                max = soNguyen[i];
        }
        System.out.println("Phan tu co gia tri lon nhat la: " + max);
    }
}
