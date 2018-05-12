package MyDbo.Query;

import MyDbo.Table.Table;

public class Create {

    Table table;

    public Create(String tableName) {
        this.table = new Table(tableName);

    }

    public void store() {
        table.createTable();
    }
}
