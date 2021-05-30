package com.geektech;

public final class Son extends Father{

    private String emailAddress;

    public Son(String name, int age, Birthday birthday, FavoriteColor favoriteColor, String companyName) {
        super(name, age, birthday, favoriteColor, companyName);
    }

    public Son(String name, int age, Birthday birthday, FavoriteColor favoriteColor, String companyName, String emailAddress) {
        super(name, age, birthday, favoriteColor, companyName);
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void makeAdvice(int number, String advice) {
        for (int i = 0; i < number; i++) {
            System.out.println(advice + "shapalak");
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nEmail address: " + emailAddress;
    }
}
