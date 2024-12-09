package phonesystem;

import calculatorp.Calculator;

import java.lang.foreign.StructLayout;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            {
                System.out.println("1.Add User");
                System.out.println("2.Get User");
                System.out.println("3.Check User");
                System.out.println("4.Remove User");
                System.out.println("5.Display All");
                System.out.println("6.Exit");
                System.out.print("Select operation: ");
                int a = scanner.nextInt();
                switch (a) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.next();
                        System.out.print("Enter number: ");
                        String number = scanner.next();
                        phone.addContact(name, number);
                        break;
                    case 2:
                        System.out.print("Enter number: ");
                        String numberSearc = scanner.next();
                        phone.getUserDetails(numberSearc);
                        break;
                    case 3:
                        System.out.print("Enter number: ");
                        String numbeexsis = scanner.next();
                        phone.exsistContact(numbeexsis);
                        break;
                    case 4:
                        System.out.print("Enter number: ");
                        String remove = scanner.next();
                        phone.removeContact(remove);
                        break;
                    case 5:
                        phone.displayAllContact();
                        break;

                    case 6:
                        return;

                    default:
                        System.out.println("Invalid operation");
                }
            }
        }
    }
}