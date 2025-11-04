package baitap4_11;

public class Teacher extends Person {
    private String id;
    private String title;

    public Teacher() {
        super();
        this.id = "";
        this.title = "";
    }

    public Teacher(String fullName, String email, String id, String title) {
        super(fullName, email);
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Teacher[fullName=" + fullName + ",id=" + id + ",email=" + email + "]";
    }
}
