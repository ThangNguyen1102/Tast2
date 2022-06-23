import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        System.out.println("Nhập vào số nguyên:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= 20; i++)
        {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
