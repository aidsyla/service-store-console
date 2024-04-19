import enums.Status;
import enums.computers.Brands;
import enums.computers.RepairReasonComputer;
import enums.mobilephones.RepairReasonMobile;
import enums.mobilephones.Samsung_Model;
import enums.mobilephones.iPhone_Model;
import models.ElectronicDevice;
import models.computers.Laptop;
import models.computers.Monitor;
import models.computers.PC;
import models.mobilephones.MobilePhone;
import models.mobilephones.Samsung;
import models.mobilephones.iPhone;
import repositories.DeviceRepository;
import exceptions.NotFoundException;

import java.util.Scanner;

public class ServiceStoreConsole {

    public static DeviceRepository repository = new DeviceRepository();

    public static void main(String[] args) throws NotFoundException {

        Scanner reader = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("Welcome to the store, choose your device%n" +
                "1. Mobile Phone%n" +
                "2. Laptop%n" +
                "3. PC%n" +
                "4. Monitor%n" +
                "5. View device%n" +
                "6. I want to exit!%n");
        System.out.println("---------------------------------------------------------------------------------------------");

        String choice = reader.nextLine();

        while (!choice.equals(6)) {
            switch (choice) {
                case "1":
                    phone(reader);
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.printf("Welcome to the store, choose your device%n" +
                            "1. Mobile Phone%n" +
                            "2. Laptop%n" +
                            "3. PC%n" +
                            "4. Monitor%n" +
                            "5. View device%n" +
                            "6. I want to exit!%n");
                    System.out.println("---------------------------------------------------------------------------------------------");
                    choice = reader.nextLine();
                    break;
                case "2":
                    laptop(reader);
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.printf("Welcome to the store, choose your device%n" +
                            "1. Mobile Phone%n" +
                            "2. Laptop%n" +
                            "3. PC%n" +
                            "4. Monitor%n" +
                            "5. View device%n" +
                            "6. I want to exit!%n");
                    System.out.println("---------------------------------------------------------------------------------------------");
                    choice = reader.nextLine();
                    break;
                case "3":
                    pc(reader);
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.printf("Welcome to the store, choose your device%n" +
                            "1. Mobile Phone%n" +
                            "2. Laptop%n" +
                            "3. PC%n" +
                            "4. Monitor%n" +
                            "5. View device%n" +
                            "6. I want to exit!%n");
                    System.out.println("---------------------------------------------------------------------------------------------");
                    choice = reader.nextLine();
                    break;
                case "4":
                    monitor(reader);
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.printf("Welcome to the store, choose your device%n" +
                            "1. Mobile Phone%n" +
                            "2. Laptop%n" +
                            "3. PC%n" +
                            "4. Monitor%n" +
                            "5. View device%n" +
                            "6. I want to exit!%n");
                    System.out.println("---------------------------------------------------------------------------------------------");
                    choice = reader.nextLine();
                    break;
                case "5":
                    viewDevice(reader);
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.printf("Welcome to the store, choose your device%n" +
                            "1. Mobile Phone%n" +
                            "2. Laptop%n" +
                            "3. PC%n" +
                            "4. Monitor%n" +
                            "5. View device%n" +
                            "6. I want to exit!%n");
                    System.out.println("---------------------------------------------------------------------------------------------");
                    choice = String.valueOf(reader.nextInt());
                    reader.nextLine();
                    break;
                case "6":
                    throw new RuntimeException("Goodbye");
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }
        }
    }

    private static void phone(Scanner reader) {
        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "What phone do you have?%n" +
                        "1. iPhone%n" +
                        "2. Samsung%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String phoneType = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter an ID for your mobile device(any number):%n" +
                        "---------------------------------------------------------------------------------------------%n");
        int id = reader.nextInt();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Please make sure you type your device status correctly as it is case sensitive%n" +
                        "Enter device status:%n" +
                        "DAMAGED, REPAIRED%n" +
                        "---------------------------------------------------------------------------------------------%n");
        reader.nextLine();
        Status status = Status.valueOf(reader.nextLine());

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Please make sure you type the reason your device is damaged correctly as it is case sensitive%n" +
                        "Enter damage reason:%n" +
                        "GLASS, SCREEN, CHARGING_PORT, BATTERY, F_CAMERA, B_CAMERA, TOUCHSCREEN, SIDE_BUTTONS%n" +
                        "---------------------------------------------------------------------------------------------%n");
        RepairReasonMobile repairReason = RepairReasonMobile.valueOf(reader.nextLine());

        switch (phoneType) {
            case "1" -> {
                System.out.printf(
                        "---------------------------------------------------------------------------------------------%n" +
                                "Please make sure you type your iPhone model correctly as it is case sensitive%n" +
                                "Enter phone model:%n" +
                                "IPHONE_7, IPHONE_8, IPHONE_X%n" +
                                "---------------------------------------------------------------------------------------------%n");
                iPhone_Model iphoneModel = iPhone_Model.valueOf(reader.nextLine());
                ElectronicDevice bruh = new iPhone(id, status, repairReason, iphoneModel);
                bruh.costAmount();
                bruh.isRepairable();
                repository.addPhone((MobilePhone) bruh);
            }
            case "2" -> {
                System.out.printf(
                        "---------------------------------------------------------------------------------------------%n" +
                                "Please make sure you type your Samsung Model correctly as it is case sensitive%n" +
                                "Enter phone model:%n" +
                                "SAMSUNG_GALAXY_S10, SAMSUNG_GALAXY_S20, SAMSUNG_GALAXY_S22%n" +
                                "---------------------------------------------------------------------------------------------%n");
                Samsung_Model samsungModel = Samsung_Model.valueOf(reader.nextLine());
                ElectronicDevice bruh = new Samsung(id, status, repairReason, samsungModel);
                repository.addPhone((MobilePhone) bruh);
            }
            default -> throw new RuntimeException("Wrong");
        }
    }

    private static void laptop(Scanner reader) {
        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter an ID for your laptop device(any number):%n" +
                        "---------------------------------------------------------------------------------------------%n");
        int id = reader.nextInt();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Please make sure you type your device status correctly as it is case sensitive%n" +
                        "Enter device status:%n" +
                        "DAMAGED, REPAIRED%n" +
                        "---------------------------------------------------------------------------------------------%n");
        reader.nextLine();
        Status status = Status.valueOf(reader.nextLine());

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Please make sure you type the reason your device is damaged correctly as it is case sensitive%n" +
                        "Enter damage reason:%n" +
                        "POWER_SUPPLY, CPU, GRAPHICS_CARD, FAN, MOTHERBOARD, RAM, HDD, SSD, SCREEN, GLASS, KEYBOARD%n" +
                        "---------------------------------------------------------------------------------------------%n");
        RepairReasonComputer repairReason = RepairReasonComputer.valueOf(reader.nextLine());

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Please make sure you type the brand correctly as it is case sensitive%n" +
                        "Enter your device brand:%n" +
                        "APPLE, ALIENWARE, ASUS, ACER, AOC, BENQ, RAZER, MICROSOFT_SURFACE%n" +
                        "MSI, LENOVO, HP, SAMSUNG, DELL, HP%n" +
                        "---------------------------------------------------------------------------------------------%n");
        Brands brands = Brands.valueOf(reader.nextLine());

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your CPU information%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String cpu = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your graphics card%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String gpu = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your RAM%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String ram = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your storage%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String storage = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your refresh rate%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String refreshRate = reader.nextLine();

        ElectronicDevice laptop = new Laptop(id, status, repairReason, brands, cpu, gpu, ram, storage, refreshRate);
        repository.addLaptop((Laptop) laptop);
    }

    private static void monitor(Scanner reader) {
        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter an ID for your monitor device(any number):%n" +
                        "---------------------------------------------------------------------------------------------%n");
        int id = reader.nextInt();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Please make sure you type your device status correctly as it is case sensitive%n" +
                        "Enter device status:%n" +
                        "DAMAGED, REPAIRED%n" +
                        "---------------------------------------------------------------------------------------------%n");
        reader.nextLine();
        Status status = Status.valueOf(reader.nextLine());

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Please make sure you type the reason your device is damaged correctly as it is case sensitive%n" +
                        "Enter damage reason:%n" +
                        "POWER_SUPPLY, CPU, GRAPHICS_CARD, FAN, MOTHERBOARD, RAM, HDD, SSD, SCREEN, GLASS, KEYBOARD%n" +
                        "---------------------------------------------------------------------------------------------%n");
        RepairReasonComputer repairReason = RepairReasonComputer.valueOf(reader.nextLine());

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Please make sure you type the brand correctly as it is case sensitive%n" +
                        "Enter your device brand:%n" +
                        "APPLE, ALIENWARE, ASUS, ACER, AOC, BENQ, RAZER, MICROSOFT_SURFACE%n" +
                        "MSI, LENOVO, HP, SAMSUNG, DELL, HP%n" +
                        "---------------------------------------------------------------------------------------------%n");
        Brands brands = Brands.valueOf(reader.nextLine());

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your monitor color accuracy%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String color = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your brightness%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String bright = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your refresh rate%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String refreshRate = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your monitor size%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String size = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your monitor resolution%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String resolution = reader.nextLine();

        ElectronicDevice monitor = new Monitor(id, status, repairReason, brands, color, bright, refreshRate, size, resolution);
        repository.addMonitor((Monitor) monitor);
    }

    private static void pc(Scanner reader) {
        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter an ID for your PC device(any number):%n" +
                        "---------------------------------------------------------------------------------------------%n");
        int id = reader.nextInt();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Please make sure you type your device status correctly as it is case sensitive%n" +
                        "Enter device status:%n" +
                        "DAMAGED, REPAIRED%n" +
                        "---------------------------------------------------------------------------------------------%n");
        reader.nextLine();
        Status status = Status.valueOf(reader.nextLine());

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Please make sure you type the reason your device is damaged correctly as it is case sensitive%n" +
                        "Enter damage reason:%n" +
                        "POWER_SUPPLY, CPU, GRAPHICS_CARD, FAN, MOTHERBOARD, RAM, HDD, SSD, SCREEN, GLASS, KEYBOARD%n" +
                        "---------------------------------------------------------------------------------------------%n");
        RepairReasonComputer repairReason = RepairReasonComputer.valueOf(reader.nextLine());

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Please make sure you type the brand correctly as it is case sensitive%n" +
                        "Enter your device brand:%n" +
                        "APPLE, ALIENWARE, ASUS, ACER, AOC, BENQ, RAZER, MICROSOFT_SURFACE%n" +
                        "MSI, LENOVO, HP, SAMSUNG, DELL, HP%n" +
                        "---------------------------------------------------------------------------------------------%n");
        Brands brands = Brands.valueOf(reader.nextLine());

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your motherboard information%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String motherboard = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your CPU information%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String cpu = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your graphics card%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String gpu = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter the number of your fans%n" +
                        "---------------------------------------------------------------------------------------------%n");
        int fans = reader.nextInt();
        reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your RAM%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String ram = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your storage%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String storage = reader.nextLine();

        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "Enter your PC Case%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String pcCase = reader.nextLine();

        ElectronicDevice pc = new PC(id, status, repairReason, brands, motherboard, cpu, gpu, fans, ram, storage, pcCase);
        pc.isRepairable();
        repository.addPC((PC) pc);
    }

    private static void viewDevice(Scanner reader) throws NotFoundException {
        System.out.printf(
                "---------------------------------------------------------------------------------------------%n" +
                        "What type of device do you want to search?%n" +
                        "1. Phone%n2. Laptop%n3. PC%n4. Monitor%n" +
                        "---------------------------------------------------------------------------------------------%n");
        String choice = reader.nextLine();
        switch (choice) {
            case "1" -> {
                System.out.printf(
                        "---------------------------------------------------------------------------------------------%n" +
                                "Write your device ID:%n" +
                                "---------------------------------------------------------------------------------------------%n");
                int idSelection = reader.nextInt();

                System.out.println(repository.selectPhone(idSelection));
            }
            case "2" -> {
                System.out.printf(
                        "---------------------------------------------------------------------------------------------%n" +
                                "Write your device ID:%n" +
                                "---------------------------------------------------------------------------------------------%n");
                int idSelection = reader.nextInt();

                System.out.println(repository.selectLaptop(idSelection));
            }
            case "3" -> {
                System.out.printf(
                        "---------------------------------------------------------------------------------------------%n" +
                                "Write your device ID:%n" +
                                "---------------------------------------------------------------------------------------------%n");
                int idSelection = reader.nextInt();

                System.out.println(repository.selectPC(idSelection));
            }
            case "4" -> {
                System.out.printf(
                        "---------------------------------------------------------------------------------------------%n" +
                                "Write your device ID:%n" +
                                "---------------------------------------------------------------------------------------------%n");
                int idSelection = reader.nextInt();

                System.out.println(repository.selectMonitor(idSelection));
            }
            default -> throw new RuntimeException("Wrong input");
        }
    }
}