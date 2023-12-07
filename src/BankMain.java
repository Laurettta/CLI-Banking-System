public class BankMain {

    public static void main(String[] args){

//        Create  cust1
        Account cust1 = new Account();
        cust1.deposit(100);


//        Create cust2
        Account cust2 = new Account();
        cust2.withraw(400);

        System.out.println("Cust1 has a balance of ");
        System.out.println(cust1.getBalance());

        System.out.println("Cust2 has a balance of ");
        System.out.println(cust2.getBalance());

    }



}