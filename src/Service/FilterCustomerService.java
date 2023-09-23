package Service;

import Model.CustomerInfo;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;

public class FilterCustomerService {

    public HashMap<String, List<CustomerInfo>> getFilteredValidAndInvalidCustomers(){
        HashMap<String, List<CustomerInfo>> validAndInvalidCustomers=new HashMap<String,List<CustomerInfo>>();
        LinkedHashMap<String,CustomerInfo> invalidCustomerHashMap=new LinkedHashMap<String,CustomerInfo>();
        LinkedHashMap<String,CustomerInfo> validCustomerHashMap=new LinkedHashMap<String,CustomerInfo>();
        String filePath="E:\\CMED Task\\1M-customers.txt";
        try{
            File file=new File(filePath);
            InputStream inputStream=new BufferedInputStream(new FileInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            Integer c=0;
            while ((line=reader.readLine())!=null && !line.isEmpty()) {
                c++;
                System.out.println(c);
                String email="";
                String phoneNumber="";
                int validateStatus=0;
                CustomerInfo customerInfo=readEachLineOfFile(line);
                email=customerInfo.getEmail();
                phoneNumber=customerInfo.getPhoneNumber();
                validateStatus=validate(phoneNumber,email);
                if(validateStatus==0){
                    invalidCustomerHashMap.put(customerInfo.getEmail(),customerInfo);
                }
                else{
                    validCustomerHashMap.put(customerInfo.getEmail(),customerInfo);
                }

            }
            List<CustomerInfo> filteredInValidCustomers=List.copyOf(invalidCustomerHashMap.values());
            List<CustomerInfo> filteredValidCustomers=List.copyOf(validCustomerHashMap.values());
            validAndInvalidCustomers.put("validCustomer",filteredValidCustomers);
            validAndInvalidCustomers.put("invalidCustomers",filteredInValidCustomers);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return validAndInvalidCustomers;
    }

    public CustomerInfo readEachLineOfFile(String line){
        CustomerInfo customer=new CustomerInfo();
        String[] eachLineArr=line.split(",");
        if(eachLineArr.length>=1){
            customer.setName(eachLineArr[0]);
        }
        if(eachLineArr.length>=2){
            customer.setBranch(eachLineArr[1]);
        }
        if(eachLineArr.length>=3){
            customer.setCity(eachLineArr[2]);
        }
        if(eachLineArr.length>=4){
            customer.setShot_form(eachLineArr[3]);
        }
        if(eachLineArr.length>=5){
            customer.setCode(eachLineArr[4]);
        }
        if(eachLineArr.length>=6){
            customer.setPhoneNumber(eachLineArr[5]);
        }
        if(eachLineArr.length>=7){
            customer.setEmail(eachLineArr[6]);
        }
        if(eachLineArr.length>=8){
            customer.setIpAddress(eachLineArr[7]);
        }

        return customer;
    }
    public int validate( String phoneNumber,String email){
        int status=0;
        Pattern phoeNumberPattern = Pattern.compile("^(\\d{1,1}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$");
        //Pattern phoeNumberPattern = Pattern.compile("\\([4-6]{1}[0-9]{2}\\) [0-9]{3}\\-[0-9]{4}$");
        Pattern emailAddressPatten =  Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        if(phoeNumberPattern.matcher(phoneNumber).matches() && emailAddressPatten.matcher(email).matches()){
            status=1;
        }
        else{
            status=0;
        }
        return status;


    }
}
