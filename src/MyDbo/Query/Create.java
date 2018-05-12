package MyDbo.Query;

import MyDbo.Table.Table;

import java.io.IOException;

public class Create {

    Table table;

    public Create(String tableName) {
        this.table = new Table(tableName);

    }

    public void store() throws IOException {
        try {
            table.storeTable();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
