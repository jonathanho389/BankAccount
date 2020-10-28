public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(double bal, int id, String pass){
    balance = bal;
    bal = 0;
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
      System.out.print("Deposit successful: ");
      return true;
    }
    else{
      System.out.print("You can't deposite negative dollars: ");
      return false;
    }
  }
  public boolean withdraw(double amount){
    if(amount < 0){
      System.out.print("You can't withdraw negative dollars: ");
      return false;
    }
    else if(balance < amount){
      System.out.println("You're too broke: ");
      return false;
    }
    else{
      balance -= amount;
      System.out.print("Withdrawal successful. You have funds: ");
      return true;
    }
  }
  public String toString(){
    return "ID:" + accountID + " "+ "Balance:" + balance;
  }
}
