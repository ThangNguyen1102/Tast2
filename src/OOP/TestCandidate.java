package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCandidate {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Candidate> candidates = new ArrayList<Candidate>();

    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    public void input(){
        int n;
        System.out.println("Nhap vao so thi sinh: ");
        n = getScanner().nextInt();
        for(int i = 0; i < n; i++){
            Candidate candidate = new Candidate();
            System.out.print("Nhap ma: ");
            candidate.setCode(getScanner().nextLine());
            System.out.print("Nhap ten: ");
            candidate.setName(getScanner().nextLine());
            System.out.print("Nhap ngay thang nam sinh: ");
            candidate.setDate(getScanner().nextLine());
            System.out.print("Nhap diem toan: ");
            candidate.setMathScore(getScanner().nextFloat());
            System.out.print("Nhap diem van: ");
            candidate.setLiteratureScore(getScanner().nextFloat());
            System.out.print("Nhap diem tieng anh: ");
            candidate.setEnglishScore(getScanner().nextFloat());
            candidates.add(candidate);
        }
    }

    public void showInfo(){
        for(Candidate candidate : candidates){
            if(candidate.getEnglishScore() + candidate.getMathScore() + candidate.getLiteratureScore() > 1){
                System.out.println("Ten thi sinh: " + candidate.getName());
                System.out.println("Ma thi sinh: " + candidate.getCode());
                System.out.println("Ngay thang nam sinh thi sinh: " + candidate.getDate());
                System.out.println("Diem Toan thi sinh: " + candidate.getMathScore());
                System.out.println("Diem Van thi sinh: " + candidate.getLiteratureScore());
                System.out.println("Diem Tieng Anh thi sinh: " + candidate.getEnglishScore());
            }
        }
    }

    public static void main(String[] args) {
        TestCandidate testCandidate = new TestCandidate();
        testCandidate.input();
        testCandidate.showInfo();
    }
}
