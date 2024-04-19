package enums.computers;

public enum RepairReasonComputer {
    POWER_SUPPLY("The power supply is fried"),
    CPU("Processor is damaged"),
    GRAPHICS_CARD("Needs a better graphic card"),
    FAN("Fan malfunctioned"),
    MOTHERBOARD("Motherboard fried"),
    RAM("Ram memory failed"),
    HDD("Hard disk failed"),
    SSD("SSD failed"),
    SCREEN("Broken screen"),
    GLASS("Cracked glass"),
    KEYBOARD("Keyboard not registering keys");

    private final String str;

    RepairReasonComputer(String s) {
        str = s;
    }

    public String getRepairReasonComputer(){
        return str;
    }
}