package enums.mobilephones;

public enum RepairReasonMobile {
    GLASS("The glass is broken"),
    SCREEN("The screen is damaged"),
    CHARGING_PORT("The charging port doesn't work"),
    BATTERY("Battery lost its full capacity"),
    F_CAMERA("Front camera does not work"),
    B_CAMERA("Back camera(s) do not work"),
    TOUCHSCREEN("Touchscreen is unresponsive"),
    SIDE_BUTTONS("Side buttons do not work");

    private final String repairName;

    RepairReasonMobile(String s) {
        repairName = s;
    }

    public String getRepairName() {
        return repairName;
    }
}