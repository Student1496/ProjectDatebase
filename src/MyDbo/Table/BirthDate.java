package MyDbo.Table;

import java.io.Serializable;

public class BirthDate implements Serializable{
    private String birthDate;

    public BirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "BirthDate{" +
                "birthDate='" + birthDate + '\'' +
                '}';
    }
}
