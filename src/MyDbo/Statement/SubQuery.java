package MyDbo.Statement;

import MyDbo.MyQuery;
import MyDbo.Query.*;
import MyDbo.Table.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubQuery implements MyQuery{

    private String qery;

    public SubQuery(String qery) {
        this.qery = qery;
    }


    @Override
    public void exec() throws IOException {
       String[] subqery = qery.split(" ");

        if((subqery[0].equals("CREATE") && subqery[1].equals("TABLE")) || (subqery[0].equals("create")&& subqery[1].equals("table")))
        {
            List<String> namesOfColumns=new ArrayList<String>();

            for(int i=3;i<subqery.length;i++)
                namesOfColumns.add(subqery[i]);

            Create create= new Create(subqery[2],namesOfColumns);
            create.store();
        }else if ((subqery[0].equals("INSERT") && subqery[1].equals("INTO")) || (subqery[0].equals("insert")&& subqery[1].equals("into")))
        {
            List<Record> list= new ArrayList<>();

            if(subqery[3].equals("VALUES") || subqery[3].equals("values"))
            {
                Record record= new Record(new Address(subqery[4]),new BirthDate(subqery[5]),new City(subqery[6]), new FirstName(subqery[8]),new LastName(subqery[9]),new Phone(subqery[10]),new Region(subqery[11]));
                list.add(record);
            }

            Insert insert = new Insert(subqery[2],list);
            insert.insertRecords();
        }else if (subqery[0].equals("SELECT")||subqery[0].equals("select"))
        {
            if(subqery[1].equals("*") && (subqery[2].equals("from") || subqery[2].equals("FROM")))
            {
                Select select=new Select(subqery[3]);
                select.showRecords();
            }

        }else if(subqery[0].equals("DELETE") || (subqery[0].equals("delete")))
        {
            Delete delete=new Delete(subqery[1]);
            delete.deleteRecord();
        }else if((subqery[0].equals("UPDATE") || subqery[0].equals("update")) && (subqery[2].equals("set") || subqery[2].equals("SET")))
        {
            Update update= new Update(subqery[1]);
        }

        else System.out.println("bledne zapytanie");


    }
}
