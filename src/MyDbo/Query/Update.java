package MyDbo.Query;

import MyDbo.Table.Table;

public class Update {
    private Table table ;

    public Update(String tableName) {
        this.table =new Table(tableName);
    }


}
