import java.util.ArrayList;
import java.util.Scanner;

public class LabRoom {

    //Variables
    protected String name;
    protected String openingHour;
    protected String closingHour;
    protected ArrayList<LabEquipmentUnit> equipments = new ArrayList<>();

    //Constructors

    public LabRoom(String name, String openingHour, String closingHour) {
        this.name = name;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpeningHour() {
        return openingHour;
    }

    public void setOpeningHour(String openingHour) {
        this.openingHour = openingHour;
    }

    public String getClosingHour() {
        return closingHour;
    }

    public void setClosingHour(String closingHour) {
        this.closingHour = closingHour;
    }

    //Requires the user to enter each value of LabEquipmentUnit class's attribute, then uses LabEquipmentUnit class's initialization constructor to create a new object and add the new object to the equipment list.
    public void addRoomEquipment() {
        Scanner scanner = new Scanner(System.in);
        String newName, newUnit, newCurrency, newNotes;
        int newAmount;
        double newCostPerUnit;

        System.out.println("Please enter the name of the equipment:");
        newName = scanner.nextLine();
        System.out.println("\nPlease enter the unit:");
        newUnit = scanner.nextLine();
        System.out.println("\nPlease enter the amount of the units:");
        newAmount = Integer.parseInt(scanner.nextLine());
        System.out.println("\nPlease enter the cost per unit:");
        newCostPerUnit = Double.parseDouble(scanner.nextLine());
        System.out.println("\nPlease enter the currency:");
        newCurrency = scanner.nextLine();
        System.out.println("\nPlease enter some notes about the equipment:");
        newNotes = scanner.nextLine();

        equipments.add(new LabEquipmentUnit(newName, newUnit, newAmount, newCostPerUnit, newCurrency, newNotes));
    }

    //Returns the sum of all equipment list's objects calculateValueOfAllUnits method's return values. (Call calculateValueOfAllUnits for each element in the equipment list and sum the returned values).
    public double calculateEquipmentCosts() {
        double sum = 0;
        for (LabEquipmentUnit equipment : equipments) {
            sum += equipment.calculateValueOfAllUnits();
        }
        return sum;
    }

    //Prints a formatted message containing all necessary information. May call a LabEquipmentUnit object's method gatherPrintableInfo.
    public void printInfo() {
        System.out.println(name);
        System.out.println(openingHour + " - " + closingHour);

        //foreach to show all the equipments of the room
        for (LabEquipmentUnit e : equipments) {
            e.gatherPrintableInfo();
        }
        System.out.println("Total value of " + name + " equipment: " + calculateEquipmentCosts());
    }
}
