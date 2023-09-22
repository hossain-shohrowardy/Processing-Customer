package Service;

import Model.CustomerInfo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

public class ExportCustomersFileService {
    private List<CustomerInfo> validCustomers;
    private List <CustomerInfo> inValidCustomers;
    private StringBuilder invalidCustomerPage1=new StringBuilder();
    private StringBuilder invalidCustomerPage2=new StringBuilder();
    private StringBuilder invalidCustomerPage3=new StringBuilder();
    private StringBuilder invalidCustomerPage4=new StringBuilder();
    private StringBuilder invalidCustomerPage5=new StringBuilder();
    private StringBuilder invalidCustomerPage6=new StringBuilder();
    private StringBuilder invalidCustomerPage7=new StringBuilder();
    private StringBuilder invalidCustomerPage8=new StringBuilder();
    private StringBuilder invalidCustomerPage9=new StringBuilder();
    private StringBuilder invalidCustomerPage10=new StringBuilder();

    private StringBuilder validCustomerPage1=new StringBuilder();
    private StringBuilder validCustomerPage2=new StringBuilder();
    private StringBuilder validCustomerPage3=new StringBuilder();
    private StringBuilder validCustomerPage4=new StringBuilder();
    private StringBuilder validCustomerPage5=new StringBuilder();
    private StringBuilder validCustomerPage6=new StringBuilder();
    private StringBuilder validCustomerPage7=new StringBuilder();
    private StringBuilder validCustomerPage8=new StringBuilder();
    private StringBuilder validCustomerPage9=new StringBuilder();
    private StringBuilder validCustomerPage10=new StringBuilder();

    private static String filePath="E:\\CMED Task\\";

    public ExportCustomersFileService(){

   }
   public ExportCustomersFileService(List<CustomerInfo> validCustomers, List <CustomerInfo> inValidCustomers){
       this.validCustomers=validCustomers;
       this.inValidCustomers=inValidCustomers;

   }
    public void startServiceForValidCustomer(){
        Integer validCustomersSize=this.validCustomers.size();
        Thread t11=new Thread(new Runnable() {
            Integer index=getActualIndexToWriteFile(validCustomersSize,100000);

            @Override
            public void run() {
                try{
                    for(int i=0; i<100000 && i<validCustomersSize;i++){
                        CustomerInfo customer=validCustomers.get(i);
                        validCustomerPage1=getEachPageData(validCustomerPage1,customer);
                        if(i==index){

                            File file=new File(filePath+"validCustomers-page1.CSV");
                            Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                            writer.write(validCustomerPage1.toString());
                            writer.close();
                        }

                    }

                }
                catch (Exception e){
                    System.out.println(e);
                }

            }
        });

        Thread t12=new Thread(new Runnable() {
            Integer index=getActualIndexToWriteFile(validCustomersSize,200000);
            @Override
            public void run() {
                try{
                    for(int j=100000; j<200000 && j<validCustomersSize;j++){
                        CustomerInfo customer=validCustomers.get(j);
                        validCustomerPage2=getEachPageData(validCustomerPage2,customer);
                        if(j==index){
                            File file=new File(filePath+"validCustomers-page2.CSV");
                            Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                            writer.write(validCustomerPage2.toString());
                            writer.close();
                        }

                    }

                }
                catch (Exception e){
                    System.out.println(e);
                }

            }
        });
        Thread t13=new Thread(new Runnable() {
            Integer index=getActualIndexToWriteFile(validCustomersSize,300000);
            @Override
            public void run() {
                try{
                    for(int k=200000; k<300000 && k<validCustomersSize;k++){
                        CustomerInfo customer=validCustomers.get(k);
                        validCustomerPage3=getEachPageData(validCustomerPage3,customer);
                        if(k==index){
                            File file=new File(filePath+"validCustomers-page3.CSV");
                            Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                            writer.write(validCustomerPage3.toString());
                            writer.close();
                        }

                    }

                }
                catch (Exception e){
                    System.out.println(e);
                }

            }
        });

        Thread t14=new Thread(new Runnable() {
            Integer index=getActualIndexToWriteFile(validCustomersSize,400000);
            @Override
            public void run() {
                try{
                    for(int l=300000; l<400000 && l<validCustomersSize;l++){
                        CustomerInfo customer=validCustomers.get(l);
                        validCustomerPage4=getEachPageData(validCustomerPage4,customer);
                        if(l==index){
                            File file=new File(filePath+"validCustomers-page4.CSV");
                            Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                            writer.write(validCustomerPage4.toString());
                            writer.close();
                        }

                    }

                }
                catch (Exception e){
                    System.out.println(e);
                }

            }
        });

        Thread t15=new Thread(new Runnable() {
            Integer index=getActualIndexToWriteFile(validCustomersSize,500000);
            @Override
            public void run() {
                try{
                    for(int m=400000; m<500000 && m<validCustomersSize;m++){
                        CustomerInfo customer=validCustomers.get(m);
                        validCustomerPage5=getEachPageData(validCustomerPage5,customer);
                        if(m==index){
                            File file=new File(filePath+"validCustomers-page5.CSV");
                            Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                            writer.write(validCustomerPage5.toString());
                            writer.close();
                        }

                    }

                }
                catch (Exception e){
                    System.out.println(e);
                }

            }
        });

        Thread t16=new Thread(new Runnable() {
            Integer index=getActualIndexToWriteFile(validCustomersSize,600000);
            @Override
            public void run() {
                try{
                    for(int n=500000; n<600000 && n<validCustomersSize;n++){
                        CustomerInfo customer=validCustomers.get(n);
                        validCustomerPage6=getEachPageData(validCustomerPage6,customer);
                        if(n==index){
                            File file=new File(filePath+"validCustomers-page6.CSV");
                            Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                            writer.write(validCustomerPage6.toString());
                            writer.close();
                        }

                    }

                }
                catch (Exception e){
                    System.out.println(e);
                }

            }
        });

        Thread t17=new Thread(new Runnable() {
            Integer index=getActualIndexToWriteFile(validCustomersSize,700000);
            @Override
            public void run() {
                try{
                    for(int o=600000; o<700000 && 0<validCustomersSize;o++){
                        CustomerInfo customer=validCustomers.get(o);
                        validCustomerPage7=getEachPageData(validCustomerPage7,customer);
                        if(o==index){
                            File file=new File(filePath+"validCustomers-page7.CSV");
                            Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                            writer.write(validCustomerPage7.toString());
                            writer.close();
                        }

                    }

                }
                catch (Exception e){
                    System.out.println(e);
                }

            }
        });

        Thread t18=new Thread(new Runnable() {
            Integer index=getActualIndexToWriteFile(validCustomersSize,800000);
            @Override
            public void run() {
                try{
                    for(int p=700000; p<800000 && p<validCustomersSize;p++){
                        CustomerInfo customer=validCustomers.get(p);
                        validCustomerPage8=getEachPageData(validCustomerPage8,customer);
                        if(p==index){
                            File file=new File(filePath+"validCustomers-page8.CSV");
                            Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                            writer.write(validCustomerPage8.toString());
                            writer.close();
                        }

                    }

                }
                catch (Exception e){
                    System.out.println(e);
                }

            }
        });

        Thread t19=new Thread(new Runnable() {
            Integer index=getActualIndexToWriteFile(validCustomersSize,900000);
            @Override
            public void run() {
                try{
                    for(int q=800000; q<900000 && q<validCustomersSize;q++){
                        CustomerInfo customer=validCustomers.get(q);
                        validCustomerPage9=getEachPageData(validCustomerPage9,customer);
                        if(q==index){
                            File file=new File(filePath+"validCustomers-page9.CSV");
                            Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                            writer.write(validCustomerPage9.toString());
                            writer.close();
                        }

                    }

                }
                catch (Exception e){
                    System.out.println(e);
                }

            }
        });

        Thread t20=new Thread(new Runnable() {
            Integer index=getActualIndexToWriteFile(validCustomersSize,1000000);
            @Override
            public void run() {
                try{
                    for(int r=900000; r<1000000 && r<validCustomersSize;r++){
                        CustomerInfo customer=validCustomers.get(r);
                        validCustomerPage10=getEachPageData(validCustomerPage10,customer);
                        if(r==index){
                            File file=new File(filePath+"validCustomers-page10.CSV");
                            Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                            writer.write(validCustomerPage10.toString());
                            writer.close();
                        }

                    }

                }
                catch (Exception e){
                    System.out.println(e);
                }

            }
        });

        if(validCustomersSize<=100000){
            t11.start();
        }
        if(validCustomersSize>=200000){
            t12.start();
        }
        if(validCustomersSize>=300000){
            t13.start();
        }
        if(validCustomersSize>=400000){
            t14.start();
        }
        if(validCustomersSize>=500000){
            t15.start();
        }
        if(validCustomersSize>=600000){
            t16.start();
        }
        if(validCustomersSize>=700000){
            t17.start();
        }
        if(validCustomersSize>=800000){
            t18.start();
        }
        if(validCustomersSize>=900000){
            t19.start();
        }
        if(validCustomersSize>=1000000){
            t20.start();
        }

    }
    public void startServiceForInValidCustomer(){
       Integer inValidCustomersSize=this.inValidCustomers.size();
       Thread t1=new Thread(new Runnable() {
           Integer index=getActualIndexToWriteFile(inValidCustomersSize,100000);
           @Override
           public void run() {
               try{
                   for(int i=0; i<100000 && i<inValidCustomersSize;i++){
                       CustomerInfo customer=inValidCustomers.get(i);
                       invalidCustomerPage1=getEachPageData(invalidCustomerPage1,customer);
                       if(i==index){

                           File file=new File(filePath+"invalidCustomers-page1.CSV");
                           Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                           writer.write(invalidCustomerPage1.toString());
                           writer.close();
                       }

                   }

               }
               catch (Exception e){
                   System.out.println(e);
               }

           }
       });

       Thread t2=new Thread(new Runnable() {
           Integer index=getActualIndexToWriteFile(inValidCustomersSize,200000);
           @Override
           public void run() {
               try{
                   for(int j=100000; j<200000 && j<inValidCustomersSize;j++){
                       CustomerInfo customer=inValidCustomers.get(j);
                       invalidCustomerPage2=getEachPageData(invalidCustomerPage2,customer);
                       if(j==index){
                           File file=new File(filePath+"invalidCustomers-page2.CSV");
                           Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                           writer.write(invalidCustomerPage2.toString());
                           writer.close();
                       }

                   }

               }
               catch (Exception e){
                   System.out.println(e);
               }

           }
       });
       Thread t3=new Thread(new Runnable() {
           Integer index=getActualIndexToWriteFile(inValidCustomersSize,300000);
           @Override
           public void run() {
               try{
                   for(int k=200000; k<300000 && k<inValidCustomersSize;k++){
                       CustomerInfo customer=inValidCustomers.get(k);
                       invalidCustomerPage3=getEachPageData(invalidCustomerPage3,customer);
                       if(k==index){
                           File file=new File(filePath+"invalidCustomers-page3.CSV");
                           Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                           writer.write(invalidCustomerPage3.toString());
                           writer.close();
                       }

                   }

               }
               catch (Exception e){
                   System.out.println(e);
               }

           }
       });

       Thread t4=new Thread(new Runnable() {
           Integer index=getActualIndexToWriteFile(inValidCustomersSize,400000);
           @Override
           public void run() {
               try{
                   for(int l=300000; l<400000 && l<inValidCustomersSize;l++){
                       CustomerInfo customer=inValidCustomers.get(l);
                       invalidCustomerPage4=getEachPageData(invalidCustomerPage4,customer);
                       if(l==index){
                           File file=new File(filePath+"invalidCustomers-page4.CSV");
                           Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                           writer.write(invalidCustomerPage4.toString());
                           writer.close();
                       }

                   }

               }
               catch (Exception e){
                   System.out.println(e);
               }

           }
       });

       Thread t5=new Thread(new Runnable() {
           Integer index=getActualIndexToWriteFile(inValidCustomersSize,500000);
           @Override
           public void run() {
               try{
                   for(int m=400000; m<500000 && m<inValidCustomersSize;m++){
                       CustomerInfo customer=inValidCustomers.get(m);
                       invalidCustomerPage5=getEachPageData(invalidCustomerPage5,customer);
                       if(m==index){
                           File file=new File(filePath+"invalidCustomers-page5.CSV");
                           Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                           writer.write(invalidCustomerPage5.toString());
                           writer.close();
                       }

                   }

               }
               catch (Exception e){
                   System.out.println(e);
               }

           }
       });

       Thread t6=new Thread(new Runnable() {
           Integer index=getActualIndexToWriteFile(inValidCustomersSize,600000);
           @Override
           public void run() {
               try{
                   for(int n=500000; n<600000 && n<inValidCustomersSize;n++){
                       CustomerInfo customer=inValidCustomers.get(n);
                       invalidCustomerPage6=getEachPageData(invalidCustomerPage6,customer);
                       if(n<=599999){
                           File file=new File(filePath+"invalidCustomers-page6.CSV");
                           Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                           writer.write(invalidCustomerPage6.toString());
                           writer.close();
                       }

                   }

               }
               catch (Exception e){
                   System.out.println(e);
               }

           }
       });

       Thread t7=new Thread(new Runnable() {
           Integer index=getActualIndexToWriteFile(inValidCustomersSize,700000);
           @Override
           public void run() {
               try{
                   for(int o=600000; o<700000 && 0<inValidCustomersSize;o++){
                       CustomerInfo customer=inValidCustomers.get(o);
                       invalidCustomerPage7=getEachPageData(invalidCustomerPage7,customer);
                       if(o==index){
                           File file=new File(filePath+"invalidCustomers-page7.CSV");
                           Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                           writer.write(invalidCustomerPage7.toString());
                           writer.close();
                       }

                   }

               }
               catch (Exception e){
                   System.out.println(e);
               }

           }
       });

       Thread t8=new Thread(new Runnable() {
           Integer index=getActualIndexToWriteFile(inValidCustomersSize,800000);
           @Override
           public void run() {
               try{
                   for(int p=700000; p<800000 && p<inValidCustomersSize;p++){
                       CustomerInfo customer=inValidCustomers.get(p);
                       invalidCustomerPage8=getEachPageData(invalidCustomerPage8,customer);
                       if(p==index){
                           File file=new File(filePath+"invalidCustomers-page8.CSV");
                           Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                           writer.write(invalidCustomerPage8.toString());
                           writer.close();
                       }

                   }

               }
               catch (Exception e){
                   System.out.println(e);
               }

           }
       });

       Thread t9=new Thread(new Runnable() {
           Integer index=getActualIndexToWriteFile(inValidCustomersSize,900000);
           @Override
           public void run() {
               try{
                   for(int q=800000; q<900000 && q<inValidCustomersSize;q++){
                       CustomerInfo customer=inValidCustomers.get(q);
                       invalidCustomerPage9=getEachPageData(invalidCustomerPage9,customer);
                       if(q==index){
                           File file=new File(filePath+"invalidCustomers-page9.CSV");
                           Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                           writer.write(invalidCustomerPage9.toString());
                           writer.close();
                       }

                   }

               }
               catch (Exception e){
                   System.out.println(e);
               }

           }
       });

       Thread t10=new Thread(new Runnable() {
           Integer index=getActualIndexToWriteFile(inValidCustomersSize,1000000);
           @Override
           public void run() {
               try{
                   for(int r=900000; r<1000000 && r<inValidCustomersSize;r++){
                       CustomerInfo customer=inValidCustomers.get(r);
                       invalidCustomerPage10=getEachPageData(invalidCustomerPage10,customer);
                       if(r==index){
                           File file=new File(filePath+"invalidCustomers-page10.CSV");
                           Writer writer =new OutputStreamWriter(new FileOutputStream(file));
                           writer.write(invalidCustomerPage10.toString());
                           writer.close();
                       }

                   }

               }
               catch (Exception e){
                   System.out.println(e);
               }

           }
       });

       if(inValidCustomersSize<=100000){
           t1.start();
       }
       if(inValidCustomersSize>=200000){
           t2.start();
       }
       if(inValidCustomersSize>=300000){
           t3.start();
       }
       if(inValidCustomersSize>=400000){
           t4.start();
       }
       if(inValidCustomersSize>=500000){
           t5.start();
       }
       if(inValidCustomersSize>=600000){
           t6.start();
       }
       if(inValidCustomersSize>=700000){
           t7.start();
       }
       if(inValidCustomersSize>=800000){
           t8.start();
       }
       if(inValidCustomersSize>=900000){
           t9.start();
       }
       if(inValidCustomersSize>=1000000){
           t10.start();
       }




    }
    public StringBuilder getEachPageData(StringBuilder page,CustomerInfo customer){
       try{
           page.append(customer.getName());
           page.append(",");
           page.append(customer.getBranch());
           page.append(",");
           page.append(customer.getCity());
           page.append(",");
           page.append(customer.getShot_form());
           page.append(",");
           page.append(customer.getCode());
           page.append(",");
           page.append(customer.getEmail());
           page.append(",");
           page.append(customer.getPhoneNumber());
           page.append(",");
           page.append(customer.getIpAddress());
           page.append("\n");
       }
       catch (Exception e){

       }
       return page;
   }
   Integer getActualIndexToWriteFile(Integer customerSize,Integer value){
        Integer index=customerSize-value;
        if(index>=0){
            index=value-1;
        }
        else{
            index=customerSize-1;
        }
        return index;
   }
}
