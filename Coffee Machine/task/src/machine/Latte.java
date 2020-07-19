package machine;

public class Latte {

    int water;
    int milk;
    int coffeeBeans;
    int cups;
    int price;
    int[] latte;

    public Latte() {
        this.water = 350;
        this.milk = 75;
        this.coffeeBeans = 20;
        this.cups = 1;
        this.price = 7;
        this.latte = new int[] {water, milk, coffeeBeans, cups, price};
    }

    public int checkWater(int availableW) {
        int waterForCups;
        if (availableW/this.water > 0) {
            waterForCups = availableW/this.water;
        } else {
            waterForCups = 0;
            System.out.println("Sorry, not enough water!");
        }
        return waterForCups;
    }

    public int checkMilk(int availableM) {
        int milkForCups;
        if (availableM / this.milk > 0) {
            milkForCups = availableM / this.water;
        } else {
            milkForCups = 0;
            System.out.println("Sorry, not enough milk!");
        }
        return milkForCups;
    }

    public int checkCoffee(int availableC) {
        int coffeeForCups;
        if (availableC / this.coffeeBeans > 0) {
            coffeeForCups = availableC / this.coffeeBeans;
        } else {
            coffeeForCups = 0;
            System.out.println("Sorry, not enough coffee beans!");
        }
        return coffeeForCups;
    }

    public int checkCups(int availableCups) {
        int cups;
        if (availableCups / this.cups > 0) {
            cups = availableCups / this.cups;
        } else {
            cups = 0;
            System.out.println("Sorry, not enough cups!");
        }
        return cups;
    }

    public int useWater (int availableW) {
        return availableW - this.water;
    }
    public int useMilk (int availableM) {
        return availableM - this.milk;
    }
    public int useCoffee (int availableC) {
        return availableC - this.coffeeBeans;
    }
    public int useCups (int availableCups) {
        return availableCups - this.cups;
    }
    public int useMoney (int stock) {
        return stock + this.price;
    }

    public int[] after (int availableW, int availableM, int availableC, int availableCups, int stock) {
        return new int[] {useWater(availableW), useMilk(availableM), useCoffee(availableC), useCups(availableCups), useMoney(stock)};
    }
}
