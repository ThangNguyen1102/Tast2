import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.println("Nhap vao so nguyen duong n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i < n; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("Tong cac so chan trong khoang tu 0 - n la: " + sum);
    }
}
