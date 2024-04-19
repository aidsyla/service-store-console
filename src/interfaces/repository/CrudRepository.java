package interfaces.repository;

import exceptions.NotFoundException;

public interface CrudRepository<MobilePhone, Laptop, PC, Monitor> {

    void addPhone(MobilePhone phone);

    void addLaptop(Laptop laptop);

    void addPC(PC pc);

    void addMonitor(Monitor monitor);


    MobilePhone selectPhone(int id) throws NotFoundException;

    Laptop selectLaptop(int id) throws NotFoundException;

    PC selectPC(int id) throws NotFoundException;

    Monitor selectMonitor(int id) throws NotFoundException;

}