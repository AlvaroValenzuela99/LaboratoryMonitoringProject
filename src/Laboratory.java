public class Laboratory {
    //Variables
    String labRooms;

    //Methods
    //Main method
    public static void main(String[] args) {


        //To print the welcome message - the list of options that user can select to view lab room information, add a lab room or add more equipment;
        public void welcomeScreen(){
            System.out.println("Welcome to the Laboratory Monitoring!");
            System.out.println("Choose between one of the following options:");
            System.out.println("1. View lab room information");
            System.out.println("2. Add a lab room");
            System.out.println("3. Add more equipment");
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
}
