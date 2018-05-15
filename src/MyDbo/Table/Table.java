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
        this.table = new ArrayList<Record>();
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
        File file = new File(nameTable+".txt");
        file.delete();
        }

    public void  dropRecord(Record record){
        table.remove(record);
    }

    public void update(Record old ,Record record){
        table.set(table.indexOf(old),record);
    }

    public void createTable(Record record){
        File file = new File(nameTable+".txt");
        try {
            file.createNewFile();
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }

        FileOutputStream fos= null;
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream oos= null;
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Iterator<String> iterator=record.getCoulmnsName().iterator();
        while(iterator.hasNext()){
            try {
                oos.writeObject(iterator.next());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
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

        try {
            Record record=null;
            record=(Record) ois.readObject();
           this.table.add(record);
           }
        catch(Exception e) {}

        ois.close();

    }

    public void showTable()
    {
        Iterator<Record> i=this.table.listIterator();

        while (i.hasNext())
            System.out.println(i.next().toString());

    }

    public void showTable(Record record)
    {
        Iterator<String> i=record.getCoulmnsName().listIterator();

        while (i.hasNext())
            System.out.println(i.next().toString());

    }

    @Override
    public String toString() {
        return "Table{" +
                "nameTable='" + nameTable + '\'' +
                ", table=" + table +
                '}';
    }
}
