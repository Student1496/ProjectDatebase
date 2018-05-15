package MyDbo.Table;

import java.io.Serializable;

public class LastName implements Serializable {
    private String lastName;

    public LastName() {
        this.lastName = "NULL";
    }

    public LastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "LastName{" +
                "lastName='" + lastName + '\'' +
                '}';
    }
}
