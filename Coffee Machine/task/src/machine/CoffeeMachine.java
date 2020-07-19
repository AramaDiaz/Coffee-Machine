package machine;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class CoffeeMachine {
    public static Scanner scanner = new Scanner(System.in);
    public static OneCup oneCup = new OneCup();
    public static Espresso espresso = new Espresso();
    public static Latte latte = new Latte();
    public static Cappuccino cappuccino = new Cappuccino();
    public static void main(String[] args) {

//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup\nCoffee is ready!");

//        int coffeeCups =scanner.nextInt();
//        System.out.println("For "+coffeeCups+" cups of coffee you will need:\n" +
//                200*coffeeCups+" ml of water\n"+50*coffeeCups+" ml of milk\n"+
//                15*coffeeCups+" g of coffee beans");

//        System.out.println("Write how many ml of water the coffee machine has:");
//        int waterMl = scanner.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        int milkMl = scanner.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        int coffeeGr = scanner.nextInt();
//        System.out.println("Write how many cups of coffee you will need:");
//        int coffeeCups = scanner.nextInt();
//
//        int waterForXcups = waterMl / oneCup.necWater;
//        int milkForXcups = milkMl / oneCup.necMilk;
//        int coffeeForXcups = coffeeGr / oneCup.necCoffee;
//
//        int availableCups = min(waterForXcups,milkForXcups,coffeeForXcups);
//
//        int extraCupsW = waterForXcups - coffeeCups;
//        int extraCupsM = milkForXcups - coffeeCups;
//        int extraCupsC = coffeeForXcups - coffeeCups;
//
//        int extraCups;
//        if (extraCupsW == extraCupsM && extraCupsW == extraCupsC) {
//            extraCups = extraCupsW;
//        } else {
//            extraCups = min(extraCupsW, extraCupsM, extraCupsC);
//        }
//
//        int justCups = min(waterForXcups, milkForXcups, coffeeForXcups);
//
//        if (availableCups == coffeeCups) {
//            System.out.println("Yes, I can make that amount of coffee");
//
//        } else if (availableCups > coffeeCups) {
//            System.out.println("Yes, I can make that amount of coffee (and even " + extraCups + " more than that)");
//
//        } else if (availableCups < coffeeCups) {
//                System.out.println("No, I can make only " + justCups + " cup(s) of coffee");
//            }
//    }
//
//        public static int min (int a, int b, int c) {
//
//            if (a > c & b > c) {
//                return c;
//            } else if (a < b & a < c) {
//                return a;
//            }
//            return b;
//        }

//        System.out.println("The coffee machine has:");
        int water = 400;
//        System.out.println(water + " of water");
        int milk = 540;
//        System.out.println(milk + " of milk");
        int coffeeBeans = 120;
//        System.out.println(coffeeBeans + " of coffee beans");
        int dispCups = 9;
//        System.out.println(dispCups + " of disposable cups");
        int money = 550;
//        System.out.println("$"+money + " of money");
        int[] ingredients = new int[]{water, milk, coffeeBeans, dispCups, money};
        boolean flag = true;
        while (flag) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            String option = scanner.next();
            switch (option) {
                case "buy":
                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String choice = scanner.next();
                    ingredients = buy(choice, ingredients);
                    break;
                case "fill":
                    ingredients = fill(ingredients);
                    break;
                case "take":
                    ingredients = take(ingredients);
                    break;
                case "remaining":
                    int[] rem = remaining(ingredients);
                    System.out.println("\nThe coffee machine has:\n" + rem[0] + " of water\n" + rem[1] + " of milk\n" + rem[2] +
                            " of coffee beans\n"+ rem[3] + " of disposable cups\n" + "$"+rem[4] + " of money");
                    break;
                case "exit":
                    flag = false;
                    break;
            }
        }
    }

    public static int[] buy (String option, int[] original) {
        int[] rem = new int[]{};
        switch (option) {
            case "1":
                if (espresso.checkWater(original[0])>0 && espresso.checkCoffee(original[2])>0 && espresso.checkCups(original[3])>0) {
                    System.out.println("I have enough resources, making you a coffee!");
                    rem = espresso.after(original[0], original[1], original[2], original[3], original[4]);
                } else {
                    rem = original;
                }
                break;
            case "2":
                if (latte.checkWater(original[0])>0 && latte.checkMilk(original[1])>0 && latte.checkCoffee(original[2])>0 && latte.checkCups(original[3])>0) {
                    System.out.println("I have enough resources, making you a coffee!");
                    rem = latte.after(original[0], original[1], original[2], original[3], original[4]);
                } else {
                    rem = original;
                }
                break;
            case "3":
                if (latte.checkWater(original[0])>0 && latte.checkMilk(original[1])>0 && latte.checkCoffee(original[2])>0 && latte.checkCups(original[3])>0) {
                    System.out.println("I have enough resources, making you a coffee!");
                    rem = cappuccino.after(original[0], original[1], original[2], original[3], original[4]);
                } else {
                    rem = original;
                }
                break;
            case "back":
                rem = original;
                break;
        }
        return rem;
        }

    public static int[] fill(int[] ingredients) {
        System.out.println("Write how many ml of water do you want to add:");
        int mlWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add");
        int mlMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int grCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int newCups = scanner.nextInt();
        int[] filled = new int[] {ingredients[0] + mlWater, ingredients[1] + mlMilk, ingredients[2] + grCoffeeBeans, ingredients[3] + newCups, ingredients[4]};
        return filled;
    }

    public static int[] take (int[] ingredients) {
        System.out.println("I gave you $"+ingredients[4]);
        return new int[] {ingredients[0], ingredients[1], ingredients[2], ingredients[3], 0};
    }

    public static int[] remaining ( int[] ingredients) {
        int[] remaining = new int[5];
        for (int i=0; i<5; i++) {
            remaining[i]=ingredients[i];
        }
        return remaining;
    }

}
