package machine;

public class Espresso {

    int water;
    int milk;
    int coffeeBeans;
    int price;
    int cups;
    int[] espresso;

    public Espresso() {
        this.water = 250;
        this.milk = 0;
        this.coffeeBeans = 16;
        this.price = 4;
        this.cups = 1;
        this.espresso = new int[]{water, milk, coffeeBeans, cups, price};
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
        return availableW - water;
    }
    public int useCoffee (int availableC) {
        return availableC - coffeeBeans;
    }
    public int useCups (int availableCups) {
        return availableCups - cups;
    }
    public int useMoney (int stock) {
        return stock + price;
    }

    public int[] after (int availableW, int milk, int availableC, int availableCups, int stock) {
        return new int[]{useWater(availableW), milk, useCoffee(availableC), useCups(availableCups), useMoney(stock)};
    }
}
