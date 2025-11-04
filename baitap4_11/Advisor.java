package baitap4_11;

public class Advisor extends Person {
    public Advisor() {
        super();
    }

    public Advisor(String fullName, String email) {
        super(fullName, email);
    }

    @Override
    public String toString() {
        return "baitap4_11.Advisor[fullName=" + this.fullName + ",emial=" + this.email + "]";
    }
}
