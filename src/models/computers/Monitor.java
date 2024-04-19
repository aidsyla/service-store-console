package models.computers;

import enums.Status;
import enums.computers.Brands;
import enums.computers.RepairReasonComputer;

public class Monitor extends Computer {

    private String colorAccuracy;
    private String brightness;
    private String refreshRate;
    private String size;
    private String resolution;

    public Monitor(int ID, Status status, RepairReasonComputer repairReason, Brands brands, String colorAccuracy, String brightness, String refreshRate, String size, String resolution) {
        super(ID, status, repairReason, brands);
        this.colorAccuracy = colorAccuracy;
        this.brightness = brightness;
        this.refreshRate = refreshRate;
        this.size = size;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------------------------------------------------" + "\n" +
                brands.getBrand() + " Monitor with " + colorAccuracy + " color accuracy, " + brightness + " brightness, with "
                + refreshRate + " refresh rate, " + size + " size and a resolution of " +  resolution + "\n" +
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
