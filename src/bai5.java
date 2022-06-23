import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        String MSSV;
        System.out.println("Nhap vao ma so sinh vien: ");
        Scanner sc = new Scanner(System.in);
        MSSV = sc.nextLine();
        if (MSSV.matches("B\\d{7}"))
            System.out.println("True");
        else
            System.out.println("Flase");
    }
}
