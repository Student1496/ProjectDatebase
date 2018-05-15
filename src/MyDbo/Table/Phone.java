package MyDbo.Table;

import java.io.Serializable;

public class Phone implements Serializable{
    private String phone;

    public Phone() {
        this.phone = "NULL";
    }

    public Phone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone='" + phone + '\'' +
                '}';
    }
}
