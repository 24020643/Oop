package baitap4_11;

public class Main {
    public static void main(String[] args) {
        ListSortable<KLTN<Student, Person>> listSortable = new ListSortable<>();
        Student s1 = new Student("A", "a@gmail.com", "24020001");
        Student s2 = new Student("B", "B@gmail.com", "24020002");
        Student s3 = new Student("C", "C2gmail.com", "24020003");
        Teacher t1 = new Teacher("D", "D.uet", "abc111", "Dr.");
        Advisor adv1 = new Advisor("E", "E.uet");

        listSortable.addThesis(new KLTN<>(s1, t1, "AI"));
        listSortable.addThesis(new KLTN<>(s2, adv1, "Blockchain"));
        listSortable.addThesis(new KLTN<>(s3, t1, "Coding"));


        // In ra danh sách sau khi sắp xếp
        System.out.println("Danh sach luan an duoc sap xep:");
        listSortable.print();
    }
}