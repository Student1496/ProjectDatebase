package MyDbo.Statement;

import MyDbo.MyQuery;
import MyDbo.Query.Create;

import java.io.IOException;

public class SubQuery implements MyQuery{

    private String qery;

    public SubQuery(String qery) {
        this.qery = qery;
    }


    @Override
    public void exec() throws IOException {
       String[] subqery = qery.split(" ,()");

        if((subqery[0].equals("CREATE") && subqery[1].equals("TABLE")) || (subqery[0].equals("create")&& subqery[1].equals("TABLE")))
        {
            Create create= new Create(subqery[2]);
            try {
                create.store();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
