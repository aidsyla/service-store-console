package repositories;

import exceptions.NotFoundException;
import interfaces.repository.CrudRepository;
import models.ElectronicDevice;
import models.computers.Laptop;
import models.computers.Monitor;
import models.computers.PC;
import models.mobilephones.MobilePhone;

import java.util.ArrayList;

public class DeviceRepository implements CrudRepository<MobilePhone, Laptop, PC, Monitor> {
    private ArrayList<ElectronicDevice> electronicDevices = new ArrayList<>();


    @Override
    public void addPhone(MobilePhone mobilePhone) {
        electronicDevices.add(mobilePhone);
    }

    @Override
    public void addLaptop(Laptop laptop) {
        electronicDevices.add(laptop);
    }

    @Override
    public void addPC(PC pc) {
        electronicDevices.add(pc);
    }

    @Override
    public void addMonitor(Monitor monitor) {
        electronicDevices.add(monitor);
    }

    @Override
    public MobilePhone selectPhone(int id) throws NotFoundException {
        for(ElectronicDevice electronicDevice : electronicDevices){
            if (electronicDevice.getID_Device() == id) {
                return (MobilePhone) electronicDevice;
            }
        }
        throw new NotFoundException("Cannot find");
    }

    @Override
    public Laptop selectLaptop(int id) throws NotFoundException {
        for(ElectronicDevice electronicDevice : electronicDevices){
            if (electronicDevice.getID_Device() == id) {
                return (Laptop) electronicDevice;
            }
        }
        throw new NotFoundException("Cannot find");
    }

    @Override
    public PC selectPC(int id) throws NotFoundException {
        for(ElectronicDevice electronicDevice : electronicDevices){
            if (electronicDevice.getID_Device() == id) {
                return (PC) electronicDevice;
            }
        }
        throw new NotFoundException("Cannot find");
    }

    @Override
    public Monitor selectMonitor(int id) throws NotFoundException {
        for(ElectronicDevice electronicDevice : electronicDevices){
            if (electronicDevice.getID_Device() == id) {
                return (Monitor) electronicDevice;
            }
        }
        throw new NotFoundException("Cannot find");
    }
}