package models.computers;

import enums.Status;
import enums.computers.Brands;
import enums.computers.RepairReasonComputer;

public class Laptop extends Computer {

    private String cpu;
    private String graphicsCard;
    private String ram;
    private String storage;
    private String refreshRate;

    public Laptop(int ID, Status status, RepairReasonComputer repairReason, Brands brands, String cpu, String graphicsCard, String ram, String storage, String refreshRate) {
        super(ID, status, repairReason, brands);
        this.cpu = cpu;
        this.graphicsCard = graphicsCard;
        this.ram = ram;
        this.storage = storage;
        this.refreshRate = refreshRate;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------------------------------------------------" + "\n" +
                brands.getBrand() + " laptop with " + cpu + " CPU, " + graphicsCard + " graphics card, with "
                + storage + " storage and " + refreshRate + " refresh rate." + "\n" +
                "Status of device is: " + status.getStatusName() + "\n" + repairReason.getRepairReasonComputer() + "\n" +
                "---------------------------------------------------------------------------------------------";
    }

    @Override
    public void isRepairable() {

    }

    @Override
    public void costAmount() {

    }
}
