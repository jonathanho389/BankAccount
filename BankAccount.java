public class BankAccount{
  private double balance;
  private int accountID;
  private String password;
  public BankAccount(int id, String pass){
    balance = 0;
    accountID = id;
    password = pass;
  }
  public double getBal(){
    return balance;
  }
  public int getAccountID(){
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
    if(amount < 0){
      return false;
    }
    else if(balance < amount){
      return false;
    }
    else{
      balance -= amount;
      return true;
    }
  }
  private boolean authenticate(String password1){
    return password.equals(password1);
  }
  public boolean transferTo(BankAccount other, double amount, String password1){
    if(authenticate(password1) && withdraw(amount)){
      if(deposit(amount)){
        withdraw(amount);
        other.deposit(amount);
        return true;
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
  }
  public String toString(){
    return "#" + accountID + " "+ "$" + balance;
  }
}
