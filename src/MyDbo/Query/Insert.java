package MyDbo.Query;

import MyDbo.Table.Record;
import MyDbo.Table.Table;

import java.io.IOException;
import java.util.List;

public class Insert {

    Table table;
    List<Record> recordList;

    public Insert(String tabelName, List<Record> recordList) {
        this.table = new Table(tabelName);
        this.recordList=recordList;
    }

    public void insertRecords()
    {
        this.table.addRecord(this.recordList);
        try {
            this.table.storeTable();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("record added");
    }
}
