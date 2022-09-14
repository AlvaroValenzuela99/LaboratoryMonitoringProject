import java.util.ArrayList;
import java.util.Scanner;
public class Laboratory {
    static ArrayList<LabRoom> labRooms = new ArrayList<>();
    //Main method
    public static void main(String[] args) {
        welcomeScreen();
    }

    //To print the welcome message - the list of options that user can select to view lab room information, add a lab room or add more equipment;
    public static void welcomeScreen(){
        Scanner scanner = new Scanner(System.in);
        int firstOption;
        String secondOption;
        String openingHour;
        String closingHour;
        int thirdOption;

        System.out.println("Welcome to the Laboratory Monitoring!");
        System.out.println("\n1. View lab room information");
        System.out.println("2. Add a lab room");
        System.out.println("3. Add more equipment");
        System.out.print(("\nType the option here: "));
        firstOption = scanner.nextInt();

        //If user chooses to view lab room information
        if (firstOption == 1){
            printRoomInfo();

            System.out.println("Press ENTER to go back to the Main Page");
            new Scanner(System.in).nextLine();
            welcomeScreen();
        }

        //If user chooses to add a lab room
        else if (firstOption == 2){
            addRoom();

            System.out.println("Press ENTER to go back to the Main Page");
            new Scanner(System.in).nextLine();
            welcomeScreen();
        }

        //If user chooses to add more equipment
        else if (firstOption == 3){
            addEquipment();

            System.out.println("Press ENTER to go back to the Main Page");
            new Scanner(System.in).nextLine();
            welcomeScreen();
        }

        //If user chooses an invalid option
        else {
            System.out.println("PLEASE ENTER A VALID OPTION!");
            welcomeScreen();
        }
    }

    //At first, it prints all names of labRooms list, then after the user will select one of the listed lab rooms, more detailed room information gets printed by calling LabRoom class's method printInfo;
    public static void printRoomInfo(){
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        int optionChosen;

        //A list of all the rooms appears
        System.out.println("Select a laboratory room to view:\n");
        for (LabRoom l : labRooms) {
            System.out.println(i + ". " + l.name);
            i++;
        }

        //The user has to choose one of them to show the info
        optionChosen = scanner.nextInt();
        labRooms.get(optionChosen-1).printInfo();
    }

    //Retrieves data from the user to create a new LabRoom object (you can create a new LabRoom object using initialization constructor by passing to it the entered values) and add it to the labRooms list. Calls the welcomeScreen method after the new room has been created and added to the list;
    public static void addRoom(){

        //User is asked to enter the values of the new room
        Scanner scanner = new Scanner(System.in);
        String newName, newOpeningHour, newClosingHour;
        System.out.println("Please enter the name of the laboratory room:");
        newName = scanner.nextLine();
        System.out.println("Please enter the opening hour:");
        newOpeningHour = scanner.nextLine();
        System.out.println("Please enter the closing hour:");
        newClosingHour = scanner.nextLine();

        //A new LabRoom object is created with the inputs
        labRooms.add(new LabRoom(newName, newOpeningHour, newOpeningHour));
        System.out.println("New lab room added successfully!");
    }

    //First a numbered list of all available LabRoom objects gets printed. After the user selects the room to which equipment will be added, the addRoomEquipment method for the selected object may be called. Calls the welcomeScreen method after new equipment has been added.
    public static void addEquipment(){
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        int optionChosen;

        //A list of all the rooms appears
        System.out.println("Select a laboratory room:\n");
        for (LabRoom l : labRooms) {
            System.out.println(i + ". " + l.name);
            i++;
        }

        //The user has to choose one of them to add the equipment
        optionChosen = scanner.nextInt();
        labRooms.get(optionChosen-1).addRoomEquipment();

        welcomeScreen();
    }
}
