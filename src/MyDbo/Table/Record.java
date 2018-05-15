package MyDbo.Table;

import java.io.Serializable;

public class Record implements Serializable{
    private Address address;
    private BirthDate birthDate;
    private City city;
    private EmployeeID employeeID;
    private FirstName firstName ;
    private LastName lastName;
    private Phone phone;
    private Region region;

    public Record(Address address, BirthDate birthDate, City city, EmployeeID employeeID, FirstName firstName, LastName lastName, Phone phone, Region region) {
        this.address = address;
        this.birthDate = birthDate;
        this.city = city;
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.region = region;
    }

    public Record(String address, String birthDate, String city, String employeeID, String firstName, String lastName, String phone, String region) {
        this.address =new Address(address);
        this.birthDate =new BirthDate(birthDate);
        this.city =new City(city);
        this.employeeID =new EmployeeID(employeeID);
        this.firstName =new FirstName(firstName);
        this.lastName = new LastName(lastName);
        this.phone =new Phone(phone);
        this.region =new Region(region);
    }


    @Override
    public String toString() {
        return "Record{" + "address=" + address + ", birthDate=" + birthDate + ", city=" + city + ", employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", region=" + region + '}';
    }
}
