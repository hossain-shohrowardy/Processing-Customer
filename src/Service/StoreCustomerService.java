package Service;

import Model.CustomerInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StoreCustomerService {
    private Connection connection;
    private PreparedStatement preparedStatement;

    public  void batchInsert(Connection connection, List<CustomerInfo> customers, String tableName) throws SQLException {
        Integer c=0;
        preparedStatement= connection.prepareStatement("INSERT INTO "+tableName+" (name,branch,city,shot_form,code,email,phone_no,ip_address) VALUES(?,?,?,?,?,?,?,?)");
        for(int i=0; i < customers.size(); i++){
            c++;
            System.out.println(c);
            preparedStatement.setString(1,customers.get(i).getName());
            preparedStatement.setString(2,customers.get(i).getBranch());
            preparedStatement.setString(3,customers.get(i).getCity());
            preparedStatement.setString(4,customers.get(i).getShot_form());
            preparedStatement.setString(5,customers.get(i).getCode());
            preparedStatement.setString(6,customers.get(i).getEmail());
            preparedStatement.setString(7,customers.get(i).getPhoneNumber());
            preparedStatement.setString(8,customers.get(i).getIpAddress());
            preparedStatement.addBatch();
            if ((i+1) >= 10 || (i+1)%10==0 || (i+1)==customers.size()){
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            }
        }
        connection.commit();
      //  connection.close();

    }
}
