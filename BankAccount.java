public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(double bal, int id, String pass){
    balance = bal;
    accountID = id;
    password = pass;
  }
  public double getBal(){
    System.out.print("Your balance is ");
    return balance;
  }
  public int getID(){
    System.out.print("Your ID is ");
    return accountID;
  }
  public void setPass(String password1){
    password = password1;
  }
  public boolean deposit(double amount){
    if(amount >= 0){
      balance += amount;
      return true;
    }
    else{
      return false;
    }
  }
  public boolean withdraw(double amount){
    if(amount < 0 || balance < amount){
      return false;
    }
    else{
      balance -= amount;
      return true;
    }
  }
  public String toString(){
    return "ID:" + accountID + " "+ "Balance:" + balance;
  }
}
