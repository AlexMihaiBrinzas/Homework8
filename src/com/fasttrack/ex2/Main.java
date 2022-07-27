package com.fasttrack.ex2;

public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank(new ING());
        bank.transaction(0,500);

        Bank bank1=new Bank(new BT());
        bank1.transaction(1,1000);

        Bank bank2=new Bank(new BRD());
        bank2.transaction(0,1500);
    }
}
