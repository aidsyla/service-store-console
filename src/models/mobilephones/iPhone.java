package models.mobilephones;

import enums.Status;
import enums.mobilephones.iPhone_Model;
import enums.mobilephones.RepairReasonMobile;

public class iPhone extends MobilePhone {
    private iPhone_Model iPhone;

    public iPhone(int ID, Status status, RepairReasonMobile repairReason, iPhone_Model iPhone) {
        super(ID, status, repairReason);
        this.iPhone = iPhone;
    }

    public iPhone(int ID, Status status, RepairReasonMobile repairReason) {
        super(ID, status, repairReason);
    }

    public iPhone(){
        super();
    }

    public iPhone(int id) {

    }

    public iPhone_Model getiPhone() {
        return iPhone;
    }

    public void setiPhone(iPhone_Model iPhone) {
        this.iPhone = iPhone;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------------------------------------------------" + "\n" +
                iPhone + "\n" + "Status of device is: " + status.getStatusName() + "\n" + repairReason.getRepairName() + "\n" +
                "---------------------------------------------------------------------------------------------" + "\n";
    }

    @Override
    public void isRepairable() {
        if (getStatus() == Status.DAMAGED) {
            if (getRepairReason() == RepairReasonMobile.B_CAMERA || getRepairReason() == RepairReasonMobile.F_CAMERA) {
                System.out.printf("%nRepair is not possible, needs replacement%n");
            } else {
                System.out.printf("%nRepair is possible for reason: %s%n", getRepairReason());
            }
        } else {
            System.out.printf("%nPhone %s is already repaired%n", iPhone.label);
        }
    }

    @Override
    public void costAmount() {
        if (getStatus() == Status.DAMAGED) {
            if (getRepairReason() == RepairReasonMobile.BATTERY) {
                System.out.printf("%nRepair of %s will cost 50 dollars%n", iPhone.label);
            } else {
                System.out.printf("%nRepair will be unknown amount of dollars for reason: %s%n", repairReason.getRepairName());
            }
        } else {
            System.out.printf("%nNo cost%n");
        }
    }
}