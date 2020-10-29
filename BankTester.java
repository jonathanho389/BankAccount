public class BankTester{
  public static void main(String[] args) {
    BankAccount account1 = new BankAccount(21, "21");
    System.out.println(account1.getBal());
    System.out.println(account1.getAccountID());
    account1.setPass("test again");
    System.out.println(account1.deposit(5));
    System.out.println(account1.withdraw(5));
    System.out.println(account1.getBal());
    System.out.println(account1.toString());
    System.out.println(account1.authenticate("test"));
  }
}
