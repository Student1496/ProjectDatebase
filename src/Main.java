import MyDbo.Statement.SubQuery;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static public void main(String [] args)
    {
        System.out.println("WELCOME IN DATABASE, ENTER STATEMENT");
        Scanner scanner= new Scanner(System.in);


        while (true)
        {
            String qery=scanner.nextLine();
            SubQuery subQuery= new SubQuery(qery);
            try {
                subQuery.exec();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
