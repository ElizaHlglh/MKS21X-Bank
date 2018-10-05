public class BankAccount{

  private double balance;
  private int accountID;
  private String Password;

  public BankAccount(double x, int y, String z) {
    balance = x;
    accountID = y;
    Password = z;
  }

  public double getBalance() {
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public String toString() {
    return accountID + "\t" +balance;
  }

  public void setPassword(String newPass) {
    Password = newPass;
  }

  public boolean deposit(double amount){
    if (amount > 0) {
      balance = balance + amount;
      System.out.println("Deposit Success!");
      return true;
    }
    else {
      System.out.println("Deposit failure");
      return false;
    }
  }

  public boolean withdraw(double amount){
    if (amount <= balance && amount > 0) {
      balance = balance - amount;
      System.out.println("Withdrawal success!");
      return true;
    }
    else {
      System.out.println("Withdrawal failure");
      return false;
    }
  }

  private boolean authenticate(String password) {
    return Password.equals(password);
  }

  public boolean transferTo(BankAccount other, double amount, String password) {
    if (other.authenticate(password) && (this.withdraw(amount))) {
        other.deposit(amount);
        System.out.println("Transfer success!");
        return true;
    }
    else {
      System.out.println("Transfer failed");
      return false;
    }
  }
}
