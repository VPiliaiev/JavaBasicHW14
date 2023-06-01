package com.gmail.valeriipiliaiev;

public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;
    private boolean doubleMeat;

    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        this.doubleMeat = false;
        System.out.println("Звичайний бургер: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayo);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = null;
        this.doubleMeat = false;
        System.out.println("Дієтичний бургер: " + bun + ", " + meat + ", " + cheese + ", " + greens);
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayo, boolean doubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        this.doubleMeat = doubleMeat;
        if (doubleMeat) {
            System.out.println("Бургер з подвійним м'ясом: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayo);
        } else {
            System.out.println("Бургер з подвійним м'ясом може включати тільки 2 куска м'яса");
        }
    }

    public String getBun() {
        return bun;
    }

    public String getMeat() {
        return meat;
    }

    public String getCheese() {
        return cheese;
    }

    public String getGreens() {
        return greens;
    }

    public String getMayo() {
        return mayo;
    }

    public boolean isDoubleMeat() {
        return doubleMeat;
    }

    public static void main(String[] args) {
        Burger firstBurger = new Burger("Булочка", "М'ясо", "Сир", "Зелень", "Майонез");
        Burger secondBurger = new Burger("Булочка", "М'ясо", "Сир", "Зелень");
        Burger thirdBurger = new Burger("Булочка", "М'ясо", "Сир", "Зелень", "Майонез", true);

        String firstBun = firstBurger.getBun();
        String firstMeat = firstBurger.getMeat();
        String firstCheese = firstBurger.getCheese();
        String firstGreens = firstBurger.getGreens();
        String firstMayo = firstBurger.getMayo();
        System.out.println("Інгредієнти першого бургера:");
        System.out.println("Булочка: " + firstBun);
        System.out.println("М'ясо: " + firstMeat);
        System.out.println("Сир: " + firstCheese);
        System.out.println("Зелень: " + firstGreens);
        System.out.println("Майонез: " + firstMayo);

        String secondBun = secondBurger.getBun();
        String secondMeat = secondBurger.getMeat();
        String secondCheese = secondBurger.getCheese();
        String secondGreens = secondBurger.getGreens();
        String secondMayo = secondBurger.getMayo();
        System.out.println("Інгредієнти другого бургера:");
        System.out.println("Булочка: " + secondBun);
        System.out.println("М'ясо: " + secondMeat);
        System.out.println("Сир: " + secondCheese);
        System.out.println("Зелень: " + secondGreens);
        if (secondMayo != null) {
            System.out.println("Майонез: " + secondMayo);
        }

        String thirdBun = thirdBurger.getBun();
        String thirdMeat = thirdBurger.getMeat();
        String thirdCheese = thirdBurger.getCheese();
        String thirdGreens = thirdBurger.getGreens();
        String thirdMayo = thirdBurger.getMayo();
        boolean thirdDoubleMeat = thirdBurger.isDoubleMeat();
        System.out.println("Інгредієнти третього бургера:");
        System.out.println("Булочка: " + thirdBun);
        System.out.println("М'ясо: " + thirdMeat);
        System.out.println("Сир: " + thirdCheese);
        System.out.println("Зелень: " + thirdGreens);
        if (thirdDoubleMeat) {
            System.out.println("М'ясо: 2");
        } else {
            System.out.println("Бургер з подвійним м'ясом може включати тільки 2 куска м'яса");
        }
        System.out.println("Майонез: " + thirdMayo);
    }
}
