package OOP;

import java.util.*;

public class Student {
    private String id, name, address;
    private int age;
    private float gpa;
    static ArrayList<Student> listStudent = new ArrayList<Student>();
    static Scanner sc = new Scanner(System.in);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }

    public void add(){
        Student student = new Student();
        System.out.println("Nhap ten sinh vien can them: ");
        student.setName(getScanner().nextLine());
        System.out.println("Nhap tuoi sinh vien can them: ");
        student.setAge(getScanner().nextInt());
        System.out.println("Nhap ma sinh vien can them: ");
        student.setId(getScanner().nextLine());
        System.out.println("Nhap dia chi sinh vien can them: ");
        student.setAddress(getScanner().nextLine());
        System.out.println("Nhap GPA sinh vien can them: ");
        student.setGpa(getScanner().nextFloat());
        listStudent.add(student);
        System.out.println("Danh sach sau khi them: ");
        for(Student student1 : listStudent){
            System.out.println(student1.getName());
        }
    }

    public void editById(){
        System.out.println("Nhap id sinh vien can sua: ");
        String id = getScanner().nextLine();
        for(Student student : listStudent){
            if(student.getId() == id){
                System.out.println("Nhap ten sinh vien: ");
                student.setName(getScanner().nextLine());
                System.out.println("Nhap tuoi sinh vien: ");
                student.setAge(getScanner().nextInt());
                System.out.println("Nhap ma sinh vien: ");
                student.setId(getScanner().nextLine());
                System.out.println("Nhap dia chi sinh vien: ");
                student.setAddress(getScanner().nextLine());
                System.out.println("Nhap GPA sinh vien: ");
                student.setGpa(getScanner().nextFloat());
            }
        }
    }

    public void deleteById(){
        System.out.println("Nhap id sinh vien can xoa: ");
        String id = getScanner().nextLine();
        for(Student student : listStudent){
            if(student.getId() == id){
                listStudent.remove(student);
            }
        }
    }

    public void sortByGpa(){
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if(student1.getGpa() < student2.getGpa()){
                    return -1;
                }
                else if(student1.getGpa() == student2.getGpa()){
                    return 0;
                }
                else{
                    return 1;
                }
            }
        });
    }

    public void sortByName(){
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getName().compareTo(student2.getName());
            }
        });
    }

    public void showStudent(){
        for(Student student : listStudent){
            System.out.print("Ten: " + student.getName() + "\n");
            System.out.print("Tuoi: " + student.getAge() + "\n");
            System.out.print("ID: " + student.getId() + "\n");
            System.out.print("Address: " + student.getAddress() + "\n");
            System.out.print("GPA: " + student.getGpa() + "\n");
            System.out.println("*   *   *"  );
        }
    }

    public void showMenu(){
        System.out.println("1. Add student");
        System.out.println("2. Edit student by id");
        System.out.println("3. Delete student by id");
        System.out.println("4. Sort student by gpa");
        System.out.println("5. Sort student by name");
        System.out.println("6. Show student");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        Student student = new Student();
        int option;
        student.showMenu();
        System.out.println("nhap lua chon: ");
        option = getScanner().nextInt();
        switch (option){
            case 0:
                System.exit(0);
            case 1:
                student.add();
                break;
            case 2:
                student.editById();
                break;
            case 3:
                student.deleteById();
                break;
            case 4:
                student.sortByGpa();
                break;
            case 5:
                student.sortByName();
                break;
            case 6:
                student.showStudent();
                break;
        }
    }
}
