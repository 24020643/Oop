package baitap4_11;

public class KLTN<T extends Student, V extends Person> implements Comparable<KLTN<T, V>> {
    private T student;
    private V supervisor;
    private String thesisName; // ten luan an tot nghiep cua sinh vien

    public KLTN(T student, V supervisor, String thesisName) {
        this.student = student;
        this.supervisor = supervisor;
        this.thesisName = thesisName;
    }

    public T getStudent() {
        return student;
    }

    public void setStudent(T student) {
        this.student = student;
    }

    public V getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(V supervisor) {
        this.supervisor = supervisor;
    }

    public String getThesisName() {
        return thesisName;
    }

    public void setThesisName(String thesisName) {
        this.thesisName = thesisName;
    }

    @Override
    public int compareTo(KLTN<T, V> o) {
        // So sanh theo chu cai dau ta co the so sanh theo thu tu từ điển là được
        //Phan biet hoa thuong khi so sanh
        //return this.getThesisName().compareTo(o.getThesisName());

        //Khong phan biet hoa thuong khi so sanh
        return this.getThesisName().compareToIgnoreCase(o.getThesisName());
    }
}
