public class Driver{
	public static void main(String[]args){
		BankAccount a = new BankAccount(100.00, 123, "me");
		//constructor that takes the balance, ID, and password.
    System.out.println(a);
    //should print "123 100.00"
    System.out.println(a.getBalance());
    //should print 100.0
    System.out.println(a.getAccountID());
    //should print 123
    a.deposit(150.1);
    System.out.println(a.getBalance());
    //should print 250.1
    a.deposit(-100);
    System.out.println(a.getBalance());
    //should print 250.1
    a.withdraw(200);
    System.out.println(a.getBalance());
    //should print 50.1
    a.withdraw(-200);
    System.out.println(a.getBalance());
    //should print 50.1
  }
}
