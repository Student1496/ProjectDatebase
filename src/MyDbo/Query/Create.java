package MyDbo.Query;

import MyDbo.Table.Record;
import MyDbo.Table.Table;

import java.util.List;

public class Create {

    private Table table;
    private Record record;

    public Create(String tableName, List<String> columnsName) {
        this.table = new Table(tableName);
        record= new Record(columnsName);
    }

    public void store() {
        table.createTable(record);
        table.showTable(record);
    }
}
