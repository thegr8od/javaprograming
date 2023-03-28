
public class Account1 {
private String name;
private double balance;
public Account1(String name) {
    this.name = name;
    this.balance = 0.0;
}

public String getName() {
    return name;
}

public double getBalance() {
    return balance;
}

public void setBalance(double balance) {
    this.balance = balance;
}

public void credit(double amount) {
    balance += amount;
}

public void print() {
    System.out.printf("예금주 : %s%n잔액 : %.1f%n", name, balance);
}

public void addInterest(double interestRates) {
    double interest = balance * interestRates;
    balance += interest;
}
}