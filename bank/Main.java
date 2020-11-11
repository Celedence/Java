

public class Main {

    public static void main(String[] arg) {



        Account bobsAccount = new Account("23456", 0.00, "Bob Smiling", "bobsemail@bob.com", "480-479-9982");
    
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getBalance());
        Account mikesAccount = new Account();        

        mikesAccount.setBalance(210.90);
        System.out.println("this is before print balance");
        System.out.println(mikesAccount.getBalance());
    
    }
}