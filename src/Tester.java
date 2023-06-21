
import java.util.Scanner;



public class Tester {
    public static void main(String[] args) {
        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of floors: ");
        int floors = scanner.nextInt();
        house.setFloorsNumber(floors);

        scanner.nextLine();

        System.out.print("Enter the address: ");
        String address = scanner.nextLine();
        house.setAddress(address);

        System.out.print("Enter the names of residents (separated by commas): ");
        String namesInput = scanner.nextLine();
        String[] names = namesInput.split(",");
        house.setResidentsNames(names);

        scanner.close();

        System.out.print("\nHouse details:" + "\nFloors: " + house.getFloorsNumber() + "\nAddress: " +
                house.getAddress() + "\nResidents: ");

        for (String name : house.getResidentsNames()) {
            System.out.print(name + ",");
        }
    }
}