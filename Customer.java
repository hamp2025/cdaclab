package exceptionshandling;

public class Customer {
    private String name;
    private String address;
    private String id;
    private String phoneNo;
    private Account account;

    public Customer(String name, String address, String id, String phoneNo, Account account) { 
        this.name = name;
        this.address = address;
        this.id = id;
        this.phoneNo = phoneNo;
        this.account = account;
    }

  
    public void disp() {
        System.out.println("Customer Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("ID: " + id);
        System.out.println("Phone No: " + phoneNo);
        account.displayAccountInfo(); 
    }

}