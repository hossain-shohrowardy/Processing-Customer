import Connection.DataBaseConnection;
import Model.CustomerInfo;
import Service.ExportCustomersFileService;
import Service.FilterCustomerService;
import Service.StoreCustomerService;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        long startTime = System.currentTimeMillis();
        // Connect to mysql database
        Connection connection =DataBaseConnection.createConnection();
        connection.setAutoCommit(false);

        // Validate and filter valid and invalid customers from the given file
        FilterCustomerService filterCustomerService=new FilterCustomerService();
        HashMap<String, List<CustomerInfo>> filteredCustomers= filterCustomerService.getFilteredValidAndInvalidCustomers();
        List<CustomerInfo> validCustomers=filteredCustomers.get("validCustomer");
        List<CustomerInfo> inValidCustomers=filteredCustomers.get("invalidCustomers");

        // Store valid and invalid customer into database table
        StoreCustomerService storeCustomerService=new StoreCustomerService();
        storeCustomerService.batchInsert(connection,validCustomers,"customer_info");
        storeCustomerService.batchInsert(connection,inValidCustomers,"invalid_customer_info");

        // Close database connection
        connection.close();

        // Export valid and invalid customers in csv file using multi-threading
        ExportCustomersFileService exportCustomersFileService=new ExportCustomersFileService(validCustomers,inValidCustomers);
        exportCustomersFileService.startServiceForValidCustomer();
        exportCustomersFileService.startServiceForInValidCustomer();

        //Count execution time in milliseconds
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken "+ (endTime - startTime) + " ms");




    }


}