package models.mobilephones;

import enums.mobilephones.RepairReasonMobile;
import enums.mobilephones.Samsung_Model;
import enums.Status;
import enums.mobilephones.iPhone_Model;

public class test {
    public static void main(String[] args) {
        iPhone iPhone7 = new iPhone(1,Status.DAMAGED, RepairReasonMobile.BATTERY, iPhone_Model.IPHONE_8);
        System.out.println(iPhone7.toString());
        Samsung SamsungS10 = new Samsung(2,Status.REPAIRED, RepairReasonMobile.SCREEN, Samsung_Model.SAMSUNG_GALAXY_S10);
        System.out.println(SamsungS10.toString());

        iPhone7.costAmount();
        SamsungS10.costAmount();
    }
}