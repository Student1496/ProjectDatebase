package MyDbo.Table;

public class Record {
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


    @Override
    public String toString() {
        return "Record{" + "address=" + address + ", birthDate=" + birthDate + ", city=" + city + ", employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone + ", region=" + region + '}';
    }
}
