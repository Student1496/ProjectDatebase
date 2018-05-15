package MyDbo.Query;

import MyDbo.Table.Table;

import java.io.IOException;

public class Select {
    private Table table;

    public Select(String tabelName) {
        this.table = new Table(tabelName);
    }

    public void showRecords()
    {
        try {
            table.loadTable();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        table.showTable();
    }
}
