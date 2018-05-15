package MyDbo.Table;

import java.io.Serializable;

public class FirstName implements Serializable {
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
