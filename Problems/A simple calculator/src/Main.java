import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long first = scan.nextLong();
        String operator = scan.next();
        long second = scan.nextLong();
        switch (operator) {
            case "+" :
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(first/second);
                }
                break;
            case  "*":
                System.out.println(first*second);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}