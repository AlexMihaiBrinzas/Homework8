package com.fasttrack.ex1;

public class Company implements  Advertisement{
    private String Facebook;
    private String email;
    private String print;

    

    public Company(String facebook, String email, String print) {
        Facebook = facebook;
        this.email = email;
        this.print = print;
    }

    @Override
    public String Facebook() {
        System.out.println("Advertisement on Facebook");
        return Facebook;

    }

    @Override
    public String email() {
        System.out.println("Advertisement on email");
        return email;
    }

    @Override
    public String print() {
        System.out.println("Advertisement to print");
        return print;
    }
}
