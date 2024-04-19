package enums;

public enum Status {
    REPAIRED("Repaired"),
    DAMAGED("Damaged");

    private final String statusName;

    Status(String s){
        statusName = s;
    }

    public String getStatusName() {
        return statusName;
    }
}