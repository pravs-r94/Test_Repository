package DatabasesExamples;
import java.sql.Connection;
import java.sql.DriverManager;



public class ConnectDB
{
        public Connection get_connection()
        {
            Connection connection = null;
            String host="localhost";
            String port="5432";
            String db_name="test";
            String username="postgres";
            String password="postgres";
            try
            {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "postgres");
                if (connection != null) {
                    System.out.println("Connection OK");
                } else {
                    System.out.println("Connection Failed");
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return connection;
        }
    }