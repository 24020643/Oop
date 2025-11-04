package baitap4_11;

public class Student extends Person {
    private String id;

    public Student(String id) {
        super();
        this.id = id;
    }

    public Student(String fullName, String email, String id) {
        super(fullName, email);
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "baitap4_11.Student[fullName=" + fullName + ",id=" + id + ",email=" + email + "]";
    }
}
