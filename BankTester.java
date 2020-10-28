public class BankTester{
  public static void main(String[] args) {
    BankAccount account1 = new BankAccount(10, 20, "test");
    System.out.println(account1.getBal());
    System.out.println(account1.getID());
    System.out.println(account1.getPass());
    account1.setPass("test again");
    System.out.println(account1.getPass());
    System.out.println(account1.deposit(5));
  }
}
