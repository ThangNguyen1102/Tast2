import java.util.Scanner;

public class bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        System.out.println("Nhap vao mot chuoi: ");
        chuoi = sc.nextLine();
        if(chuoi.matches("^[A-Z][^\\s]{0,18}\\d$"))
            System.out.println("Duyệt");
        else
            System.out.println("Không duyệt");
    }
}
