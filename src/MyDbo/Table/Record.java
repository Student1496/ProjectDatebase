package MyDbo.Table;

import java.io.Serializable;
import java.util.List;

public class Record implements Serializable{
    private Address address;
    private BirthDate birthDate;
    private City city;
    private EmployeeID employeeID;
    private FirstName firstName ;
    private LastName lastName;
    private Phone phone;
    private Region region;
    private List<String> coulmnsName;

    public Record(List<String> columnsName){
        this.coulmnsName=columnsName;

        if(coulmnsName.contains(new String("Address")))
            this.address= new Address();
        else if (coulmnsName.contains(new String("BirthDate")))
            this.birthDate= new BirthDate();
        else if (coulmnsName.contains(new String("City")))
            this.city= new City();
        else if (columnsName.contains(new String("FirstName")))
            this.firstName= new FirstName();
        else if (columnsName.contains(new String("LastName")))
            this.lastName=new LastName();
        else if (columnsName.contains(new String("Phone")))
            this.phone=new Phone();
        else if (coulmnsName.contains(new String("Region")))
            this.region=new Region();
    }

    public Record(Address address, BirthDate birthDate, City city, FirstName firstName, LastName lastName, Phone phone, Region region) {
        this.address = address;
        this.birthDate = birthDate;
        this.city = city;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.region = region;
    }

    public Record(String address, String birthDate, String city, String firstName, String lastName, String phone, String region) {
        this.address =new Address(address);
        this.birthDate =new BirthDate(birthDate);
        this.city =new City(city);
        this.employeeID =new EmployeeID();
        this.firstName =new FirstName(firstName);
        this.lastName = new LastName(lastName);
        this.phone =new Phone(phone);
        this.region =new Region(region);
    }

    public List<String> getCoulmnsName() {
        return coulmnsName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public BirthDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(BirthDate birthDate) {
        this.birthDate = birthDate;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public EmployeeID getEmployeeID() {
        return employeeID;
    }

    public FirstName getFirstName() {
        return firstName;
    }

    public void setFirstName(FirstName firstName) {
        this.firstName = firstName;
    }

    public LastName getLastName() {
        return lastName;
    }

    public void setLastName(LastName lastName) {
        this.lastName = lastName;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "Record{" + "address=" + address + ", birthDate=" + birthDate + ", city=" + city + ", employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", region=" + region + '}';
    }
}
