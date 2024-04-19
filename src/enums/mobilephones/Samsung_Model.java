package enums.mobilephones;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public enum Samsung_Model {
    SAMSUNG_GALAXY_S10("Samsung Galaxy S10", LocalDate.of(2019, Month.FEBRUARY, 20),
            "Qualcomm SM8150 Snapdragon 855", "Octa-core 2x2.73 GHz", "6.1 inches",
            "1440 x 3040 pixels, 19:9 ratio",
            "Android 9.0 (Pie), upgradable to Android 12, One UI 4.1",
            "128GB 8GB RAM", 800, "USD", "Available"),

    SAMSUNG_GALAXY_S20("Samsung Galaxy S20", LocalDate.of(2020, Month.FEBRUARY, 11),
            "Exynos 990 (7 nm+)",
            "Octa-core 2x2.73 GHz", "6.2 inches", "1440 x 3200 pixels, 20:9 ratio",
            "Android 10, upgradable to Android 11, One UI 3.0", "128GB 8GB RAM",
            850, "USD", "Available"),

    SAMSUNG_GALAXY_S22("Samsung Galaxy S22", LocalDate.of(2022, Month.FEBRUARY, 9),
            "Qualcomm SM8450 Snapdragon 8 Gen 1 (4 nm)",
            "Octa-core 1x2.8 GHz & 3x2.50 GHz & 4x1.8 GHz",
            "6.1 inches", "1080 x 2340 pixels, 19.5:9 ratio",
            "Android 12, One UI 4.1", "256GB 8GB RAM", 1000, "EUR",
            "Available");

    private static final Map<String, Samsung_Model> BY_LABEL = new HashMap<>();
    private static final Map<String, Samsung_Model> BY_LAUNCH_DATE = new HashMap<>();
    private static final Map<String, Samsung_Model> BY_CHIPSET = new HashMap<>();
    private static final Map<String, Samsung_Model> BY_CPU = new HashMap<>();
    private static final Map<String, Samsung_Model> BY_SIZE = new HashMap<>();
    private static final Map<String, Samsung_Model> BY_RESOLUTION = new HashMap<>();
    private static final Map<String, Samsung_Model> BY_OS = new HashMap<>();
    private static final Map<String, Samsung_Model> BY_RAM = new HashMap<>();
    private static final Map<Integer, Samsung_Model> BY_PRICE = new HashMap<>();
    private static final Map<String, Samsung_Model> BY_CURRENCY = new HashMap<>();
    private static final Map<String, Samsung_Model> BY_STATUS = new HashMap<>();

    static {
        for (Samsung_Model e : values()) {
            BY_LABEL.put(e.label, e);
            BY_LAUNCH_DATE.put(String.valueOf(e.launchDate), e);
            BY_CHIPSET.put(e.chipset, e);
            BY_CPU.put(e.cpu, e);
            BY_SIZE.put(e.size, e);
            BY_RESOLUTION.put(e.resolution, e);
            BY_OS.put(e.os, e);
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
    public final String os;
    public final String ram;
    public final int price;
    public final String currency;
    public final String status;


    Samsung_Model(String label, LocalDate launchDate, String chipset, String cpu, String size, String resolution, String os,
                  String ram, int price, String currency, String status) {
        this.label = label;
        this.launchDate = launchDate;
        this.chipset = chipset;
        this.cpu = cpu;
        this.size = size;
        this.resolution = resolution;
        this.os = os;
        this.ram = ram;
        this.price = price;
        this.currency = currency;
        this.status = status;
    }

    @Override
    public String toString() {
        return label + " announced on " + launchDate + " with " + cpu + "CPU" + " and a size of " + size;
    }
}