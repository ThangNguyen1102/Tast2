import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen: ");
        int soNguyen = scanner.nextInt();
        if(soNguyen == 0){
            System.out.println("Đây là số nguyên.");
        }
        else if(soNguyen > 0){
            System.out.println("Đây là số nguyên dương.");
        }
        else {
            System.out.println("Đây là số nguyên âm.");
        }
    }
}
