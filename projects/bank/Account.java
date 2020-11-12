public class Account {

    private String customerName;
    private String email;
    private double balance;
    private String customerPhoneNumber;
    private String accountNumber;

    public Account() {
        //default params
        this("123", 0.00, "Default name", "Default email","default phone")
    }


    public Account(String accountNumber, double balance, String customerName, String email, String customerPhoneNumber){

        System.out.println("Account constructor with params called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.customerPhoneNumber = customerPhoneNumber;
    }




    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit amount of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdraw(double withdrawAmount) {
        if(this.balance - withdrawAmount <=0) {
            System.out.println(" available is " + this.balance);
        } else {
            balance -= withdrawAmount;
            System.out.println("withdrawel of " + withdrawAmount + " is processed");
        }
    }

    


    public String getCustomerName() {
        System.out.println("Account owner is " + customerName);
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


}