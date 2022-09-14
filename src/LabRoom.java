import java.util.ArrayList;
import java.util.Scanner;

public class LabRoom {

    //Variables
    private String name;
    private String openingHour;
    private String closingHour;
    private ArrayList<LabEquipmentUnit> equipments = new ArrayList<>();

    //Constructors
    public LabRoom(String name, String openingHour, String closingHour, ArrayList<LabEquipmentUnit> equipments) {
        this.name = name;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
        this.equipments = equipments;
    }

    //Requires the user to enter each value of LabEquipmentUnit class's attribute, then uses LabEquipmentUnit class's initialization constructor to create a new object and add the new object to the equipment list.
    public void addRoomEquipment(String newName, String newUnit, int newAmount, double newCostPerUnit, String newCurrency, String newNotes){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name of the equipment:");
        newName = scanner.nextLine();
        System.out.println("\nPlease enter the unit:");
        newUnit = scanner.nextLine();
        System.out.println("\nPlease enter the amount of the units:");
        newAmount = scanner.nextInt();
        System.out.println("\nPlease enter the cost per unit:");
        newCostPerUnit = scanner.nextDouble();
        System.out.println("\nPlease enter the currency:");
        newCurrency = scanner.nextLine();
        System.out.println("\nPlease enter some notes about the equipment:");
        newNotes = scanner.nextLine();

        equipments.add(new LabEquipmentUnit(newName, newUnit, newAmount, newCostPerUnit, newCurrency, newNotes));
    }
    //Returns the sum of all equipment list's objects calculateValueOfAllUnits method's return values. (Call calculateValueOfAllUnits for each element in the equipment list and sum the returned values).
    public double calculateEquipmentCosts(){

    }
    //Prints a formatted message containing all necessary information. May call a LabEquipmentUnit object's method gatherPrintableInfo.
    public void printInfo(){

    }
}
