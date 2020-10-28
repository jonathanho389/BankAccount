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
    return balance;
  }
  public int getID(){
    return accountID;
  }
  public String getPass(){
    return password;
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
}
