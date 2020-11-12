
public class vipCustomer {


    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer (){
        //default params
        this("name", 0.00, "email")

    }

    public VipCustomer(String name, double creditLimit){
        System.out.println("contructor with default params called");
        this.name = name;
        this.creditLimit = creditLimit;

    }

    public VipCustomer (String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

}