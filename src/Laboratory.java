import java.util.Scanner;
public class Laboratory {

    //Main method
    public static void main(String[] args) {
        //Variables
        String[] labRooms;

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
            System.out.println("\nSelect a laboratory room to view:");

            welcomeScreen();
        }

        //If user chooses to add a lab room
        else if (firstOption == 2){
            System.out.println("\nEnter the name of the laboratory room:");
            secondOption = scanner.nextLine();

            System.out.println("Enter the opening hour:");
            openingHour = scanner.nextLine();
            System.out.println("Enter the closing hour");
            closingHour = scanner.nextLine();
            welcomeScreen();
        }

        //If user chooses to add more equipment
        else if (firstOption == 3){
            System.out.println("\nSelect a laboratory room:");
            thirdOption = scanner.nextInt();

            welcomeScreen();
        }

        //If user chooses an invalid option
        else {
            System.out.println("PLEASE ENTER A VALID OPTION!");
            welcomeScreen();
        }
    }

    //At first it prints all names of labRooms list, then after the user will select one of the listed lab rooms, more detailed room information gets printed by calling LabRoom class's method printInfo;
    public void printRoomInfo(){

    }

    //Retrieves data from the user to create a new LabRoom object (you can create a new LabRoom object using initialization constructor by passing to it the entered values) and add it to the labRooms list. Calls the welcomeScreen method after the new room has been created and added to the list;
    public void addRoom(){

    }

    //First a numbered list of all available LabRoom objects gets printed. After the user selects the room to which equipment will be added, the addRoomEquipment method for the selected object may be called. Calls the welcomeScreen method after new equipment has been added.
    public void addEquipment(){

    }
}
