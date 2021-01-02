/*
package DatabasesExamples;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadValue
{
    public static void main(String[] args)
    {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs=null;

        ConnectDB obj = new ConnectDB();
        connection = obj.get_connection();
        try
        {
            STRING SNAME;
            here take user input in sname
                wip or 1=1
            String query = "select * from stock where sname = 'wipor1=1'"
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            while(rs.next())
            {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
*/
