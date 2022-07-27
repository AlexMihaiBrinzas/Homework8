package com.fasttrack.ex2;

public class ING implements Operations{
    private int sold =100000;
    private final String name = "ING";


    @Override
    public int withdraw(int amountOfMoney) {
        if(amountOfMoney>sold){
            System.out.println("Amount of money not available");
        }
        return 0;
    }

    @Override
    public int deposit(int amountOfMoney) {
        sold+=amountOfMoney;
        return sold;
    }

    @Override
    public int getSold() {
        return sold;
    }

    @Override
    public String getName() {
        return name;
    }
}
