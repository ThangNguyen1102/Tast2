import java.util.Scanner;

public class bai9 {
    public static int Fn(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        return Fn(n - 1) + Fn(n - 2);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so nguyen n: ");
            n = sc.nextInt();
            if(n < 0 || n > 20){
                System.out.println("Moi nhap lai n: ");
            }
        }while (n > 20 || n < 0);
        System.out.println("So Fibonacci ung voi n la: " + Fn(n));
    }
}
