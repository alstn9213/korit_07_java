package ch11_access_modifier.bank;

public class Bank {
    private int accountNUm;
    private String acountHolder;
    private int balance;
    private int pinNumber;

    public Bank() {
    }

    public Bank(int accountNUm) {
        this.accountNUm = accountNUm;
    }

    public Bank(int accountNUm, String acountHolder) {
        this.accountNUm = accountNUm;
        this.acountHolder = acountHolder;
    }

    public Bank(int accountNUm, String acountHolder, int balance) {
        this.accountNUm = accountNUm;
        this.acountHolder = acountHolder;
        this.balance = balance;
    }

    public Bank(int accountNUm, String acountHolder, int balance, int pinNumber) {
        this.accountNUm = accountNUm;
        this.acountHolder = acountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }



    public int getAccountNUm() {
        return accountNUm;
    }
    public int getBalance() {
        return balance;
    }

    public String getAcountHolder() {
        return acountHolder;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setBalance(int balance) {
        if(balance <= 0) {
            System.out.println("불가능한 잔액입니다.");
            return;
        }
        this.balance = balance;
    }

    public void setPinNumber(int pinNumber) {
        if(pinNumber < 0 || pinNumber > 9999) {
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    }

    void deposit(int amount, int inputPin) {
        if(inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        if(amount <= 0) {
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }
        balance += amount;
        System.out.println(amount + "원이 입금되었습니다. 현재 잔액 : " + balance);
    }
    void withdraw(int amount, int inputPin) {
        if(inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        if(amount <= 0) {
            System.out.println("불가능한 입력 금액입니다.");
            return;
        }
        if(balance - amount >= 0) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액 : " + balance);
        } else {
            System.out.println("잔액이 부족하여 출금할 수 없습니다.");
        }
    }
    void showAccountInfo() {
        System.out.println("계좌 번호: " + accountNUm);
        System.out.println("계좌 소유자: " + acountHolder);
        System.out.println("현재 잔액: " + balance);
    }
}
