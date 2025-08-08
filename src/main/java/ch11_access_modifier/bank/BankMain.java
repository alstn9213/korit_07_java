package ch11_access_modifier.bank;

public class BankMain {
    public static void main(String[] args) {

        Bank account1 = new Bank(123456, "홍길동", 100000);
        Bank account2 = new Bank(987654, "신사임당", 500000);

        account1.setPinNumber(1234);
        account1.deposit(50000, 1234);
        account1.withdraw(100000, 1234);

        account2.setPinNumber(5678);
        account2.withdraw(100000,5678);
        account2.deposit(200000, 5678);

        System.out.println();
        account1.showAccountInfo();
        System.out.println();
        account2.showAccountInfo();

        Bank bank = new Bank(13579,"김사", -3000, 789456);
    }
}
