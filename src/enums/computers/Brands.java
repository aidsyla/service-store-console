package enums.computers;

public enum Brands {
    APPLE("Apple"),
    ALIENWARE("Alienware"),
    ASUS("Asus"),
    ACER("Acer"),
    AOC("AOC"),
    BENQ("BenQ"),
    RAZER("Razer"),
    MICROSOFT_SURFACE("Microsoft Surface"),
    MSI("MSI"),
    LENOVO("Lenovo"),
    HP("Hp"),
    SAMSUNG("SAMSUNG"),
    DELL("Dell"),
    LG("LG");

    private final String str;

    Brands(String s) {
        str = s;
    }

    public String getBrand(){
        return str;
    }
}