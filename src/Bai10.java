import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] MSSV = new String[5];
        for(int i = 0; i < MSSV.length; i++){
            System.out.println("Nhap vao MSSV " + (i+1) + ": ");
            MSSV[i] = sc.nextLine();
        }
        for(int i = 0; i < MSSV.length; i++){
            if(MSSV[i].matches("B170[1-9]{4}")){
                System.out.println("MSSV " + (i+1) + " : true.");
            }
            else{
                System.out.println("MSSV " + (i+1) + " : flase.");
            }
        }
    }
}
