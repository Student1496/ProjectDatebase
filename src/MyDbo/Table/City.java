package MyDbo.Table;

import java.io.Serializable;

public class City implements Serializable{
    private String city;

    public City() {
        this.city = "NULL";
    }

    public City(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                '}';
    }
}
