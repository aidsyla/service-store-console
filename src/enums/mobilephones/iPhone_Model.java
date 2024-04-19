package enums.mobilephones;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public enum iPhone_Model {

    IPHONE_7("iPhone 7", LocalDate.of(2016, Month.SEPTEMBER, 07), "Apple A10 Fusion (16 nm)",
            "Quad-core 2.34 GHz", "4.7 inches, 60.9 cm2", "750 x 1334 pixels, 16:9 ratio",
            "iOS 10.0.1, upgradable to iOS 15.5", "32GB 2GB RAM, 128GB 2GB RAM, 256GB 2GB RAM",
            600, "USD", "Discontinued"),

    IPHONE_8("iPhone 8", LocalDate.of(2017, Month.SEPTEMBER, 12), "Apple A11 Bionic (10 nm)",
            "Hexa-core (2x Monsoon + 4x Mistral)", "4.7 inches", "750 x 1334 pixels, 16:9 ratio",
            "iOS 11, up to iOS 15.5, planned upgrade to iOS 16", "64GB 2GB RAM",
            500, "USD", "Available"),

    IPHONE_X("iPhone X", LocalDate.of(2017,Month.SEPTEMBER, 12), "Apple A11 Bionic (10 nm)",
            "Hexa-core 2.39 GHz (2x Monsoon + 4x Mistral)", "5.8 inches","1125 x 2436 pixels, 19.5:9 ratio",
            "iOS 11.1.1, up to iOS 15.5, planned upgrade to iOS 16", "64GB 3GB RAM", 600,
            "USD", "Available");

    private static final Map<String, iPhone_Model> BY_LABEL = new HashMap<>();
    private static final Map<String, iPhone_Model> BY_LAUNCH_DATE = new HashMap<>();
    private static final Map<String, iPhone_Model> BY_CHIPSET = new HashMap<>();
    private static final Map<String, iPhone_Model> BY_CPU = new HashMap<>();
    private static final Map<String, iPhone_Model> BY_SIZE = new HashMap<>();
    private static final Map<String, iPhone_Model> BY_RESOLUTION = new HashMap<>();
    private static final Map<String, iPhone_Model> BY_iOS = new HashMap<>();
    private static final Map<String, iPhone_Model> BY_RAM = new HashMap<>();
    private static final Map<Integer, iPhone_Model> BY_PRICE = new HashMap<>();
    private static final Map<String, iPhone_Model> BY_CURRENCY = new HashMap<>();
    private static final Map<String, iPhone_Model> BY_STATUS = new HashMap<>();

    static {
        for (iPhone_Model e : values()) {
            BY_LABEL.put(e.label, e);
            BY_LAUNCH_DATE.put(String.valueOf(e.launchDate), e);
            BY_CHIPSET.put(e.chipset, e);
            BY_CPU.put(e.cpu, e);
            BY_SIZE.put(e.size, e);
            BY_RESOLUTION.put(e.resolution, e);
            BY_iOS.put(e.ios, e);
            BY_RAM.put(e.ram, e);
            BY_PRICE.put(e.price, e);
            BY_CURRENCY.put(e.currency, e);
            BY_STATUS.put(e.status, e);
        }
    }

    public final String label;
    public final LocalDate launchDate;
    public final String chipset;
    public final String cpu;
    public final String size;
    public final String resolution;
    public final String ios;
    public final String ram;
    public final int price;
    public final String currency;
    public final String status;


    iPhone_Model(String label, LocalDate launchDate, String chipset, String cpu, String size, String resolution, String ios,
                 String ram, int price, String currency, String status) {
        this.label = label;
        this.launchDate = launchDate;
        this.chipset = chipset;
        this.cpu = cpu;
        this.size = size;
        this.resolution = resolution;
        this.ios = ios;
        this.ram = ram;
        this.price = price;
        this.currency = currency;
        this.status = status;
    }

    public static iPhone_Model valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label + " announced on " + launchDate + " with " + cpu + "CPU" + " and a size of " + size;
    }
}