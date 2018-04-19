package MyDbo.Table;

public class FirstName {
    private String firstName;

    public FirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "FirstName{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
