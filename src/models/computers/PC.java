package models.computers;

import enums.Status;
import enums.computers.Brands;
import enums.computers.RepairReasonComputer;

public class PC extends Computer {

    private String motherboard;
    private String cpu;
    private String graphicsCard;
    private int numberOfFans;
    private String ram;
    private String storage;
    private String pcCase;

    public PC(int ID, Status status, RepairReasonComputer repairReason, Brands brands,
              String motherboard, String cpu, String graphicsCard, int numberOfFans,
              String ram, String storage, String pcCase) {
        super(ID, status, repairReason, brands);
        this.motherboard = motherboard;
        this.cpu = cpu;
        this.graphicsCard = graphicsCard;
        this.numberOfFans = numberOfFans;
        this.ram = ram;
        this.storage = storage;
        this.pcCase = pcCase;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public int getNumberOfFans() {
        return numberOfFans;
    }

    public void setNumberOfFans(int numberOfFans) {
        this.numberOfFans = numberOfFans;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getPcCase() {
        return pcCase;
    }

    public void setPcCase(String pcCase) {
        this.pcCase = pcCase;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------------------------------------------------" + "\n" +
                brands.getBrand() + " PC with " + motherboard + " motherboard, with " + cpu + " CPU, " + graphicsCard + " graphics card, with "
                + numberOfFans + " number of fans, with " + ram + ", " + storage + " storage and " + pcCase + " PC Case." + "\n" +
                "Status of device is: " + status.getStatusName() + "\n" + repairReason.getRepairReasonComputer() + "\n" +
                "---------------------------------------------------------------------------------------------";
    }

    @Override
    public void isRepairable() {
        if (getStatus()==Status.DAMAGED){
            if (getRepairReason()==RepairReasonComputer.POWER_SUPPLY){
                System.out.printf("%nCannot repair PC, needs a whole replacement%n");
            } else {
                System.out.printf("%nPc can be repaired%n");
            }
        } else {
            System.out.printf("%nPC is already repaired%n");
        }
    }

    @Override
    public void costAmount() {

    }
}