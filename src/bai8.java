import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        boolean SNT = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap vao so nguyen n: ");
            n = sc.nextInt();
            if(n <= 0 || n >= 1000){
                System.out.println("Moi nhap lai n: ");
            }
        }while (n >= 1000 || n <= 0);
        for(int i = 3; i < n; i++){
            SNT = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    SNT = false;
                }
            }
            if(SNT == true) sum += i;
        }
        System.out.println("Tong cac so nguyen to tu 0 - n la: " + (sum+2));
    }
}
