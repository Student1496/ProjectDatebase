package MyDbo.Query;

import MyDbo.Table.Table;

public class Delete {
    Table table;

    public Delete(String tableName) {
        this.table =new Table(tableName);
    }

    public void deleteRecord()
    {
        this.table.dropTabel();
    }
}
