package MyDbo.Table;

import java.util.Map;
import java.util.TreeMap;

public class Table {

    private String nameTabe;
    private Map<EmployeeID,Record> table;

    public Table(String nameTabe) {
        this.nameTabe = nameTabe;
        this.table = new TreeMap<EmployeeID,Record>();
    }

    public String getNameTabe() {
        return nameTabe;
    }

    public void setNameTabe(String nameTabe) {
        this.nameTabe = nameTabe;
    }

    public Map<EmployeeID, Record> getTable() {
        return table;
    }

    public void setTable(Map<EmployeeID, Record> table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "Table{" +
                "nameTabe='" + nameTabe + '\'' +
                ", table=" + table +
                '}';
    }
}
