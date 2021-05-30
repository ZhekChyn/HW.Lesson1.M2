package com.geektech;

public class Father extends Grandfather{
    private String companyName;

    public Father(String name, int age, Birthday birthday, FavoriteColor favoriteColor, String companyName) {
        super(name, age, birthday, favoriteColor);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public final void makeAdvice(String advice, int number){
        for (int i = 0; i < number; i++) {
            System.out.println(advice);
        }
    }

    public void makeAdvice(int number, String advice){
        for (int i = 0; i < number; i++) {
            System.out.println(advice);
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nCompany name: " + companyName;
    }
}
