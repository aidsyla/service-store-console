package models.mobilephones;

import enums.mobilephones.RepairReasonMobile;
import enums.mobilephones.Samsung_Model;
import enums.Status;

public class Samsung extends MobilePhone {
    private Samsung_Model Samsung;

    public Samsung(int ID, Status status, RepairReasonMobile repairReason, Samsung_Model samsung) {
        super(ID, status, repairReason);
        Samsung = samsung;
    }

    @Override
    public String toString() {
        return "---------------------------------------------------------------------------------------------" + "\n" +
                Samsung + "\n" + "Status of device is: " + status.getStatusName() + "\n" + repairReason.getRepairName() + "\n" +
                "---------------------------------------------------------------------------------------------" + "\n";
    }

    @Override
    public void isRepairable() {

    }

    @Override
    public void costAmount() {
        if (getRepairReason()==RepairReasonMobile.SCREEN) {
            System.out.println("Repair will cost 200 dollars");
        } else {
            System.out.println("Repair will be unknown amount of dollars");
        }
    }
}