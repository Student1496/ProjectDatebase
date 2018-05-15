package MyDbo.Query;

import MyDbo.Table.Table;

public class Delete {
    private Table table;

    public Delete(String tableName) {
        this.table =new Table(tableName);
    }

    public void deleteRecord()
    {
        this.table.dropTabel();
    }
}
