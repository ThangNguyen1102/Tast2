import java.util.Scanner;

public class bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        int soLan = 0;
        System.out.println("Nhap vao mot chuoi: ");
        chuoi = sc.nextLine();
        char mangKiTu[] = chuoi.toCharArray();
        for (int i = 0; i < mangKiTu.length; i++)
        {
            if ('a' == mangKiTu[i])
            {
                soLan++;
            }
        }
        System.out.println("So lan a xuat hien: " + soLan);
    }
}
