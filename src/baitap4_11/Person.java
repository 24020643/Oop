package baitap4_11;

public class Person {
    protected String fullName;
    protected String email;

    public Person() {
        this.fullName = "";
        this.email = "";
    }

    public  Person(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
