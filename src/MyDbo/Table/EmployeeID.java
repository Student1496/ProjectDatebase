package MyDbo.Table;

import java.io.Serializable;

public class EmployeeID implements Serializable{
    private int employeeID;
    private static int identity;

    public EmployeeID() {
        this.identity=0;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity() {
        this.identity = identity++;
    }

    public int getEmployeeID() {

        return employeeID;
    }

    public void setEmployeeID()
    {
        this.employeeID = identity;
    }

    @Override
    public String toString() {
        return "EmployeeID{" +
                "employeeID=" + employeeID +
                '}';
    }

}
