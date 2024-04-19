package models.mobilephones;

import enums.mobilephones.RepairReasonMobile;
import enums.Status;
import models.ElectronicDevice;

public abstract class MobilePhone extends ElectronicDevice {
    protected RepairReasonMobile repairReason;

    public MobilePhone(int ID, Status status, RepairReasonMobile repairReason) {
        super(ID, status);
        this.repairReason = repairReason;
    }

    public MobilePhone(int ID, Status status) {
        super(ID, status);
    }

    public MobilePhone() {

    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public RepairReasonMobile getRepairReason() {
        return repairReason;
    }

    public void setRepairReason(RepairReasonMobile repairReason) {
        this.repairReason = repairReason;
    }
}