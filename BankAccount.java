public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(double x, int y, String z) {
    balance = x;
    accountID = y;
    password = z;
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
    password = newPass;
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

}
