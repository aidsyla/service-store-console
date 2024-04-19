package models.computers;

import enums.Status;
import enums.computers.Brands;
import enums.computers.RepairReasonComputer;
import models.ElectronicDevice;

public abstract class Computer extends ElectronicDevice {

    protected RepairReasonComputer repairReason;
    protected Brands brands;

    public Computer(int ID, Status status, RepairReasonComputer repairReason, Brands brands) {
        super(ID, status);
        this.repairReason = repairReason;
        this.brands = brands;
    }

    public RepairReasonComputer getRepairReason() {
        return repairReason;
    }

    public void setRepairReason(RepairReasonComputer repairReason) {
        this.repairReason = repairReason;
    }

    public Brands getBrands() {
        return brands;
    }

    public void setBrands(Brands brands) {
        this.brands = brands;
    }
}