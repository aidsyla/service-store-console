package models;

import enums.Status;
import interfaces.Costable;
import interfaces.Repairable;

public abstract class ElectronicDevice implements Repairable, Costable {
    private int ID_Device;
    protected Status status;

    public ElectronicDevice(int ID, Status status) {
        this.ID_Device = ID;
        this.status = status;
    }

    public ElectronicDevice() {
    }

    public int getID_Device() {
        return ID_Device;
    }

    public void setID_Device(int ID_Device) {
        this.ID_Device = ID_Device;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}