import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("""
                Press  1 to convert a shekels to dollars\s
                Press  2 to convert a dollars to shekels\s
                Press  3 to convert a euro to shekels\s
                Press  4 to convert a shekels to euros\s
                press 0 to exit
                """);

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);


        int input1 = sc1.nextInt();
        double input2 = sc2.nextDouble();


        double dolar = 3.41;
        double euro = 3.53;
        double shkel = 1.0;

        while (input1 != 0) {
            switch (input1) {
                case 1:
                    System.out.println(input2 / dolar + "$");
                    break;
                case 2:
                    System.out.println(input2 * dolar + "₪");
                    break;
                case 3:
                    System.out.println(input2 * euro + "₪");
                    break;
                case 4:
                    System.out.println(input2 / euro + "€");
                    break;
            }
            System.out.println("""
                    Press  1 to convert a shekels to dollars\s
                    Press  2 to convert a dollars to shekels\s
                    Press  3 to convert a euro to shekels\s
                    Press  4 to convert a shekels to euros\s
                    press 0 to exit
                    """);
            input1 = sc1.nextInt();
            input2 = sc2.nextDouble();
        }
        System.out.println("goodbye");
    }


    }

