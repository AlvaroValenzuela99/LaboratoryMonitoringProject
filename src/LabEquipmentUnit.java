public class LabEquipmentUnit {
    //Variables
    protected String name;
    protected String unit;
    protected int amount;
    protected double costPerUnit;
    protected String currency;
    protected String notes;

    //Constructors
    public LabEquipmentUnit(String name, String unit, int amount, double costPerUnit, String currency, String notes) {
        this.name = name;
        this.unit = unit;
        this.amount = amount;
        this.costPerUnit = costPerUnit;
        this.currency = currency;
        this.notes = notes;
    }
    //Constructor without notes
    public LabEquipmentUnit(String name, String unit, int amount, double costPerUnit, String currency) {
        this.name = name;
        this.unit = unit;
        this.amount = amount;
        this.costPerUnit = costPerUnit;
        this.currency = currency;
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    //Calculates the cost of all units by multiplying amount of the equipment unit with cost per unit
    public double calculateValueOfAllUnits(){
        return amount * costPerUnit;
    }

    //Prepares and then returns information about equipment unit (like in the example: Screws | 1000 pcs. | EUR 15.60 | Size of the screw is 4.2x76mm).
    public void gatherPrintableInfo(){
        System.out.println(name + " | " + amount + " " + unit + " | " + currency + " " + calculateValueOfAllUnits() + " | " + notes);
    }

}
