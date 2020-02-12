package me.juyi.aexercise;

public abstract class Bank {
    public abstract String getBalance ();
}

class BankA extends Bank {
    private final int DEPOSIT = 100;
    @Override
    public String getBalance(){
        return "$"+this.DEPOSIT;
    }
}

class BankB extends Bank {
    private final int DEPOSIT = 150;
    @Override
    public String getBalance(){
        return "$"+this.DEPOSIT;
    }
}

class BankC extends Bank {
    private final int DEPOSIT = 200;
    @Override
    public String getBalance(){
        return "$"+this.DEPOSIT;
    }
}