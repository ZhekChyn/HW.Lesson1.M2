package com.geektech;

public class Grandfather {
    private String name;
    private int age;
    private Birthday birthday;
    private FavoriteColor favoriteColor;

    public Grandfather(String name, int age, Birthday birthday, FavoriteColor favoriteColor) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.favoriteColor = favoriteColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public FavoriteColor getFavoriteColor() {
        return favoriteColor;
    }

    public String getInfo(){
        return "Name: " + name + "\nAge: " + age +
                "\nBirthday: " + birthday.getMonth() + "/" + birthday.getDay() + "/" + birthday.getYear() +
                "\nFavorite color: " + favoriteColor;
    }
}
