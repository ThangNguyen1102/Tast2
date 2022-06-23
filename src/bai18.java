import java.util.Scanner;

public class bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        System.out.println("Nhap vao mot chuoi: ");
        chuoi = sc.nextLine();
        if (chuoi.matches(".*\\d.*"))
            System.out.println("Co");
        else
            System.out.println("Khong");
    }
}
