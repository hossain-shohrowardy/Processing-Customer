package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
    private final static String dbUrl="jdbc:mysql://localhost:3306/customer_processing";
    private final static  String user="root";
    private  final static String password="";
    private static Connection connection=null;
    private DataBaseConnection(){

    }
    public static Connection createConnection(){

        try{
            if(connection==null){
                connection = DriverManager.getConnection(dbUrl,user,password);
                System.out.println("connected");
            }


        }
        catch (Exception e){
            System.out.println(e);

        }
        return connection;
    }
}
