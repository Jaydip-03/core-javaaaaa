package oops.encapsulation;

class BankAccount {
    private final long accountNumber   ;
    private String holderName ;
    private double balance;

    private static final String BANK_NAME = "JP MORGAN" ;

    BankAccount(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber ;
        this.holderName = holderName ;
        if (balance > 0) {
            this.balance = balance;
        }
        else {
            this.balance = 0 ;
        }
    }
}


public class BankAccountProgram {
}
