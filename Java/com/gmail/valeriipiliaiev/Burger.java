package com.gmail.valeriipiliaiev;

public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;
    private int meatCount;

    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        this.meatCount = 1;
        System.out.println("Звичайний бургер: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayo);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = null;
        this.meatCount = 1;
        System.out.println("Дієтичний бургер: " + bun + ", " + meat + ", " + cheese + ", " + greens);
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayo, int meatCount) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        if (meatCount == 2) {
            System.out.println("Бургер з подвійним м'ясом: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayo);
        } else {
            System.out.println("Бургер з подвійним м'ясом може включати тільки 2 куска м'яса");
        }
    }

    public static void main(String[] args) {
        Burger firstBurger = new Burger("Булочка", "М'ясо", "Сир ", "Салат", "Майонез");
        Burger secondBurger = new Burger("Булочка", "М'ясо", "Сир ", "Салат");
        Burger thirdBurger = new Burger("Булочка", "М'ясо", "Сир ", "Салат", "Майонез", 2);
    }
}
