import Connection.DataBaseConnection;
import Model.CustomerInfo;
import Service.ExportCustomersFileService;
import Service.FilterCustomerService;
import Service.StoreCustomerService;

import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private Connection connection;
    public static void main(String[] args) throws SQLException, IOException {
        long startTime = System.currentTimeMillis();
        Connection connection =DataBaseConnection.createConnection();
        connection.setAutoCommit(false);
        FilterCustomerService filterCustomerService=new FilterCustomerService();
        HashMap<String, List<CustomerInfo>> filteredCustomers= filterCustomerService.getFilteredValidAndInvalidCustomers();
        List<CustomerInfo> validCustomers=filteredCustomers.get("validCustomer");
        List<CustomerInfo> inValidCustomers=filteredCustomers.get("invalidCustomers");
        System.out.println("valid and customers size : "+validCustomers.size());
        System.out.println("invalid and customers size : "+inValidCustomers.size());
        StoreCustomerService storeCustomerService=new StoreCustomerService();
        storeCustomerService.batchInsert(connection,validCustomers,"customer_info");
        storeCustomerService.batchInsert(connection,inValidCustomers,"invalid_customer_info");
       // connection.commit();
        connection.close();

        ExportCustomersFileService exportCustomersFileService=new ExportCustomersFileService(validCustomers,inValidCustomers);
        exportCustomersFileService.startServiceForValidCustomer();
        exportCustomersFileService.startServiceForInValidCustomer();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken "+ (endTime - startTime) + " ms");




    }


}