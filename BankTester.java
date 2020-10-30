public class BankTester{
  public static void main(String[] args) {
    BankAccount account1 = new BankAccount(21, "21");
    BankAccount account2 = new BankAccount(50, "50");
    System.out.println(account1.getBal());
    System.out.println(account1.getAccountID());
    account1.setPass("test again");
    System.out.println(account1.deposit(50));
    System.out.println(account1.withdraw(5));
    System.out.println(account1.getBal());
    System.out.println(account2.deposit(25));
    System.out.println(account2.transferTo(account1, 20, "50"));
  }
}
