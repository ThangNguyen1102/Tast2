import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char kiTu;
        boolean check = false;
        System.out.println("Nhap vao mot chuoi: ");
        chuoi = sc.nextLine();
        System.out.println("Nhap vao mot ki tu:");
        kiTu = sc.nextLine().charAt(0);
        char mangKiTu[] = chuoi.toCharArray();
        for(int i = 0; i < mangKiTu.length; i++){
            if(kiTu == mangKiTu[i]){
                System.out.println("Co");
                check = true;
            }
        }
        if(check == false){
            System.out.println("Khong");
        }
    }
}
