package MyDbo.Table;

public class EmployeeID {
    private int employeeID;

    public EmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "EmployeeID{" +
                "employeeID=" + employeeID +
                '}';
    }
}
