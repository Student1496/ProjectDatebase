package MyDbo.Table;

import java.io.Serializable;

public class EmployeeID implements Comparable<EmployeeID>,Serializable {
    private String employeeID;

    public EmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "EmployeeID{" +
                "employeeID=" + employeeID +
                '}';
    }

    @Override
    public int compareTo(EmployeeID o) {
        int compare=this.employeeID.compareTo(o.employeeID);
        return  compare==0 ? this.employeeID.compareTo(o.employeeID) :compare;
    }
}
