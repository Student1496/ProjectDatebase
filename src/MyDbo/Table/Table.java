package MyDbo.Table;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Table implements Serializable{

    private String nameTable;
    private List<Record> table;

    public Table(String nameTable) {
        this.nameTable = nameTable;
        this.table = new ArrayList<>();
    }

    public String getNameTable() {
        return nameTable;
    }

    public void setNameTabe(String nameTable) {
        this.nameTable = nameTable;
    }

    public List<Record> getTable() {
        return table;
    }

    public void setTable(List<Record> table) {
        this.table = table;
    }

    public void addRecord(List<Record> list){
        Iterator<Record> i= list.iterator();
        while (i.hasNext())
        table.add(i.next());
    }

    public void dropTabel(){
        table.clear();
    }

    public void  dropRecord(Record record){
        table.remove(record);
    }

    public void update(Record old ,Record record){
        table.set(table.indexOf(old),record);
    }

    public void createTable(){
        File file = new File(nameTable+".txt");
        try {
            file.createNewFile();
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void storeTable() throws IOException {
        File file = new File(nameTable+".txt");
        FileOutputStream fos= new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        Iterator<Record> iterator=table.iterator();
        while(iterator.hasNext()){
            oos.writeObject(iterator.next());
        }

        oos.close();
    }

    public void loadTable() throws IOException, ClassNotFoundException {
        File file = new File(nameTable+".txt");
        FileInputStream fis= new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);

        this.dropTabel();

        try {

            this.table=(ArrayList)ois.readObject();
            ois.close();
        }
        catch(Exception e) {}

    }

    @Override
    public String toString() {
        return "Table{" +
                "nameTable='" + nameTable + '\'' +
                ", table=" + table +
                '}';
    }
}
